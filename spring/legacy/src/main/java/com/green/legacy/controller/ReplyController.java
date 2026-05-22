package com.green.legacy.controller;

import com.green.legacy.dto.ReplyDTO;
import com.green.legacy.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/reply")
public class ReplyController {
  private final ReplyService replyService;

  @RequestMapping("/insert")
  public String insert(@ModelAttribute ReplyDTO replyDTO){
    System.out.println("등록된 댓글 : " + replyDTO);

    // 댓글 등록 기능 실행
    replyService.insertReply(replyDTO);

    return "redirect:/boards/board_detail?boardNum=" + replyDTO.getBoardNum();
  }
}
