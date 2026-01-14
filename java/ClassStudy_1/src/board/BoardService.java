package board;

public class BoardService {

  //매개변수로 전달된 두 게시글 객체 중에서
  // 글 번호가 큰 게시글의 제목을 리턴하는 메서드
  public String test1(Board b1, Board b2){ //b1 = 2, b2 = 5 가정
//    if (b1.getBoardNum() < b2.getBoardNum()){
//      b2.getBoardNum();
//    } else {
//      b1.getBoardNum();
//    }
    return b1.getBoardNum() > b2.getBoardNum() ? b1.getTitle() : b2.getTitle();
  }

  //매개변수로 게시글 객체 두개가 전달되면
  //두 게시글의 조회수의 합을 리턴하는 메서드
  public int test2(Board b1, Board b2){
    return b1.getReadCnt() + b2.getReadCnt();
  }

  //매개변수로 글 번호, 제목이 전달되면
  //해당 데이터를 갖는 게시글 객체를 리턴하는 메서드
  public Board test3(int boardNum, String title){
//    Board b = new Board(boardNum, title, "ds", 5);
    //새로운 board객체를 만들어 b 객체에 저장한다.
//    return b;

    return new Board(boardNum, title, "ds", 5);
  }

  //매개변수로 두개의 게시글 객체가 전달되면
  //두 객체 중 글번호가 큰 게시글을 리턴하는 메서드
  public Board test4(Board b1, Board b2){
    return b1.getBoardNum() > b2.getBoardNum() ? b1 : b2;
  }

  //매개변수로 게시글 객체가 여러 개 전달되면
  //매개변수로 전달된 게시글 중 글번호가 짝수인 게시글만 리턴하는 메서드

  public Board[] test5(Board[] arr){
    //매개변수로 들어온 배열에서 글번호가 짝수인 데이터의 갯수를 파악
    int cnt = 0;
    for (Board e : arr){
      if (e.getBoardNum() % 2 == 0){
        cnt++;
      }
    }
    Board[] result = new Board[cnt];

    int index = 0;
    for (Board e : arr){
      if (e.getBoardNum() % 2 == 0){
        result[index++] = e;
      }
    }
    return result;
  }



}
