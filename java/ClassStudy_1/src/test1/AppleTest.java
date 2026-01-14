package test1;

import test1.inner.Banana;
import test2.Orange;


public class AppleTest {
  public static void main(String[] args) {

    //다른 패키지에 있는 클래스를 사용하려면 반드시 import를 사용해야 함!
    //import - 패키지
    Orange a = new Orange();



    //사과객체 -> 패키지가 같으면 import 사용 안해도 됨
    Apple apple = new Apple();
//    apple.price; -> 접근 가능(사용 가능) => 같은 패키지안에 있으면 접근 가능

    //java.util.aaa  -> 폴더 밑에 있는 위치 java/util/aaa

    //바나나객체 -> 패키지가 다르면 import 써야 함
    Banana b1 = new Banana();
//    banana.price; -> 접근 불가! => 패키지가 달라서

  }
}
