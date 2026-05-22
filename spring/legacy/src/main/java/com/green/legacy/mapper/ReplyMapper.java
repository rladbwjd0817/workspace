package com.green.legacy.mapper;

import com.green.legacy.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
  List<ReplyDTO> selectReplyList(int boardNum);

  void insertReply(ReplyDTO replyDTO);


}
