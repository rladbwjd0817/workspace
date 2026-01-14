package study3;

import study2.Cake;
import study2.UnivFriend;

public class StudentTest {
  public static void main(String[] args) {

    Student s = new Student();
    Object stu = new Student();
    Object b = new Cake();
    Object c = new UnivFriend("도라에몽", "발명", "1234");

    //Object 클래스에 선언된 equals()메서드
    //public boolean equals(Object o)
    //현재 객체와 매개변수로 전달된 데이터가 같으면 true를, 다르면 false를 리턴하는 메서드
    //무슨 기준으로 같다고 하는 걸까?
    // => 매개변수로 Object가 있으니 뭐든 넣으면 되니 기준은 개발자가 정하기
    //같다라는 의미는 개발자가 정하는 거!
    //그렇지만 자바에서 의미하는 기본적인 같다의 의미 : 같은 주소 값을 참조하고 있다!
    //equals 메서드를 원래 기능대로 쓰지말고, 개발자가 입맛대로 같다는 의미를
    //재정의해서 사용하세요~~~!!!!!! => overriding
    UnivFriend f1 = new UnivFriend("dd", "dd", "1536");
    UnivFriend f2 = new UnivFriend("dd", "dd", "1536");

    //f1객체와 f2객체가 같은 주소값을 참조하고 있나요?
    System.out.println(f1.equals(f2));

    f2 = f1;
    System.out.println(f1.equals(f2));
    Student s1 = new Student();
    s1.stuNum = 1;
    Student s2 = new Student();
    s2.stuNum = 1;

    System.out.println(s1.equals(s2));

    //Object 클래스의 toString() 메서드
    //public String toString()
    // => 기본 정의: 객체의 정보를 문자열로 리턴하는 메서드
    //'문자열로 표현할 정보를 개발자가 재정의해서 사용하세요' 라는 의미!
    // => 객체가 가진 멤버변수의 정보를 문자열로 리턴
    System.out.println(s1.toString());
    //객체명만 출력하면 toString() 메서드가 호출됨
    System.out.println(s1);

    //배열도 객체임. << 기본자료형 빼고 다 객체임
    String[] arr = new String[3];
    System.out.println(arr);
    System.out.println(arr.toString());



  }
}
