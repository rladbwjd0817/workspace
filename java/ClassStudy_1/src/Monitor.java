public class Monitor {
  String modelName;
  int price;
  double inch;

  //생성자 필요한 만큼 만들 수 있음.
  public Monitor(){ //1번 생성자

  }

//  public Monitor(int num){
//
//  }  => 생성자는 같은 자료형이 있으면 오류 뜸!!!! 변수명은 비교대상이 아님!!!!!!!!!!

  //생성자 : 멤버변수값 초기화

  public Monitor(int price){ //2번 생성자
    this.modelName = null; //<<이 클래스에서의 정의된 modelName에 null값을 넣으세요.
    this.price = price;
    inch = 0.0;
  }

  public Monitor(String a){

  }
  /* 메서드 - 소문자();
     메서드 오버로딩 :  메서드의 매개변수의 갯수, 매개변수의 자료형이 다르면 메서드명 중복선언 가능!
  *  ㄴ우리를 편하게 하기 위해서 만든 기능
  * */

  public void aaa(){
    System.out.println(10);
  }

  public void aaa(int a){

  }

  public void aaa(String a){

  }


}
