package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {

  private ReplyService replyService;

  public ReplyController(ReplyService replyService){
    this.replyService = replyService;
  }

//  댓글 목록 조회 기능 API
//  url : (GET) localhost:8080/replies
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){
    List<ReplyDTO> list = replyService.getReplyList(boardNum);
    return list;
  }

//  일반적인 DTO 클래스로 리턴을 받아서 조회가 되지 않으면 null 이 나오고,
//  List로 리턴을 받아서 조회가 되지 않으면 null이 아니라 [], 사이즈가 0이 나옴.



}
