//1~10까지의 숫자 중에서 홀수만 출력하는 프로그램 (continue)

public class Break_continue_test_1 {
  public static void main(String[] args) {
    for (int i = 1; i < 11; i++){ //i를 출력 후 i는 1 증가
      if (i % 2 == 0){
        continue;
      }
      System.out.println(i);
    }
  }
}
