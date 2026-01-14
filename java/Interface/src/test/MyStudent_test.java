package test;

public class MyStudent_test {
  public static void main(String[] args) {
    //객체 생성
    MyStudent stu = new MyStudent();

    //자료값 출력
    stu.getTotalScore();
    String result = stu.getGrade(90);

    System.out.println(result);

  }
}
