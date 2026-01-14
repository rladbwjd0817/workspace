import java.util.Scanner;

public class If_test1_5 {
  public static void main(String[] args) {
    System.out.print("점수 입력 : ");
    Scanner sc = new Scanner(System.in);
    String grade = "C";

    int num = sc.nextInt();

    if (num > 90 && num <= 100){
        grade = "A";
    } else if (num > 80 ) {
        grade = "B";
    }
//    else {
//        grade = "C";
//    }
    System.out.println("학점은 " + grade + " 입니다.");
    //"어떻게 하면 중복 코드를 없앨 수 있을까?"
    //중복 코드 : System.out.println("학점은 A입니다.");
    //ㄴ변수 String grade = "" 지정

  }
}
