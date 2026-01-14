// 1~20까지의 숫자 중 3의 배수가 아닌 수
// 3의 배수가 아닌 수들의 합 - continue
// 코드는 main 메서드의 첫줄부터 아래로 차례로 실행!!


public class Break_continue_test_3 {
  public static void main(String[] args) {
    int sum = 0; // 3의 배수가 아닌 수들의 합을 저장할 창고

    for (int i = 1 ; i <= 20; i++){
      if (i % 3 == 0){
        continue;
      }
      sum = sum + i;
      System.out.print("3의 배수가 아닌 수 : " + i);
      System.out.println("   3의 배수가 아닌 수들의 합 : " + sum);
    }

    /*1. i는 1이고,
      2. 20 이하 이고
      3. 만약 i가 3으로 나누었을 때 나머지가 0이면 건너뛰고,
      4. sum에 i를 더한 값을 저장해
      5. 3으로 나누었을 때 나머지가 0이 아니라면
      6. 그리고 3의 배수가 아닌 수와 3의 배수가 아닌 수들의 합을 출력 하고
      7. i를 1증가해*/
  }
}
