public class If_test1_1 {
  public static void main(String[] args){
//    int num1, num2; -> 동일하면 나열가능
    int num1 = 7;
    int num2 = 50;
    int num3 = num1 + num2;

    if (num3 > 50){
      System.out.println("두 수의 합이 50보다 큽니다.");
    } else if (num3 <= 50) {
      System.out.println("두 수의 합이 50이하 입니다.");
    }
    //else{System.out.println("작다.");

    System.out.println( num3 > 50 ? "크다" : "작다");
    //int num3 = num3 > 50 ? "큽니다" : "작습니다";

    //삼항연산자 : 연산자가 3개 인 것 / if else 문을 대체해서 사용 가능!
    //조건 ? 참 일 때 실행 코드 : 거짓일 때 실행 코드;
    int num = 10 > 3 ? 5 : 10;
    //10 > 3의 조건이 맞으면 5, 거짓이면 10을 출력



  }
}
