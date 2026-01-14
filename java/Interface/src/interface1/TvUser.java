package interface1;

public class TvUser {
  public static void main(String[] args) {

    //인터페이스를 구현한 클래스의 객체를
    //해당 인터페이스 자료형으로 받을 수 있음
    //다형성으로 인해 lgTv에 있는 멤버변수 & 메서드를 사용하지 못하고 TV 인터페이스에 있는
    //메서드만 사용가능함!
    Tv tv = new LgTV();

    tv.turnOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.turnOff();

    SamsungTV[] tvs = new SamsungTV[5];
    tvs[0] = new SamsungTV();

    Tv[] tt = new Tv[5];
    tt[0] = new SamsungTV();
    tt[1] = new LgTV();




  }
}
