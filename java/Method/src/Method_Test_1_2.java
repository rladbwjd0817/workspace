public class Method_Test_1_2 {

  public static void main(String[] args) {
    test11(5, 9);
    test12(10);
    test13(10, 1);
    test14(2, 8);
    test15("캬", 10);
  }

  public static void test11(int a, int b){
    if (a % 2 == 0 && b % 2 == 0){
      System.out.println("두 수는 짝수입니다.");
    } else if (a % 2 != 0 && b % 2 != 0) {
      System.out.println("두 수는 홀수입니다.");
    } else {
      System.out.println("한 수만 짝수입니다.");
    }
  }

  public static void test12(int a){ // 난 a = 5 라고 가정하고 풀기
    for (int i = 0; i < a +1; i++)
    System.out.println("입력받은 숫자 : " + i);
  }

  public static void test13(int a, int b){ //a = 1, b = 10
    //a, b 두 개 중 큰 수와 작은 수 구분
    int max = Math.max(a, b);
    int min = Math.min(a, b);

    //min = 1, max = 10 => 2~9 사이
    for (int i = min + 1; i < max; i++){
      System.out.println(i);
    }
  }

  public static void test14(int a, int b){
    //5의 배수 갯수 저장하는 창고
    int cnt = 0;
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    for (int i = min + 1; i < max; i++){
      if (i % 5 == 0) cnt++;
    }
    System.out.println("5의 배수 갯수 : " + cnt);
  }

  public static void test15(String str, int num){
    //str = "k", num = 3 => kkk
    for (int i = 0; i < num; i++){
      System.out.print(str);
    }
  }






}
