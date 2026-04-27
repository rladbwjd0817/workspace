package com.green.legacy.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class BoardDTO {
  private int boardNum;
  private String title;
  private String content;
  private String writer;         // LEGACY_USER.USER_ID 참조
  private LocalDateTime regDate;
}
