import java.util.Scanner;

public class If_test1_9 {
  public static void main(String[] args) {
    System.out.println("-출력예시-");
    System.out.println("첫번째 수 : ");
    System.out.println("두번재 수 : ");

    Scanner sc = new Scanner(System.in);

    int a = sc. nextInt();
    int b = sc. nextInt();

    if (a > b){
      System.out.println(a + ">" + b);
    } else{
      System.out.println(b + ">" + a);
    }

    //upgrade!
    /* int max; -> 두 수 중 큰 수를 저장
     *  int min; -> 두 수 중 작은 수를 저장
     * if(a > b){
     *   max = a;
     *   min = b;
     * } else{
     *   max = b;
     *   min = a;
     * }
     * System.out.println(max + ">" + min);
     * ===================더 요약==========================
     *   int a, b;
     *   int max = a > b ? a: b;
     *   int min = a > b ? b: a;
     *  */

  }
}
