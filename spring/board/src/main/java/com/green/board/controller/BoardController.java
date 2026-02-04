package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 해당 파일은 요청에 대한 응답기능을 구현(API)
// 응답으로 주로 쿼리실행을 함. -> 서비스에서 만든 메서드를 가져와서 실행하겠다.
// 초기실행
// 1. 클래스 위에 RestController 어노테이션 선언
// -> 객체 생성 + 이 클래스가 요청에 대한 응답을 처리하는 클래스임을 스프링한테 알려줌.
// 2. 쿼리 실행 기능 메서드를 호출하기 위해
// 2-1) Service 클래스의 객체를 멤버변수로 선언
// 2-2) 생성자 의존성 주입 문법을 사용하여 Service 객체를 생성

@RestController
@RequestMapping("/boards")
// @Slf4j :
@Slf4j
public class BoardController {
  private BoardService boardService; //2-1 코드

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

// 게시글 목록 조회 기능 API
//  url : (GET) localhost:8080/boards
  @GetMapping("")
  public ResponseEntity<?> getBoardList(SearchDTO searchDTO){
//    try 순차적으로 실행 -> 오류나면 그 즉시 try멈추고 바로 catch문 순차적으로 실행
    try {
//      System.out.println(searchDTO);
      log.info("게시글 목록 조회 기능 실행 중 입니당!");
      List<BoardDTO> list = boardService.getList(searchDTO);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch(Exception e){
      //  react의 axios의 catch와 비슷함! => 오류났을 때 실행
//      오류 나자마자 밑엔 실행 안하고 바로 catch 실행!!
      log.error("!!!게시글 목록 조회 중 오류 발생!!!");
//      printStackTrace() : 오류나는 이유 및 발생 위치 알려줌!
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("오류났어요!!");
    }

  }

//  게시글 등록 기능 API
//  url: (POST) localhost:8080/boards
  @PostMapping("")
  public ResponseEntity<?> postBoard(@RequestBody BoardDTO boardDTO){
    try {
      System.out.println(boardDTO);
      int result= boardService.postBoard(boardDTO);
//      등록일 땐 통상적으로 created를 사용
      return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }catch(Exception e){
      log.error("게시글 등록 중 오류");
      e.fillInStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }



  }
//  boardDTO -> 우리가 화면에 입력한 데이터가 다 있어야 함.
//  매개변수는 화면에 입력한 데이터를 스프링으로 가지고 올
//  데이터가 바로 매개변수임!

//  게시글 1개 상세 조회 기능 + 조회수 1증가 API
//  url : (GET) localhost:8080/boards/get/{boardNum} -> 게시글 상세조회
//  url : (GET) localhost:8080/boards/update/{boardNum} -> 게시글 수정을 하기 위한 조회
  @GetMapping("/{type}/{boardNum}")
  public BoardDTO getOneData(@PathVariable("boardNum") int boardNum, @PathVariable("type") String type){
    System.out.println("이동할 페이지 : " + type);
    System.out.println("상세 조회 할 글 번호 : " + boardNum);
//    BoardDTO oneData = boardService.oneBoardData(boardNum);
//    return oneData;

    return boardService.oneBoardData(boardNum, type);
  }

//  게시글 삭제 기능 API
//  url: (DELETE) localhost:8080/boards/1
  @DeleteMapping("/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum){
    System.out.println("삭제 할 글 번호: " + boardNum);
    int result = boardService.deleteBoardData(boardNum);
    return result;
  }

//  게시글 수정 기능 API
//  url : (PUT) localhost:8080/boards/2
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum,
                          @RequestBody BoardDTO boardDTO){

//  @RequestBody : post, put에서만 씀
    System.out.println("boardNum = " + boardNum);
    System.out.println(boardDTO);
    boardDTO.setBoardNum(boardNum); //boardNum = 7 이라면 boardDTO에 7을 넣어줌
    boardService.updateBoard(boardDTO);
  }





}
