import java.util.Scanner;

public class Infinityloof {
  public static void main(String[] args) {
    //while, for 둘 다 무한루프 사용가능
    /* 대부분 while 문으로 무한루프를 작성
    <while문 무한루프>
    while(true){
      System.out.println();
    }

    <for문 무한루프>
    for(;;){
      System.out.println();
    }
    * */

    //무한루프 : 반복을 끝내지 않고 무한적 진행하는 문법
    //무한루프는 반복 횟수를 모를 때 사용
    Scanner sc = new Scanner(System.in);


    while (true){
      System.out.print("점수를 입력하세요(0 ~ 100점)>> ");
      int score = sc.nextInt();
//      System.out.println("다시 입력할래??!!!");

      //입력받은 정수가 1~100이라면 반복문 벗어나야 해!
      if (score >= 0 && score <= 100){
        //switch case break문에서의 break랑 다름!
        //반복문 안에서의 break는 가장 가까운 반복문(for, while)을 벗어나는 명령
        break;
      }

    }


  }
}
