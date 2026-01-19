package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 게시글과 관련된 요청에 대한 응답 클래스
// 요청 종류는 대표적으로 CRUD 라고 부르는 4개가 존재.
// C : CREATE -> 데이터 생성
// R : READ -> 데이터 조회(전체 조회, 특정 데이터만 조회)
// U : UPDATE -> 데이터 수정
// D : DELETE -> 데이터 삭제

@RestController
@RequestMapping("/boards") //해당 컨트롤러의 url은 전부 "/boards"로 시작한다.
//두개 순서 바뀌어도 상관 X

public class BoardController {
  private List<BoardDTO> boardList;

  public BoardController(){
//    게시글 목록이 저장 될 List 생성
    boardList = new ArrayList<>();

//    List에 게시글 5개 저장
    boardList.add(new BoardDTO(1, "첫 번째 글", "김자바", 5));
    boardList.add(new BoardDTO(2, "두 번째 글", "최자바", 4));
    boardList.add(new BoardDTO(3, "세 번째 글", "이자바", 7));
    boardList.add(new BoardDTO(4, "네 번째 글", "박자바", 10));
    boardList.add(new BoardDTO(5, "다섯 번째 글", "홍자바", 9));
//    run되면 생성자 실행, boardList에 게시글 5개 저장
  }

// 게시글 목록을 조회하는 API
// URL -> (GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    System.out.println("게시글 목록을 조회합니다.");
    return boardList;
  }

// 게시글 1개(글번호가 5인)를 조회하는 API
// URL -> (GET) localhost:8080/boards/5

// URL에 {}를 사용하여 변수처럼 활용
// 이 변수는 URL에 적용되었다는 의미에서 URL Parameter라 부름
// URL Parameter로 전달되는 데이터는 메서드의 매개변수에 @PathVariable 어노테이션을 사용으로 활용 가능
// 문법 : @PathVariable("url 파라메터 이름") 해당 데이터를 받을 변수
  @GetMapping("/{boardNum}") //{boardNum} => 변수
  public BoardDTO getBoard(@PathVariable("boardNum") int num){
//   PathVariable = url parameter
//   boardNum이라는 url parameter를 가져오겠다.
//   url parameter에서 받은 데이터는 int num으로 넘어감
    System.out.println("num = " + num);
    System.out.println( num + "번 게시글을 조회합니다.");

    BoardDTO result = null;
    for (BoardDTO e : boardList){
      if (e.getBoardNum() == num){
        result = e;
      }
    }
    return result;
  }

// 연습용 코드
// URL -> (GET) localhost:8080/boards/5/java
  @GetMapping("/{age}/{name}")
  public void test1(@PathVariable("age") int num, @PathVariable("name") String name){
//    name이라고 넘어온 변수 받겠다
//    PathVariable 여러개 만드는 것 가능!
    System.out.println("num = " + num);
    System.out.println("name = " + name);
  }

// 게시글 등록 API
// URL -> (POST) localhost:8080/boards
// 요청 시 글번호, 제목, 작성자, 조회수 데이터를 가져옴!
// 글번호 : 1, 제목 : 안녕, 작성자 : 김자바, 조회수 : 3
// 자바스크립트 객체 문법으로 등록 할 정보 전달가능!
// 데이터 등록(POST), 데이터 수정(PUT) 시 요청과 함께 전달되는 데이터는
// @RequestBody 어노테이션으로 testDTO 객체에 전달받음.
// @RequestBody 어노테이션 다음에 클래스 자료형을 매개변수로 선언하면 해당 클래스에 데이터를 받을 수 있음!
// ★ 단! 해당 클래스의 멤버변수 명은 요청 시 전달되는 객체의 Key값과 동일해야 데이터를 받을 수 있음!!★

  @PostMapping("")
  public void regBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    boardList.add(boardDTO);
  }




// 게시글 삭제 API - 통상적으로 게시글 하나씩 삭제하기에 몇 번 삭제하는지
// URL -> (DELETE) localhost:8080/boards/3
  @DeleteMapping("/{boardNum}")
  public List<BoardDTO> deleteBoard(@PathVariable("boardNum") int boardNum){
    System.out.println("삭제하려는 글 번호 : " + boardNum);

    for(int i = 0; i < boardList.size(); i++){
      if (boardList.get(i).getBoardNum() == boardNum){
        boardList.remove(i);
      }
    }
    return boardList;
  }

// 게시글 수정 API - 통상적으로 게시글 하나씩 수정하기에 몇 번 게시글을 수정하는지
// URL -> (PUT) localhost:8080/boards/1 => 얘를 알아야 밑에 매개변수들을 쓸 수 있음!
// 게시글의 제목("집에 갑시다")과 작성자("관리자")를 변경
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    System.out.println(boardNum);
    System.out.println(boardDTO);

    for (BoardDTO e : boardList){
      if (e.getBoardNum() == boardNum){
        e.setTitle(boardDTO.getTitle());
        e.setWriter(boardDTO.getWriter());
      }
    }
  }


}
