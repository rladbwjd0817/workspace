package com.green.legacy.mapper;

import com.green.legacy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
  List<BoardDTO> selectBoardList(BoardDTO boardDTO);
  void insertBoard(BoardDTO boardDTO);

  // 상세 조회
  BoardDTO detailBoard(int boardNum);

  // 게시글 삭제
  void deleteBoard(int boardNum);

  // 게시글 수정
  void updateBoard(BoardDTO boardDTO);

  // 게시글 전체 데이터 수 조회 쿼리
  int selectBoardCnt();
}
