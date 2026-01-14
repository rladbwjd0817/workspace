public class Method_4 {


  public static void main(String[] args) {
    printSum(10, 25);
    printInfo("YJ", 29);
  }

  //매개변수로 전달된 이름과 나이를 출력하는 메서드
  public static void printInfo(String name, int age){
    System.out.println("이름은 : " + name);
    System.out.println("나이는 : " + age);
  }


  //매개변수로 들어온 두 정수의 합을 출력하는 메서드
  public static void printSum(int a, int b){
    //int a = 10; int b = 25;
    System.out.println(a + b);
  }



}
