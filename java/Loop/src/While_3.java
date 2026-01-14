public class While_3 {
  public static void main(String[] args) {
    //1~10까지의 합을 출력
    //1+2+3.....+9 -> 더하는 행위를 반복
    int a = 1;
    int sum = 0; //1~10까지의 합을 저장할 변수

    while (a < 11){
      sum = sum + a;
      ++a;
    }
    System.out.println(sum);

    //해석
    /* a = 1, sum = 0
    * 조건본 후 sum = sum + a 에서 오른쪽부터 해석
    * sum = 1
    * a = 2, sum = 1
    * sum = 1 + 2 => sum = 3
    * a = 3 , sum = 3 => a 1증가
    *
    *
    *
    * */
  }
}
