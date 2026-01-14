import java.util.Scanner;

public class If_test2_1 {
  public static void main(String[] args) {
    //스캐너를 이용해 정수를 3개 받아
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    //삼각형 만들 수 있는지 확인해
    //삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 커야해

    if(a + b > c || b + c > a || c + a > b){
      System.out.println("삼각형 가능!!!!");
    }else {
      System.out.println("삼각형 안되지롱@@@");
    }
  }
}
