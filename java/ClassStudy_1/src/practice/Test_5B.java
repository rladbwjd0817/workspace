package practice;

public class Test_5B extends Test_5A {
  private int b;
  public Test_5B(){
    b = 0;
  }

  //오류 해결 방법 :
  /* 생성자 호출 시 맨 첫 줄에 super();이 있음.
  이 super은 부모클래스의 기본생성자를 호출하는 것인데
  부모클래스의 생성자에 기본 생성자가 없어서 오류 뜸
  super(); 매개변수를 넣으면 그 부모요소의 생성자의 자료형에
  맞는 값을 넣어야 함.
  */
}
