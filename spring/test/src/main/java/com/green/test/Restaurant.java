package com.green.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //어노테이션("a") : 객체명을 지정함.
public class Restaurant {
  private Chef chef;
//  Chef chef = a; =>원래 만들어놓은 것에 데이터를 집어 넣는 것 : 의존성 주입(DI)


  @Autowired //DI : 생성자 의존성 주입을 사용!
  // => 만들어진 생성된 객체 중 자료형이 일치하는 객체를 매개변수로 주입시켜주세요.
  public Restaurant(Chef chef){
    this.chef = chef;
  }

  public void run(){
    chef.cook();
  }



}
//    chef = new Chef();
//    객체를 만드는 코드가 있기에 결합도는 아직 있음.
//    spring엔 객체 생성 안함!! => spring이 대신 만들어줌 => IOC
//    스프링한테 내가 원하는 객체를 생성해달라고 어떻게 요구하지?
//    => 객체가 필요한 클래스를 개발자가 스프링에게 알려줌
//    => 객체가 필요한 클래스는 반드시 default 패키지안에 있으면 만들어질 수 있는
//       조건에 만족하게 되며, 후보클래스가 됨
//    => 객체가 필요한 클래스 위에 객체 생성을 명령하는 어노테이션을 추가함.
