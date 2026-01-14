//코드 연습을 위한 class, 설계도 X
//클래스를 만든 후 사용을 위해서는 반드시 객체를 생성해야 한다.
public class PhoneTest {
  public static void main(String[] args) {
    //기본자료형
    int num; //변수

    //배열
    int[] arr; //배열, 참조변수


    //Phone class에 대한 객체 선언
    Phone p1; //참조변수, 객체, 인스턴스
    //객체 - 뭉탱이
    //인스턴스 - 세세하게 하나를 말할 때


    //객체 생성
    //문법 : new 뒤에 클래스명();
    p1 = new Phone();

    //객체 선언 및 생성문법
    //클래스명 객체명 = new 클래스명();
    //클래스도 자료형이다.
    Phone p2 = new Phone(); // new : 새로운 인스턴스를 생성하세요.

    //객체에 포함된 멤버변수에 접근하는 문법
    //-> 객체명.멤버변수명;
    //p1 인스턴스의 가격정보를 출력
    System.out.println( p1.price );
    System.out.println( "휴대폰 값 : " + p1.price + "원");

    //p1 인스턴스의 모델명을 s20으로 변경
    System.out.println(p1.modelName);
    p1.modelName = "s20";
    System.out.println(p1.modelName);
    System.out.println(p2.modelName);

    //객체에 포함된 메서드 호출 문법
    // -> 객체명.메서드호출;

    p1.sendSms(" 잠이와요");



  }
}
