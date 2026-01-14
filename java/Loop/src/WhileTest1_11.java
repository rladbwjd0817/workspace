import java.util.Scanner;

public class WhileTest1_11 {
  public static void main(String[] args) {
  //키보드로 두 정수를 입력받아
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int i = sc.nextInt();
    System.out.print("두번째 수 : ");
    int j = sc.nextInt();

    int sum = 0;
//    //큰 값, 작은 값 정하기
    int min = i > j ? i : j;
    int max = i > j ? j : i;


    //입력받은 두 정수 사이의 모든 정수의 합을 출력해
    //더하는 행위가 반복되는 거야
    while (i < j){
      sum = sum + i;
      System.out.println(sum);
      i++;
    }

//    for (int i = i +1; num < max; i++){
//      sum = sum + i;
////      break;
//    }
//    System.out.println(sum);
  }
}
