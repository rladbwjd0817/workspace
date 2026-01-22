package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //객체 생성 기능 있음

public class BoardController {
  private BoardService boardService;

  //생성자 의존성 주입 - 매개변수로 전달받을 수 있는 자료형이 있는지 확인하고 있으면 전달해줌
  @Autowired
  public BoardController(BoardService boardService){
    this.boardService = boardService; //this. = 이 클래스에서 정의된 ~~
  }

  @GetMapping("/test1")
  public String test1(){
    String result = boardService.runTest1();
    return result;
  }

  @GetMapping("/test2")
  public List<Integer> test2(){
    List<Integer> result2 = boardService.runTest2();
    return result2;
  }

//  url : localhost:8080/test3/{3}
  @GetMapping("/test3/{boardNum}")
  public BoardDTO test3(@PathVariable("boardNum") int boardNum){
    BoardDTO result3 = boardService.runTest3(boardNum);
    return result3;
  }

//  매개변수는 쿼리 빈 값 채워주는 용도!!!!
  @GetMapping("/test4")
  public List<BoardDTO> test4(){
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(1);
    dto.setReadCnt(10);
    List<BoardDTO> result4 = boardService.runTest4(dto);
    return result4;
  }



}
