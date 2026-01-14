/* ex)1+2+2+4+5......+16 = 306
이라면 300을 넘은 최초로 넘었을 때 값이 306, 마지막으로 더해진 값 16을 각각 출력
* */

public class WhileTest1_13 {
  public static void main(String[] args) {
    //1부터 시작, 더한 값 저장하는 창고 만들어
//    int sum = 0;
//
//    for (int i = 1; sum < 301; i++){
//      sum = sum + i;
//    }
//    System.out.println("누적 합계 : " + sum);
//    System.out.println();
//    //마지막으로 더해진 값 출력해
    int sum = 0;
    int i = 1;
    //for 문 안에 시작점이면 상관없음!! 꼭 변수선언 아니어도 됨.
    //조건이 안맞으면 끝나는데 i는 1 증가 후 조건을 보니 1증가 하기 전 i의 값을 구해야 함. -> i에서 -1을 해줘야 함.
    for (i = 1; sum <= 300; i++){
        sum = sum + i;
      System.out.println("i = " + i + ", sum = " + sum);
      }

    System.out.println(sum);
    System.out.println(i-1);


  }
}
