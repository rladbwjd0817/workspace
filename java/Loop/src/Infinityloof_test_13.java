import java.util.Scanner;

public class Infinityloof_test_13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 1;
    int sum = 0;

    while (true){
      sum = sum + i;
      if (sum > 300){
        break;
      }
      i++; //300넘으면 i 증가할 필요가 없으니 i증가는 뒤로
    }
    System.out.println("300넘은 수 : " + sum);
    System.out.println(i);
  }
}
