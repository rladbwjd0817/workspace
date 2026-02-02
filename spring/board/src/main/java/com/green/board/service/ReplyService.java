package com.green.board.service;


import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
  private ReplyMapper replyMapper;

  public ReplyService(ReplyMapper replyMapper){
    this.replyMapper = replyMapper;
  }

//  댓글 목록 기능 실행 메서드
  public List<ReplyDTO> getReplyList(int boardNum){
    return replyMapper.selectReplyList(boardNum);
  }




}
