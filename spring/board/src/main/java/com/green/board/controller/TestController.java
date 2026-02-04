package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test1")
  public ResponseEntity<String> test1(){
    String name = "kim";

//    기본문법 : ResponseEntity.status().header().body()
//    전달할 부가 정보가 없으면 header 빼고 쓰기도 함.
//    HttpStatus.OK : 요청성공 -> 200 이랑 같음!
//    ResponseEntity<String> -> List<>랑 똑같이 전달할 데이터의 자료형을 < > 안에 넣어주기
    return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(name);

  }

  @GetMapping("/test2")
  public ResponseEntity<BoardDTO> test2(){
    BoardDTO dto = new BoardDTO();
    dto.setBoardNum(1);
    dto.setTitle("dd");
    dto.setWriter("yuyu");
    dto.setContent("내용");

//    헤더에도 내가 필요한 데이터를 전달가능하나 주로 body에 데이터를 실어서 보냄
//    헤더에 실을 데이터
    HttpHeaders header = new HttpHeaders();
    header.add("myName", "kim");
    header.add("myAge", "30");

    return ResponseEntity.status(HttpStatus.CREATED).headers(header).body(dto);

  }

//  body에 실을 데이터가 없을 경우!
  @GetMapping("/test3")
  public ResponseEntity<?> test3(){
//    자바 와일드카드 : "?" -> body가 있든 없든 다 사용가능함.

    System.out.println("기능 성공");

//   return 할 데이터가 없으면 body를 쓰지 않더라도, status 상태변화를 리턴하고,
//   마지막에 .build() 메서드를 호출해야함.
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }





}
