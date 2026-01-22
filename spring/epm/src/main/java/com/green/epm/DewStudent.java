package com.green.epm;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DewStudent {
  private int stuNum; // 순번
  private String stuName; //이름
  private String addr; //주소
  private int tele; //전화번호
  private String school; //진학 할 학교

}
