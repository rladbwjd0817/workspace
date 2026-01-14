import java.util.Scanner;

public class Case_test3_3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //두 정수, 문자열(연산자) 변수 선언
    int a, b;
    String cha;

    System.out.println("-결과예시 (1) -");
    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.print("두 번째 수 : ");
    b = sc.nextInt();
    System.out.print("연산자 : ");
    cha = sc.next();

    if (cha.equals("*")){
      System.out.println(a + "*" + b + "=" + a * b);
    } else if (cha.equals("+")) {
      System.out.println(a + "+" + b + "=" + a + b);
    } else if (cha.equals("-")) {
      System.out.println(a + "-" + b + "=" + (a - b));
    } else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }


  }
}
