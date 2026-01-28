package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

//DTO(data transfer object) : 데이터 전송 객체
//스프링과 Basic_board 테이블의 데이터를 주고 받을 수 있게 해주는 객체
//Basic_board 테이블의 컬럼정보를 저장할 수 있는 멤버변수를 생성

@Getter
@Setter
@ToString
public class BoardDTO {
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private LocalDateTime createDate;



}
