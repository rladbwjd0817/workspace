public class WhileTest1_6 {
  public static void main(String[] args) {
    int cnt = 0; //3의 배수의 갯수를 저장할 변수

    //1. 1~100까지 반복하면서 해당 숫자가 3의 배수인지 체크
    //2. 3의 배수라면 cnt 값을 1 증가
    //3. cnt 출력

    //반복의 시작점
    int i = 1;
    //반복 조건
    while(i < 101){
      if (i % 3 == 0){
        cnt++;
      }
      ++i;
    }
    System.out.println(cnt);
    //System.out.println(100/3); 하면 출력값 나옴
    /// //////////////////////////////////////////////////////////////////////////
//    int count = 0;
//    for (int index = 1; index < 101; index++){
//      if (index % 3 == 0){
//        count++;
//      }
//      System.out.println(count);
//    }
  }
}
