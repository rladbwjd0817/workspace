package interface1;

//Tv라는 인터페이스를 구현해서 삼성tv를 만들겠다.
public class SamsungTV implements Tv{
  //tv 전원 on
  public void turnOn(){
    System.out.println("삼성 tv - 전원 켬");
  }
  //tv 전원 off
  public void turnOff(){
    System.out.println("삼성 tv - 전원 끔");
  }
  //볼륨 업
  public void volumeUp(){
    System.out.println("삼성 tv - 소리 올림");
  }
  //볼륨 다운
  public void volumeDown(){
    System.out.println("삼성 tv - 소리 내림");
  }
}
