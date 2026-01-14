package interface1;

//interface : 기능모음집(메서드모음)! ex)리모컨 버튼들, 자판기 버튼들 => class에 얹혀서 살아야 함.
//interface 안에는 메서드의 정의만 들어올 수 있음.
//But, 중요한 것은 메서드의 내용부가 없다는 것이다. -> 추상메서드
//interface 안에는 멤머변수 사용 못 함! 생성자도 없음!
//interface는 생성자가 없기에 객체 생성 못함!
//interface에서는 메서드의 접근제한자가 자동으로 public이 붙음!
//class에서는 생략되면 자동으로 default 값이 붙음!
//interface는 규율느낌 => class가 많으면 통제가 어려우니 interface를 통해 규율을 정해 통제함.

public interface VendingMachine {
  //커피 뽑는 기능
  public void getCoffee();
  //우유 뽑는 기능
  public void getMilk();
  //돈 넣기 기능
  public void pay();
}
