package static_sudy;

public class TV {
  int price;
  double inch;
  static int channel;

  public void turnOn(){
    System.out.println(price);
    System.out.println("TV를 켜요");
    storeLike();
  }

  public void storeLike(){
    System.out.println("TV 끄기 전에 즐겨찾기 정보를 저장합니다.");
  }

  //아 공용이구나!
  //static이 붙어있는 메서드 안에서는 static이 없는 메서드 호출을 불가함.
  //=> static이 붙어있는 메서드가 먼저 해석되기에 static이 없는 메서드들은 그 다음 해석되어 들어갈 수 없음.
  public static void setChannelInfo(){
//    System.out.println(price);
    System.out.println("전원이 들어오기 전 채널 정보를 받아옵니다.");

  }



}
