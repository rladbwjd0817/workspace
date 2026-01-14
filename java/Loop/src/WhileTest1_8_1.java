import java.util.Scanner;

public class WhileTest1_8_1 {
  public static void main(String[] args) {
    //키보드로 정수를 입력 받아
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력 : ");

    int i = sc.nextInt();
    int j = 1;
    int cnt = 0; // 짝수의 갯수 저장

    // 1부터 입력받은 수까지 짝수의 갯수 구해
    while (j < i){
      if (j % 2 == 0){
        cnt++;
      }
      j++;
    }
    System.out.println(cnt);
    //int num = sc.nextInt();
    /* int cnt = 0;
    while(i < num +1){
    if( i % 2 == 0){

    * */
  }
}
