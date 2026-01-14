package study2;

public class Cake {
  public void eatCake(){
    System.out.println("케이크를 맛있게 먹습니다.");
  }
}

class CheeseCake extends Cake{
  public void eatCheeseCake(){
    System.out.println("치즈케이크를 맛있게 먹습니다.");
  }
}

class StrawberryCheeseCake extends CheeseCake{
  public void eatStrawberryCheeseCake(){
    System.out.println("딸기치즈케이크를 맛있게 먹습니다.");
  }
}