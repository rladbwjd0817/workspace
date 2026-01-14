import java.util.Scanner;

public class If_test1_10 {
  public static void main(String[] args) {
    System.out.println("-출력예시-");

    //세 정수를 선언하고 스캐너로 값 받아
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();
    System.out.print("세번째 수 : ");
    int c = sc.nextInt();

    int max, mid, min;


    if (a > b && a > c){
      max = a; mid = b; min = c;
      System.out.println(max + " > " + mid + " > " + min);
    } else if (b > a && b > c) {
      max = b; mid = c; min = a;
      System.out.println(max + " > " + mid + " > " + min);
    } else {
      max = c; mid = a; min = b;
      System.out.println(max + " > " + mid + " > " + min);
    }
    //2.세 수 중 큰 수의 조건을 잡아
    //1-1. a가 제일 큰 경우
    //a > b && a < c
    //1-2. b와 c 중에서 중간 값도 정해
    //b > c ->mid: b, min: c
    //b가 제일 큰 경우
    //b > a && b > c
    //c > a mid: c, min: a
    //c가 제일 큰 경우
    //c > a && c > b
    //a > b mid: a, min: c
    //세 수를 큰 순서대로 출력해
  }
}
