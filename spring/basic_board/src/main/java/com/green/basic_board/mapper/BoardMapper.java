package com.green.basic_board.mapper;

import com.green.basic_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//인터페이스 안에는 추상메서드만 올 수 있음!
//xml 파일에서 만든 쿼리문을 연결해서 실행할 수 있는 메서드 만드는 곳 임!

@Mapper //객체 생성의 역할도 있음. xml파일에서 만든 쿼리문을 실행시키는 인터페이스라는 것을 지정해줌!
public interface BoardMapper {

  //메서드명은 해당 쿼리를 실행시키려면 그 쿼리의 아이디랑 일치시켜야 함
//  메서드의 리턴타입 : 쿼리 실행 결과 전체 데이터를 담을 수 있는 자료형
//  메서드의 리턴타입 != resultType
//  메서드의 매개변수 : 쿼리 실행 시 채워줘야 하는 데이터
//  => 쿼리가 완성본이면 채워줘야 할 게 없기에 매개변수는 빈칸으로 내비둠

//쿼리실행 메서드 : test1()
  String test1(); //리턴타입이랑 매개변수가 중요!

  List<Integer> test2(); //메서드 리턴타입은 쿼리 전체 데이터 생각!

//  쿼리에서 조회된 데이터는 한 줄이 나오기에 BoardDTO
//  xml에 조건에서 #{변수} 이렇게 있으면 빈 값이기에 Mapper에서 매개변수에 값을 채워넣어줘야 함!
//  !!!쿼리만 실행!!!!
  BoardDTO test3(int boardNum);
  List<BoardDTO> test4(BoardDTO boardDTO);
  //전체 데이터가 행이 2개 나오니 BoardDto 하나만 쓸게 아니라 List자료형으로 리턴해야 함.
//  BoardDTO안에 boardNum, readCnt 둘 다 있어서 가능함
}
