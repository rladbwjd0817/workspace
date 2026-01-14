public class WhileTest1_5 {
  public static void main(String[] args) {
    //반복 시작점
    int i = 1;
    int sum = 0;

    //반복 조건 ->더하는 행위가 반복
    while (i < 11){
      sum = sum + i;
      System.out.println(sum);
      ++i;

    }
  }
}
