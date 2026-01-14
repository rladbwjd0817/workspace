import java.util.Scanner;

public class If_test1_3 {
  public static void main(String[] args) {
//    System.out.print("정수 입력 : ");
    System.out.println("첫번째 수 : ");
    System.out.println("두번째 수 : ");

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b){
      System.out.println("a가 큽니다.");
    } else if (a < b) {
      System.out.println("b가 큽니다.");
    } else {
      System.out.println("같습니다.");
    }

    //System.out.println( a > b ? "a" : b > a ? "b" : "같다" )
  }
}
