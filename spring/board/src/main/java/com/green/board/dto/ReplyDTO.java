package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.print.attribute.DateTimeSyntax;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ReplyDTO {
  private int replyNum;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private int boardNum;
}
