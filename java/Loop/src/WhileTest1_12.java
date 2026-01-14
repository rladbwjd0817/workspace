public class WhileTest1_12 {
  public static void main(String[] args) {
    System.out.println("-예시-");
    //반복 시작점
    int i = 2; //2단 시작부분
    int j = 1; //2단 곱하는 부분

    //반복조건
    while (j < 10){
      System.out.println(i + " * " + j + " = " + i  * j);
      j++;
    }
  }
}
