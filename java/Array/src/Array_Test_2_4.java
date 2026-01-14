public class Array_Test_2_4 {
  public static void main(String[] args) {

    //Math.random() -> 0.0에서 0.9999까지의 랜덤한 실수를 반환
    double d = Math.random();
    System.out.println(d);

    //위 Math.random()을 이용해서 1~10까지의 랜덤한 정수를 생성
    //0.0 <= x < 1.0 실수

    //(int)Math.random() * 10 + 1 => 결과출력하면 1나옴
    //그래서 괄호를 씌워서 먼저 계산할 수 있도록 하여 정수 표현함.
    int e = (int) (Math.random() * 10 + 1); //->1~11미만의 실수를 만들어 정수로 변환
    System.out.println(e);

  }
}
