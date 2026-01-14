package board;

import stu.Student;

public class BoardTest {
  public static void main(String[] args) {

    //자료형이 다른 데이터는 저장불가!
    //자료형이 같으면 뭐든 저장 가능해!
    Board b1 = new Board(1, "frist", "k", 5);
    Board b2 = b1;

//    Student s = b1;  자료형이 달라달라 ~ ♬

    System.out.println(b1);
    System.out.println(b2);
    System.out.println();

    b1.setTitle("변경된 제목");
    System.out.println(b1);
    System.out.println(b2);





  }
}
