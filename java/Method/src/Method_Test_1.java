import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Method_Test_1 {
  public static void main(String[] args) {
    printHello("안녕하세요");
    printInt(77);
    printString("뭐 먹지?");
    printSum(70, 20);
    printI(7, 9, 55);
    printN(10, 3);
    printSt("와", "배고프당");

    Scanner sc = new Scanner(System.in);
    System.out.print("8번문제 매개변수 : ");
    int a = sc.nextInt();
    printTest8(a);
    System.out.print("9번 문제 두 수의 합 - ");
    int b = sc.nextInt();
    int c = sc.nextInt();
    printTest9(c, b);

    System.out.print("10번 문제 : ");
    int h = sc.nextInt();
    printTest10(h);
//    if (h % 2 == 0){
//      System.out.println("짝수입니다.");
//    }else {
//      System.out.println("홀수입니다.");
//    }
  }

  public static void printHello(String hi){
    System.out.println(hi);
  }

  public static void printInt(int i){
    System.out.println(i);
  }

  public static void printString(String i){
    System.out.println(i);
  }

  public static void printSum(int a, int b){
    System.out.println("두 수의 합은 : " + (a + b));
  }

  public static void printI(int a, int b, int c){
    System.out.println("세 수의 곱은 : " + (a * b * c));
  }

  public static void printN(int i, int j){
    System.out.println("두 수를 나눈 몫 : " + i / j);
    System.out.println("두 수를 나눈 나머지 : " + i % j);
  }

  public static void printSt(String i, String j){
    System.out.println(i + j);
  }

  //키보드로 입력받은 정수를 매개변수로 받아 해당 정수를 출력하는 메소드 - main메서드에서 적어야 함.
  public static void printTest8(int num){
    System.out.println(num);
  }

  public static void printTest9(int a, int b){
    System.out.println("두 수의 합 : " + (a + b));
  }

  public static void printTest10(int q){
    System.out.println(q % 2 == 0 ? "짝수입니다." : "홀수입니다.");
  }

}
