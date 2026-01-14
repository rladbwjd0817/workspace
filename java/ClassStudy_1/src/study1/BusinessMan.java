//자식클래스
package study1;

public class BusinessMan extends Man {
  String company;

  //모든 멤버변수를 초기화하는 것이 좋은 코드는 맞음
  //But, 상속받은 멤버변수는 어디서 초기화하는게 좋을까???
  //=>부모클래스의 멤버변수 초기화는 부모클래스에서 해야 함
  //상속관계에 있는 클래스의 생성자 첫 줄에는 super(); 명령어가 숨겨져있음!
  //super(); => 부모클래스의 생성자를 호출하는 명령어
  public BusinessMan(String company){
    super("kkk"); //매개변수에 직접 데이터를 넣을 수 있음
    this.company = company;
//    name = null;
  }


  public void tellCompany(){
    System.out.println("Company is " + company);
  }

}
