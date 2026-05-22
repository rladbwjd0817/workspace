package com.green.legacy.controller;

import com.green.legacy.dto.BoardDTO;
import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.service.BoardService;
import com.green.legacy.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// boardController에 대한 객체 생성, 해당 클래스는 controller 역할임을 스프링에게 인지(비동기 미지원)

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
  private final BoardService boardService;
  private final ReplyService replyService;

   // @RequestMapping("/getList") => 조회, 등록, 삭제, 수정 전부 @RequestMapping 어노테이션 사용

  // 게시글 목록 페이지
  // url: 'boards/getList/'
  // controller에서 요청을 처리하는 메서드의 return 타입은 무조건 문자열
  // legacy 방식에서 리턴되는 정보는 보여질 html 파일명을 의미함.
  @RequestMapping("/getList")
  // 매개변수에 선언한 Model 인터페이스 객체는 데이터를 적재하는 역할
  // 컨트롤러의 메서드 매개변수에 dto 클래스를 전달받으면 객체를 알아서 생성
  // 이러한 객체를 커맨드객체라 부른다. 커맨드 객체는 자동으로 html로 전달됨
  // 커맨드 객체가 html로 전달될 때는 객체명이 아니라 클래스명에서 앞글자만 소문자로 바뀐채로 넘어감
  public String getList(@ModelAttribute BoardDTO boardDTO, Model model){
    // 전체 데이터 수 조회
    int totalBoardCnt = boardService.selectBoardCnt();
    boardDTO.setTotalDataCnt(totalBoardCnt);

    // 페이징 정보 세팅
    boardDTO.setPageInfo();

    // boardDTO 정보 출력
    System.out.println(boardDTO);

    List<BoardDTO> boardList = boardService.selectBoardList(boardDTO);

    model.addAttribute("boardList", boardList);


    //html 파일은 무조건 resources/templates 폴더 안에 위치
    return "board_list"; // 게시글 목록을 보여주는 html 파일명
  };

  // 글쓰기 페이지로 이동
  @RequestMapping("/go-write")
  public String goWrite(){
    return "reg_board";
  };

  // 글 쓰기 기능 실행
  // @ModelAttribute 클래스명 객체명
  // -> input 태그의 name 속성과 동일한 멤버변수를 가진 dto 클래스가 데이터 받음
  @RequestMapping("/write")
  public String write(@ModelAttribute BoardDTO boardDTO){
    System.out.println(boardDTO);

    // insert 쿼리 실행
    boardService.insertBoard(boardDTO);
    System.out.println("writer:" + boardDTO.getWriter());

    // 1) 게시글 목록을 조회 -> boardList라는 이름으로 전달
    // 2) '/boards/getList' 요청 실행

    // return에는 기본적으로 html 파일명을 작성
    // 추가적으로 html 파일명이 아니라, 컨트롤러의 다른 메서드를 호출
    // -> "redirect : 요청url" => controller에서 다른 controller를 실행할 때 씀
    return "reg_result"; // 게시글 등록 성공 여부에 따라 alert을 띄울 목적의 html
  };

  // @RequestParam 어노테이션 사용하면 데이터를 하나씩 받을 수 있음.
  @RequestMapping("/write2")
  public String write2(@RequestParam(name = "name") String name,
                       @RequestParam(name = "age") int age){

    System.out.println("name : " + name);
    System.out.println("age : " + age);
    return "";
  };

  // 상세 조회 페이지 이동
  @RequestMapping("/board_detail")
  public String detail(@RequestParam(name= "boardNum") int boardNum, Model model){
    System.out.println("boardNum - " + boardNum);

    // 상세 정보
    model.addAttribute("board", boardService.detailBoard(boardNum));

    // 댓글 목록
    model.addAttribute("replyList", replyService.selectReplyList(boardNum));

    return "board_detail";
  }

  // 게시글 삭제
  @RequestMapping("/delete")
  public String delete(@RequestParam(name="boardNum") int boardNum){
    System.out.println("삭제 글 번호:" + boardNum);

    boardService.deleteBoard(boardNum);
    return "delete_result";
  }

  // 수정페이지 이동
  @RequestMapping("/update-form")
  public String goUpdate(@RequestParam(name="boardNum") int boardNum, Model model){
    System.out.println("수정 글번호 : " + boardNum);

    // 게시글 상세 정보 조회
    BoardDTO boardDTO = boardService.detailBoard(boardNum);

    // 상세정보 html에 전달
    model.addAttribute("board", boardDTO);
    return "update_form";
  }

  @RequestMapping("/update")
  public String update(@ModelAttribute BoardDTO boardDTO){
    System.out.println(boardDTO);

    // 수정 쿼리 실행
    boardService.updateBoard(boardDTO);

    return "redirect:/boards/board_detail?boardNum=" + boardDTO.getBoardNum();
  }



}
