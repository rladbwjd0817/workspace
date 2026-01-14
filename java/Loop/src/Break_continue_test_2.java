// 숫자를 1 ~ 7까지 하나씩 출력
// 7이 나오면 반복문 종료 - break

public class Break_continue_test_2 {
  public static void main(String[] args) {
    for (int i = 1; i < 8; i++){
      if (i == 8){
        break;
      }
      System.out.println(i);
    }
  }
}
