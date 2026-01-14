import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-결과-");
    System.out.print("첫 번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int num2 = sc.nextInt();
    System.out.print("연산자 : ");
    String oper = sc.next();

    //Calculator 클래스의 객체 생성 => 객체명.메서드호출();
    Calculator cal = new Calculator();
    cal.setData(num1, num2, oper);
    cal.printAllData();

  }
}
