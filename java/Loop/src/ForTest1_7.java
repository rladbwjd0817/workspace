public class ForTest1_7 {
  public static void main(String[] args) {
    int cnt = 0;
    for (int i = 1; i < 101; i++){
      if (i % 5 == 0){
        System.out.println(i + " "); // 반복되는 값을 모두 출력
        ++cnt;
      }
    }
    System.out.println(cnt);
    //cnt는 5의 배수인 수의 갯수라 하나만 출력 -> for 문에 들어가지 X
  }
}
