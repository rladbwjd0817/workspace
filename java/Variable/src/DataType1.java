public class DataType1 {
  public static void main(String[] args) {
    int num1 = 10;
    byte num2 = 77;
    long num3 = 1005;
    short num4 = 1004;

    double num6 = 10.5;
    //float num5 = 10.5;

    boolean num7 = true;
    boolean num8 = false;

    System.out.println(num7);

    //쌍따옴표로 감싸진거면 무조건 문자열, ''이건 문자
    //문자는 저장할 때 유니코드(숫자)로 저장, char에는 문자로 저장가능
    char c = '☆';
    System.out.println(c);


    String name = "홍길동";
    System.out.println(name);
  }
}
