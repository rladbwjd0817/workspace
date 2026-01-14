import java.util.Scanner;

public class Method_Test_2_1 {
  public static void main(String[] args) {

    System.out.print("입력받을 두 수 : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = test2_2(a, b);
    System.out.println("두 수의 곱은 : " +  result);
    //    int num = test2_2(3,5);
    //    System.out.println(num);

    int max = test2_3(7, 1);
    System.out.println(max);

    String str = test2_4("Merry", "Christmas");
    System.out.println(str);
    System.out.println("등급은 : " + test2_5(80));

    test2_6(14);
//    System.out.println(i);

    double d = Math.pow(test2_7(4),2);
    System.out.println("제곱 값 : " + d);


    test2_9(4);
    test2_10("콘서트 가고싶당");


  }
  public static int test1(int a, int b){
    return a + b;
  }

  public static int test2_2(int a, int b){
    return a * b;
  }

  public static int test2_3(int a, int b){
    int max = Math.max(a,b);
    return max;
  }

  public static String test2_4(String str, String str2){
//    System.out.print(str);
//    System.out.println(str2);
    return str + str2;
  }

  public static String test2_5(int a){
    String grade = "";
    if (a >= 90){
      grade = "A"; //return "A";
    } else if (a > 70) {
      grade = "B"; //return "B"
    }else {
      grade = "C"; //return "C"
    }
    System.out.print(grade);
    return grade;
  }

  //
  public static String test2_6(int a){
    //문자열 -> 정수 Integer.parseInt("6"); -> 문자열 6이 정수 6으로 나옴
//    int num = Integer.parseInt("a");
    //정수 -> 문자열 String.valueOf(6); -> 정수 6을 문자열 "6"으로 나옴
//    String b = String.valueOf(6);
    return a + "";
  }


  public static double test2_7(double a){ // a = 4;
  //제곱 값 : 자신을 입력받은 수 만큼 곱하는 것 => 반복
  //i = 곱하는 횟수
  double mul = a * a; // 곱셈 결과를 저장하는 창고
  for (double i = 1; i == a; i++){
    mul++;
  }
  System.out.println(mul);
  return mul;
  }

  public static double test2_8(int num1, int num2, int num3){
    double avg = (num1 + num2 + num3) / 3.0;
    return avg;
  }

  public static int test2_9(int a){ //a = 10; 가정
    //1 ~ a 까지 저장
    //저장 한 수 중 홀수만 구하고, 홀수의 합을 리턴
    int sum = 0;
    for (int i = 1; i < a + 1; i++){
      if (i % 2 != 0){
        sum = sum + i;
      }
    }
    System.out.println(sum);
    return sum;
  }

  public static boolean test2_10(String str){
    //삼항연산자 : 조건 ? 참 : 거짓;
//    boolean str2;
//    str2 = str.length() % 2 == 0 ? true : false;
//    System.out.println(str2);
//    return str2;

//    return str.length() % 2 == 0 ? true : false;
    return str.length() % 2 == 0;
  }
}
