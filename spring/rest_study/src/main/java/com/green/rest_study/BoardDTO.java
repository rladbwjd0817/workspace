package com.green.rest_study;


import lombok.*;

// 게시글 하나의 정보를 저장할 수 있는 자료형
@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //매개변수로 데이터를 받는 생성자

public class BoardDTO {
  private int boardNum; //글번호
  private String title;
  private String writer;
  private int readCnt;


}
