public class WhileTest1_3 {
  public static void main(String[] args) {
    //반복시작점
    int a = 2;

    //반복 조건 - 짝수 출력
    while (a < 11){
      System.out.println(a);
      //반복파기 할 코드
      a += 2;
    }
    System.out.println(); //->한줄 개행만 함. <br>과 같음
    /// /////////////////////////////////////////////
    int j = 2;

    while(j < 11){
      if (j % 2 == 0){
        System.out.println(j);
      }
      ++j;
    }
    //j의 시작점은 2
    //While 조건 보고 조건이 부합하면 if문 실행
    //if문 조건이 부합하면 실행문 출력
    //출력 후 1증가
  }
}
