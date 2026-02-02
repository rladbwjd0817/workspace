import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    //        Scanner 생성
    Scanner sc = new Scanner(System.in);
//        1~999까지의 수 중 임의의 숫자를 키보드로 입력받기
    System.out.print("입력받을 수 : ");
    int num = sc.nextInt();

//        박수를 저장할 변수 초기화
    int clap = 0;
//        100의 자릿 수, 10의 자릿 수, 1의 자릿 수 구분하기
    int hundreds = num / 100;
    int tens = num / 10 % 10;
    int ones = num % 10;
//        숫자 13 가정
//        입력받은 수 중 3,6,9 들어가면 박수 1번
//        3,6,9 가 2개 -> 박수 2번
//        3,6,9 3개 -> 박수 3번
    if (hundreds == 3 || hundreds == 6 || hundreds == 9) clap++;
    if (tens == 3 || tens == 6 || tens == 9) clap++;
    if (ones == 3 || ones == 6 || ones == 9) clap++;
    System.out.println("박수 "+ clap + "번");

  }
}
