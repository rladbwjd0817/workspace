package com.green.legacy.service;

import com.green.legacy.dto.BoardDTO;
import com.green.legacy.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
  private final BoardMapper boardMapper;

  public List<BoardDTO> selectBoardList(BoardDTO boardDTO){
    return boardMapper.selectBoardList(boardDTO);
  }

  public void insertBoard(BoardDTO boardDTO){
    boardMapper.insertBoard(boardDTO);
  }

  // 상세조회
  public BoardDTO detailBoard(int boardNum){
    return boardMapper.detailBoard(boardNum);
  }

  // 게시글 삭제
  public void deleteBoard(int boardNum){
    boardMapper.deleteBoard(boardNum);
  }

  // 게시글 수정
  public void updateBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);
  }

  // 게시글 전체 데이터 조회
  public int selectBoardCnt(){
    return boardMapper.selectBoardCnt();
  }
}
