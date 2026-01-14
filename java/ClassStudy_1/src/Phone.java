//휴대폰 객체 생성을 위한 설계도
//클래스의 구성 요소 :
// 1. 변수(멤버 변수, 필드field) : 데이터
//    지금까지 선언한 변수(메서드 안에서 선언한 변수)는 지역변수(local variable)
//    member variable 과 local variable의 차이점 : 초기화 유무
//    지역변수는 반드시 초기화가 필요함!!
//
//    멤버변수는 자동으로 초기화가 되어버림! => 배열이랑 같은 값으로 초기화 됨!!!!
// 2. 메서드의 정의 - 메서드의 호출은 못함! : 기능
// 3. 생성자 -> 다음주 수업

public class Phone {
  //지금까지 변수선언을 메서드의 정의 안에서 했음
  //이젠 클래스 안에서 변수 쓸 수 있음.
  //변수들은 내가 만드는 거라 정답 없음.
  int price; // 폰의 가격 정보 : 데이터
  String modelName; // 모델명
  String brand; // 브랜드
  String color; // 색상

  //문자 보내는 기능
  //접근제한자 리턴타입 메서드명(매개변수)
  public void sendSms(String msg){
    System.out.println("문자를 보냅니다." + msg);
  }

  //전화하기 기능
  public void call(String sender){
    System.out.println(sender + "님으로부터 전화가 왔습니다.");
  }

}
