package test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    System.out.println("---출력---");

    Scanner sc = new Scanner(System.in);

    int num1, num2, num3;
    System.out.print("첫 번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    num2 = sc.nextInt();
    System.out.print("세 번째 수 : ");
    num3 = sc.nextInt();


//        최대, 중간, 최소 값들 저장할 변수 선언 및 초기화
    int max, mid, min;

//      num1 = 최대값, num2 = 중간, num3 = 최소값 일 경우
//      num1 = 최소값, num2 = 최대, num3 = 중간값 일 경우
//      num1 = 중간값, num2 = 최소, num3 = 최대값 일 경우

    if (num1 > num2 && num1 > num3){
//            num1 = 3, num2 = 2, num3 = 1
      max = num1;
      mid = num2 > num3 ? num2 : num3;
      min = num2 > num3 ? num3 : num2;
    } else if (num2 > num3 && num2 > num1) {
//            num1 = 1, num2 = 3, num3 = 2
      max = num2;
      mid = num3 > num1 ? num3 : num1;
      min = num3 > num1 ? num1 : num3;
    } else {
//            num1 = 2, num2 = 1, num3 = 3
      max = num3;
      mid = num1 > num2 ? num1 : num2;
      min = num1 > num2 ? num2 : num1;
    }

    System.out.println(max + ">" + mid + ">" + min);



  }

}
