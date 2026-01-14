package com.green.test;

import org.springframework.stereotype.Component;

interface Cook{
  void cook(); //요리하는 추상메서드
}

@Component("a") //객체 생성 어노테이션
//클래스 위에 어노테이션 있는 클래스만 스프링이 객체를 생성해줌.
public class Chef implements Cook {

  public void cook(){
    System.out.println("요리 중");
  }
}

class KoreanChef implements Cook{
  public void cook(){
    System.out.println("한식 요리 중");
  }


}
