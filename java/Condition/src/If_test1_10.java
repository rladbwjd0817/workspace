import java.util.Scanner;

public class If_test1_10 {
   public static void main(String[] args) {
    System.out.println("-출력예시-");
    System.out.println("첫번째 수 : ");
    System.out.println("두번째 수 : ");
    System.out.println("세번째 수 : ");

    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();

    if (first > second){
      System.out.println(first + ">" + second + ">" + third);
    } else if (second > third) {
      System.out.println(second + ">" + third + ">" + first);
    } else if (third > first) {
      System.out.println(third + ">" + first + ">" + second);
    }

  /* <선생님 풀이>
  *  int a, b, c;
  *  System.out.println("첫번째 수 : ");
  *  a = sc.nextInt();
  *  System.out.println("두번째 수 : ");
  *  b = sc.nextInt();
  *  System.out.println("세번째 수 : ");
  *  c = sc.nextInt();
  *
  *   int max, mid, min;
  *   a가 가장 큰 경우, b가 가장 큰 경우, c가 가장 큰 경우
  *   if(a > b && a > c){
  *     max = a;
  *     *if(b > c){
  *      mid = b;
  *      min = c;
  *   } else{
  *     *mid = c;
  *      min = b;       <<<<<<<<<삼항 : mid = b > c ? b : c;
  *                                    min = b > c ? c : b;
  *   }
  * } else if(b > a && b > c){
  *     max = b;
  *     mid = a > c ? a : c;
  *     min = c > a ? c : a;
  * }  else{
  *     max = c;
  *     mid = a > b ? a : b;
  *     min = b > a ? b : a;
  * }
  *
  *
  * System.out.println(max + " > " + mid + " > " + min);
  *
  *
  *
  *
  * */
  }
}
