package study3;

//클래스 선언 시 어떠한 클래스도 상속받지 않으면
//자동으로 Object 클래스를 상속한다.
//어떤 클래스를 상속받거나, 어떠한 클래스를 상속받지 않더라도 우리가 만든 클래스는 Object클래스를 상속한다!

// ★ 결론 : 자바의 모든 클래스는 Object 클래스를 상속한다.
// ★ 파생 결론 : Object 클래스로 모든 클래스의 객체를 품을 수 있다.

import study2.Cake;

public class Student{
   int stuNum; //학번
  private String name;
  private int score;

  //매개변수에 Object 넣으면 => 무엇이든 다 넣을게~!!
  public void aaa(Object a){

  }

  //Student 클래스의 객체가 같다라는 의미를 재정의

  @Override
  public boolean equals(Object obj) {
    //부모클래스에서 선언한 equals 메서드를 사용할게!
//    return super.equals(obj);
    //Object obj = new Student(); => 실체는 학생이지만 겉은 obj라 obj로 밖에 못씀
    Student a = (Student) obj;
//     return stuNum.equals(((Student) obj).stuNum);
     return stuNum == a.stuNum;


  }

  @Override
  public String toString() {
    return "Student{" +
            "stuNum =" + stuNum +
            ", name ='" + name + '\'' +
            ", score =" + score +
            '}';
  }
}