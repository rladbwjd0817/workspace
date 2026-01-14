import java.util.Scanner;

public class WhileTest1_8 {
  public static void main(String[] args) {
    //키보드의 정수를 입력받아
    Scanner sc = new Scanner(System.in);
    //1부터 키보드로 입력받은 수
    int i = 1;
    int j = sc.nextInt();

    //1 부터 입력받은 수까지 중 짝수의 갯수 구하기
    while (j < 50){
      if (j % 2 == 0){
        j++;
      }
      i++;
    }
    System.out.println(j);
  }
}
