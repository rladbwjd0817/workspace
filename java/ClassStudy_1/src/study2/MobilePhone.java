package study2;

public class MobilePhone {
  String brand;

  public void sendMsg(){
    System.out.println("메세지를 보냅니다.");
  }

}


class SmartPhone extends MobilePhone{
  String os;

  public void playApp(){
    System.out.println("앱을 실행합니다.");
  }

}
