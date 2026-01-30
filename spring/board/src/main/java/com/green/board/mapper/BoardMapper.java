package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//  해당 파일의 목적 : xml에서 만든 쿼리문을 실행할 추상메서드 선언(껍데기)

// 초기세팅
// 1. xml 파일과 Mapper Interface 연결 -> xml 파일의 namespace 작성(패키지경로까지 다)
// 2. 인터페이스위에 Mapper 어노테이션 적용
// 3. 쿼리문 실행할 추상메서드 선언
// 메서드 선언에는 메서드명, 리턴타입, 매개변수 정보를 작성자가 결정
// 메서드명 : 실행할 쿼리문의 id와 같은 값
// 리턴타입 : 쿼리 실행결과 전체 데이터를 받을 수 있는 자료형
//         : 조회 일 경우 -> 조회된 데이터에 따라 리턴타입이 달라짐.
// insert, update, delete -> void 혹은 int 로 리턴타입이 결정됨.
// void -> 조회되는 데이터가 없기 때문에 사용 가능
// int - 쿼리 실행에 영향을 받은 행의 개수
// 매개변수 : 쿼리 실행 시 빈 값을 채울 수 있는 데이터

@Mapper //객체 생성 + 해당 인터페이스가 쿼리를 실행시키는 메서드가 있는 파일임을 스프링한테 알려줌.
public interface BoardMapper {

//  게시글 목록조회 쿼리 실행 메서드
  List<BoardDTO> selectBoardList();

//  게시글 등록 쿼리 실행 메서드
  void insertBoard(BoardDTO boardDTO);

//  게시글 1개 상세 조회 쿼리 실행 메서드
  BoardDTO oneBoardData(int boardNum);

//  게시글 1개 선택 시 조회수 1 증가 쿼리 실행 메서드
  void updateReadCnt(int boardNum);

//  게시글 상세 정보 페이지에서 삭제 쿼리 실행 메서드
  int deleteBoardData(int boardNum);

// 게시글 정보 수정 쿼리 실행 메서드
  void updateBoard(BoardDTO boardDTO);




}


