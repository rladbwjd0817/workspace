package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 인터페이스에서 선언한 추상메서드를 실행할 메서드 구현
// 실제 쿼리 기능을 구현할 클래스(몸통)

// 초기세팅
// 1. service 어노테이션을 클래스명 위에 선언
// -> 객체 생성 + 이 클래스가 핵심기능이 구현된 클래스라는 것을 스프링한테 알려줌.
// 2. 쿼리 실행 메서드를 호출하기 위해서 Mapper 인터페이스에 대한 객체를 의존성 주입받아야 함.
// 2-1) Mapper 인터페이스 객체를 멤버변수로 선언
// 2-2) 생성자 의존성 주입 문법을 사용하여 Mapper 인터페이스 객체를 생성

@Service //객체생성 + 핵심기능
public class BoardService { //2-1 코드
  private BoardMapper boardMapper;

  //2-2 코드
  @Autowired // 생성자 의존성 주입 , 생성자가 하나라면 @Autowired 어노테이션 생략 가능
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

//  게시글 목록 조회 기능
  public List<BoardDTO> getList(SearchDTO searchDTO){
    List<BoardDTO> list = boardMapper.selectBoardList(searchDTO); //쿼리실행결과 전체 데이터가 다 들어있음!
    return list;
  }

//  게시글 등록 기능
  public void postBoard(BoardDTO boardDTO){
    boardMapper.insertBoard(boardDTO);
  }

//  게시글 1개 상세 조회 기능 + 조회수 증가
  public BoardDTO oneBoardData(int boardNum, String type){
//    BoardDTO oneData = boardMapper.oneBoardData(boardNum);
//    return oneData;
//  상세 조회 기능에서만 조회수를 1 증가
    if (type.equals("get")){
      boardMapper.updateReadCnt(boardNum);
    }

//    게시글 상세 정보 조회 쿼리 실행
    return boardMapper.oneBoardData(boardNum);

  }

  public int deleteBoardData(int boardNum){
    return boardMapper.deleteBoardData(boardNum);
  }

//  게시글 수정 기능
  public void updateBoard(BoardDTO boardDTO){
    boardMapper.updateBoard(boardDTO);
  }

//  게시글 1개 선택시 조회수 1 증가 기능
//  -> 원칙적으로 조회수 증가 기능은 X,
//  원래는 게시글 상세 조회 기능만 있음
//  -> 게시글 상세 조회 쿼리 + 조회수 1증가 쿼리
//  그래서 Mapper에는 쿼리실행메서드가 2개, 상제조회기능에 조회수 1증가도 포함



}
