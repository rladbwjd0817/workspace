public class While_1 {
  public static void main(String[] args) {
    //반복의 시작점  //개발할 땐 0이 웬만하면 시작점!!!!!!!!!
    int num = 0;

    //num이 10보다 작을 경우에 반복
    //반복 조건
    while(num < 5){
      System.out.println(1);
      System.out.println(2);
      //반복을 파기 할 조건
      num++; //++num; num+=1; num = num + 1;
    }
    /// ////////////////////////////////////////////////
    //for 문(반복시작점; 조건; 조건파기 할 코드)
    //해석순서는 While이랑 똑같음
    for(int i = 0; i < 5; i++) {
      System.out.println(1);
      System.out.println(2);
    }
    //해석순서
    //1. 조건해석
    //2. 실행문 위에서 아래 방향으로 해석
    //3. 맞으면 다시 조건으로 올라가서 반복
    //4. 조건이 거짓이면 반복 종료 -> 조건이 마지막으로 끝남!!!!

    //해석
    //num = 1
    //시작
    //1
    //2  num=2
    //<조건>
    //1
    //2  num=3
    //<조건>
    //1
    //2  num=4
    //<조건>
    //1
    //2  num=5
    //<조건>
    //1
    //2  num=6
    //<조건>
    //조건이 맞지 않아 반복 종료


  }
}
