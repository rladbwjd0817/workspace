package static_sudy;

public class Bank {
  private String owner;
  private int money;

  //static변수는 생성자에서 초기화하면 안됨!!
  //생성자에서 초기화하면 심각한 문제가 발생함.............
  //static 변수를 초기화하기 위한 별도의 문법이 존재.

  static double rate; //이율

  //static 변수의 초기화 구문
  //새로 생길 때 마다 static 바뀌지 않게 하려고
  static{
    rate = 7.0;
  }

  public  Bank(){
    money = 10000;

  }
}
