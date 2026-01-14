import java.util.Arrays;

public class Array_Test_2_5 {
  public static void main(String[] args) {
    //길이가 6인 정수형 배열 생성
    int[] lotto = new int[6];

    //1~45까지의 랜덤 정수 만들어 * 6번 반복
    for (int i = 0; i < lotto.length; i++){
      //0.0을 포함하고 1을 포함하지 않는 실수
      //-> 0.0 <= x < 1
      lotto[i] = (int)(Math.random() * 45 +1);
    }
    //로또번호 출력
    System.out.println(Arrays.toString(lotto));
  }
}
