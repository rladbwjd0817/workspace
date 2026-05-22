package com.green.legacy.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter

public class BoardDTO extends PageDTO{
  private int boardNum;
  private String title;
  private String content;
  private String writer;         // LEGACY_USER.USER_ID 참조
  private LocalDateTime regDate;

  @Override
  public String toString() {
    return "BoardDTO{" +
            "boardNum=" + boardNum +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", writer='" + writer + '\'' +
            ", regDate=" + regDate + '\'' +
            super.toString() + '\'' +
            '}';
  }
}
