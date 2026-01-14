public class Variable4 {
  public static void main(String[] args){
    int a = 100;
    int b = 200;

    System.out.println("====바뀌기 전====");
    System.out.println("a = " + b);
    System.out.println("b = " + a);

    //아래에 두 변수의 값을 스위칭하는 코드를 작성
    // 1. 정수를 저장할 수 있는 변수 c 선언
    // 2. a 변수의 값을 c에 저장
    // 3. b에 저장된 값을 a에 저장
    // 4. c에 있는 값을 b에 저장
    int c;
    c = a;
    a = b;
    b = c;

    System.out.println("====바뀐 후====");
    System.out.println("a = " + b);
    System.out.println("b = " + a);
  }
}
