public class Method_1 {

  public static void main(String[] args) {
    //자바프로그램은 ★ main 메서드 안에서 ★ 위에서 아래로 순차적으로 진행
    System.out.println(1);
    hello(); //메서드 호출 -> 이제 출력 되는 거임
    System.out.println(2);

  }


  // <메서드의 정의> -> 호출해야 출력됨.
  //접근 제한자 - public
  //리턴타입 - void
  //메서드명 - 마음대로 넣어도 됨 => 변수명처럼 소문자로
  public static void hello(){
    System.out.println("반가워용!");
    System.out.println("hi!!");
  }



}
