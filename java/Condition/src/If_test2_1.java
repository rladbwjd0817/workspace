import java.util.Scanner;

public class If_test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a + b > c || b + c > a || c + a > b){
      System.out.println("삼각형이 가능합니다.");
    } else {
      System.out.println("삼각형이 안됩니다.");
    }
  }
}
