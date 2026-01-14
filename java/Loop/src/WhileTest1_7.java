public class WhileTest1_7 {
  public static void main(String[] args) {
    int j = 1; // 5의 배수인 수 모두 출력
    int cnt = 0; // 5의 배수인 수 갯수 저장

    //5의 배수인 수
    while(j < 101){
      if (j % 5 == 0){
        System.out.print(j + " "); //만약에 j가 5의 배수면 출력해라
        ++cnt;     //5의 배수 갯수
      }
      j++; //출력하고 j 증가
    }
    System.out.println();
    System.out.println(cnt);
  }
}
