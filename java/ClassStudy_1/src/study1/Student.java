package study1;

public class Student extends Person {
  int stuNum; //학번
  String major;

  public Student(){
    //super();
    System.out.println("기본 생성자 호출");
    stuNum = 0;
    major = "";
  }

  //상속관계에 있는 클래스의 생성자의 첫 줄에는
  //부모클래스의 생성자를 호출하는 super();가 숨겨져 있음
  //단, this() 명령어로 해당 클래스의 생성자를 호출하는 문법이 있다면
  //super() 명령어는 실행되지 않음!
  public Student(int stuNum){
//    super(); 없음!!!
    this(); // 해당 클래스의 생성자 호출
    this.stuNum = stuNum;
    System.out.println("정수 매개변수 생성자 호출");
  }

  public void aaa(){
    System.out.println(name);
    System.out.println(super.name);
    System.out.println(this.name);
    tellName();
    super.tellName();
    this.tellName();
  }

}
