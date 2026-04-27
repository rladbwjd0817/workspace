package com.green.legacy.controller;

import com.green.legacy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// boardController에 대한 객체 생성, 해당 클래스는 controller 역할임을 스프링에게 인지(비동기 미지원)

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
  private final BoardService boardService;

   // @RequestMapping("/getList") => 조회, 등록, 삭제, 수정 전부 @RequestMapping 어노테이션 사용

  // 게시글 목록 페이지
  // url: 'boards/getList/'
  // controller에서 요청을 처리하는 메서드의 return 타입은 무조건 문자열
  // legacy 방식에서 리턴되는 정보는 보여질 html 파일명을 의미함.
  @RequestMapping("/getList")
  // 매개변수에 선언한 Model 인터페이스 객체는 데이터를 적재하는 역할
  public String getList(Model model){
    // 필요한 데이터 조회
    String name = "kim";
    int age = 20;

    // 조회한 데이터 실음
    model.addAttribute("data", name);
    model.addAttribute("ageData", age);
    model.addAttribute("boardList", boardService.selectBoardList());


    //html 파일은 무조건 resources/templates 폴더 안에 위치
    return "board_list"; // 게시글 목록을 보여주는 html 파일명
  };



}
