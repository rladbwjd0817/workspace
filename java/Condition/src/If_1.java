/*
if문 문법
if(참, 거짓을 판단할 수 있는 조건){
  ..실행코드;
  ..실행코드;
  ..실행코드;
}
 조건이 참이면 실행코드 실행, 거짓이면 실행코드 실행 X
*/
public class If_1 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    int num = 6;
    int num2 = 3;

    //만약에 num이 5보다 작으면......
    if(num >= 5 && num2 < 2){
      System.out.println(1);
    }

    System.out.println("프로그램 종료");
  }
}
