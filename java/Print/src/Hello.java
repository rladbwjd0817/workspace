
//자바의 모든 내용은 클래스 안에 작성한다!
//클래스 안에는 반드시 main 메서드가 존재해야 한다.
//우리가 작성하는 코드는 반드시 main 메서드 안에 작성한다.
//코드 해석은 main 메서드 안의 첫 줄부터 차례로 해석함.
//명령어가 끝나면 반드시 ; 세미콜론을 붙여야 함.
public class Hello {
  public static void main(String[] args){ //main 메서드 - 중괄호가 닫히는 부분까지
    //출력문 : ()소괄호 안에 있는 내용을 출력 + 한 줄 개행(줄 바꾸기)
    //문자열을 출력할 땐 반드시 ""쌍따옴표 감싸야 함.
    //문자 : 한 글자, 문자열 : 한 글자 이상의 글자
    System.out.println("hello~"); //->출력문
    System.out.println("A");

    //소괄호 안의 내용을 출력
    System.out.print("hi~");
    System.out.print("thank u!");
    System.out.println("how are u?");

    //숫자는 쌍따옴표에 감싸지 않는다!
    System.out.println(613);
    System.out.println("613"); //->문자열은 연산이 안됨 ex)전화번호, 차량번호
  }
}
