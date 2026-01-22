package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service 클래스 : 프로젝트에서 핵심기능을 구현한 클래스
//지금은 DB기능을 핵심기능이라 생각하기!(데이터 조회, 삭제, 등록, 수정) => DB기능 구현
@Service //객체 생성 어노테이션 - 핵심 기능
public class BoardService {
//  쿼리 실행 추상메서드가 존재하는 객체를 선언
  private BoardMapper boardMapper; //같은 자료형으로 만들어져있는 객체를 @Autowired로 인해 객체가 저장됨.

//  생성자 의존성 주입
  @Autowired
  public BoardService(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

//  Mapper interface에 만든 test1() 추상메서드를 실행하는 메서드
  public String runTest1(){ // => 쿼리 실행 결과를 리턴해주는 메서드
    String result = boardMapper.test1();
//    result엔 실행결과가 저장되어 있음!
    return result;
  }

//  Mapper interface에 정의된 test2()를 실행할 메서드 생성
  public List<Integer> runTest2(){
    List<Integer> result2 = boardMapper.test2();
    return result2;
  }

//  기능을 실행(부가적인 기능도 실행해주기도 함.)
//  쿼리가 포함되어 있음
  public BoardDTO runTest3(int boardNum){
//    Mapper에서 채워진 매개변수를 Service에서 그대로 매개변수로 넣어주기!
    BoardDTO result3 = boardMapper.test3(boardNum); //=> 쿼리 실행
    return result3;
  }

  public List<BoardDTO> runTest4(BoardDTO boardDTO){
    List<BoardDTO> result4 = boardMapper.test4(boardDTO);
    return result4;
  }





}
