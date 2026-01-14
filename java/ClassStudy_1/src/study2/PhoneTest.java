package study2;

/* 다형성 -> 객체를 다양한 문법으로 생성할 수 있다.
결론 : 자식클래스의 객체는 부모클래스 자료형으로 받을 수 있다. (ex. p3)
다형성을 통해 생성된 객체는 부모클래스의 멤버변수 및 메서드만 사용 가능!
* */

import com.sun.tools.javac.Main;

public class PhoneTest {
  public static void main(String[] args) {
    MobilePhone p1 = new MobilePhone();
    System.out.println(p1.brand);
    p1.sendMsg();


    SmartPhone p2 = new SmartPhone();
    System.out.println(p2.os);
    System.out.println(p2.brand);
    p2.playApp();
    p2.sendMsg();


    MobilePhone p3 = new SmartPhone();
    System.out.println(p3.brand);
//    System.out.println(p3.os); error!
    p3.sendMsg();
//    p3.playApp(); error!

//    SmartPhone p4 = new MobilePhone(); error!
  }
}
