public class Method_5 {
  public static void main(String[] args) {
    int a = test2(2, 8 ); //10이라는 결과가 나오나 출력은 X
    System.out.println(a);

    String result = test3("김유정");
    System.out.println(result);

    System.out.println(test3("BTS"));
  }

  //매개변수로 전달된 문자열 뒤에 "님"을 더하여 리턴하는 메서드
  public static String test3(String name){
    return name + "님";

  }

  //매개변수로 전달된 두 정수의 합을 출력하는 메서드
  public static void test1(int a, int b){
    System.out.println(a + b);
  }
  //매개변수로 전달된 두 정수의 합을 리턴하는 메서드
  /* return:
  *  결과를 개발자에게 돌려준다. - 뱉어냄
  */

  public static int test2(int a, int b){
    return a + b; //return 되는 자료형과 같은 자료형을 메서드 주소에 기입!
  }
}
