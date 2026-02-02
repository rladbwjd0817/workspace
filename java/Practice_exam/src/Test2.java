import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    //        정수 6개 저장할 수 있는 배열 생성
    int[] random = new int[6];
//        배열에 1~46 사이의 난수 저장
//        46은 포함 x

    for (int i = 0; i < random.length; i++){
      random[i] = (int) (Math.random() * 46);
    }
    System.out.println("이번주 당첨 번호 : " + Arrays.toString(random));
    System.out.println();
    System.out.println("!! 당첨을 축하합니다 !!");
  }
}
