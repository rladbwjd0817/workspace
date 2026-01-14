import java.util.Scanner;

public class Array_Test_2_1 {
  public static void main(String[] args) {
    //Scanner로 정수 하나 입력받아
    Scanner sc = new Scanner(System.in);
    System.out.print("생성할 배열의 길이 : ");

    //키보드로 입력받을 배열의 크기
    int length = sc.nextInt();
    int[] arr = new int[length];
    //배열의 데이터 저장
    for (int i = 0; i < arr.length; i++){
      arr[i] = i +1;
    }
    //배열 모든 요소의 합
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }
    //평균
    double avg = (double) sum / arr.length;
    System.out.println("배열 모든 요소의 평균 : " + avg);
  }
}
