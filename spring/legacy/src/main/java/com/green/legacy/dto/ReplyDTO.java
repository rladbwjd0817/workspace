package com.green.legacy.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class ReplyDTO {
  private int replyNum;
  private String replyContent;
  private String replyWriter;    // LEGACY_USER.USER_ID 참조
  private LocalDateTime regDate;
  private int boardNum;
}
