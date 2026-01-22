package com.green.basic_board.dto;
// BASIC_BOARD 테이블의 한 행 테이블을 가져오기 위한 자료형

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class BoardDTO {
//  변수명은 DB의 컬럼명과 똑같이 만들어주는게 좋음!(DB가 기준)
  private int boardNum;
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private LocalDateTime createDate; //날짜 자료형
}
