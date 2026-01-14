package interface1;

public interface Tv {
  //전원 켜는 기능
  public void turnOn(); //추상메서드, 접근제한자 생략하면 public이 자동으로 붙음

  //전원 끄는 기능
  public void turnOff();

  //소리 올림
  public void volumeUp();

  //소리 내림
  public void volumeDown();
}
