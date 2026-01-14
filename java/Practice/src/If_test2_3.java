import java.util.Scanner;

public class If_test2_3 {
  public static void main(String[] args) {
    System.out.print("1~99 사이의 정수를 입력하시오>>");
    //1~99까지의 정수를 키보드로 받아
    Scanner sc = new Scanner(System.in);
    //박수 저장할 창고 만들어
    int clap = 0;

    //정수를 10의 자리와 1의 자리로 나눠서 진행
    int tens = sc.nextInt();
    int ones = sc.nextInt();
    //정수에 3,6,9 중 하나가 있으면 박수짝 ->3의 배수로 가면 안됨.
    //두개 있으면 박수짝짝 ->두개 있어도 박수짝이 되버리니까
    //10의 자리 정수를 10으로 나눴을 때 몫이 3,6,9면 박수
    //1의 자리 정수는 10으로 나누었을 때 나머지가 0이면 박수
    int i1 = tens / 10;
    int i2 = ones % 10;
    if(i1 == 3 || i1 == 6 || i1 == 9){
      ++clap;
    }
     else if(i2 % 10 == 0){
      ++clap;
    }
    switch (clap){
      case 1:
        System.out.println("박수짝");
        break;
      case 2:
        System.out.println("박수짝짝");
    }
  }
}
