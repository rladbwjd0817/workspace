//숫자를 1부터 시작
//합이 50을 넘으면 반복 중단
//합과 마지막으로 더한 숫자 출력 - 무한루프 & break

public class Break_continue_test_4 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;

    while (true){
      sum = sum + i;
      if (sum >= 50) {
        break;
      }
      i++;  //<<1부터 계속 더해야 하니까 1씩 증가시켜야 해!!
    }
    System.out.println("총 합 : " + sum);
    System.out.println("마지막으로 더한 숫자 : " + i);
  }
}
