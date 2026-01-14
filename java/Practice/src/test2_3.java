import java.util.Scanner;

public class test2_3 {
  public static void main(String[] args) {
    //String으로도 풀 수 있음
    //1~99까지의 정수를 키보드로 입력받아
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int x = i / 10;
    int y = i % 10;
    String word = "박수";
    if (x == 3 || x == 6 || x == 9){
       word = "짝";
    }
    System.out.println();
  }
}
