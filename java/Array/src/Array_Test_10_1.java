import java.util.Scanner;

public class Array_Test_10_1 {
  public static void main(String[] args) {
    //정수 5개를 저장하는 배열
    int[] arr = new int[5];
    //Scanner를 통해 값을 입력받고, 하나씩 배열의 요소에 저장
    Scanner sc = new Scanner(System.in);
    //배열의 크기 만큼 키보드 입력하는 것이 반복
    //arr[i] ->
    for (int i = 0; i < arr.length; i++){
      System.out.print(i + " 요소 입력 : ");
      arr[i] = sc.nextInt();
    }
    System.out.println("======배열의 모든 요소=====");
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i] + " ");
    }
  }
  //배열의 요소 확인
  //배열의 요소 다 출력 - 반복문 활용
}
