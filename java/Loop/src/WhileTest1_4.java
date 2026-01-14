import java.util.PrimitiveIterator;

public class WhileTest1_4 {
  public static void main(String[] args) {
    //반복 시작점
    int a = 10;

    //반복 조건 - 10~0까지 출력
    while (a > -1){
      System.out.println(a);
      a--;
    }

    System.out.println();
    /// ///////////////////////////////////////////////
    while (a-- > 0){
      System.out.println(a);
      //반복 파기 할 코드
//      --a;
    }
    //증감연산자는 ++, -- 위치가 뒤에 있으면 맨 마지막에 해석
    //->While(a-- > 0) -> a가 0보다 크며녀 1을 줄인다.
    //그렇기에 0도 포함!
  }
}
