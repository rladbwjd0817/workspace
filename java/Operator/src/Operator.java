import java.net.SocketTimeoutException;

public class Operator {
  public static void main(String[] args){
    //산술 연산자(+, -, *, /, %)
    // '%' : MOD연산자, 나눗셈의 나머지 값을 구하는 연산자
    int result1 = 10 % 4;
    System.out.println(result1);

    //비교 연산자
    // >, <, >=(이상), <=(이하), ==(같다), !=(다르다),
    System.out.println(10 > 3);
    System.out.println(3 == 3);

    //논리부정 연산자
    //'!' -> 논리를 뒤집어!
    //ex) !true -> false, !false -> true

    //논리연산자
    // &&, ||(버티컬바), &, |
    //그리고 (and 연산) : &&
    //또는 (or 연산) : ||
    //비교 연산자 우선순위가 높음.
    System.out.println(3 > 1 && 2 > 1);

    int num1 = 5;
    int num2 = 7;
    boolean result3 = num1 > 3 || num1 != 7;

    boolean result4 = num1 * 2 > 10 && !(num2 % 2 == 1);



  }
}
