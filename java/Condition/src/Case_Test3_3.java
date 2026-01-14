import java.util.Scanner;

public class Case_Test3_3 {
  public static void main(String[] args) {

//    System.out.println("-결과예시 (1) -");
//    System.out.println("첫 번째 수 : ");
//    System.out.println("두 번째 수 : ");
//    System.out.println("연산자 : ");
//
//    System.out.println("-결과예시 (2) -");
//    System.out.println("첫 번째 수 : ");
//    System.out.println("두 번째 수 : ");
//    System.out.println("연산자 : ");
//
//    System.out.println("-결과예시 (3) -");
//    System.out.println("첫 번째 수 : ");
//    System.out.println("두 번째 수 : ");
//    System.out.println("연산자 : ");

    //키보드 입력을 위한 선언
    Scanner sc = new Scanner(System.in);

    //키보드로 입력받은 두 정수를 저장할 변수
    int num1, num2;

    //키보드로 입력받은 연산자를 저장할 변수
    String oper;

    //키보드로 두 정수 및 연산자를 입력
    System.out.print("첫 번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    num2 = sc.nextInt();
    System.out.print("연산자 : ");
    oper = sc.next();

    //연산자에 따라 조건 구분
    if (oper.equals("+")){
      System.out.println(num1 + " + " + num2 + "=" + (num1 + num2));
    } else if (oper.equals("-")) {
      System.out.println(num1 + " - " + num2 + "=" + (num1 - num2));
    } else if (oper.equals("*")) {
      System.out.println(num1 + " * " + num2 + "=" + (num1 * num2));
    } else if (oper.equals("/")) {
      System.out.println(num1 + " / " + num2 + "=" + (num1 / (double)num2));
    } else {
      System.out.println("연산자를 잘못 입력했습니다.");
    }


//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    String num = sc.next();
//
//    if(num.equals("*") ){
//      System.out.println(a + " * " + b + " = " + a * b);
//    } else if (num.equals("+") ){
//      System.out.println(a + " + " + b + " = " + a + b);
//    } else{
//      System.out.println("연산자를 잘못 입력하였습니다.");
//    }

  }
}
