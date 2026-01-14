public class DataType2 {
  public static void main(String[] args) {

    //변수 선언 시 주의!!!!!!!
    //정수 사용시 자바는 기본적으로 int 타입으로 해석을 함.
    //실수 사용시 자바는 기본적으로 double로 인식을 함.
    //실수 뒤에 f(F)를 넣으면 float 형식으로 인식함.
    float num1 = 10.5f;
    float num3 = 10.5F;

    long num2 = 10000000000L;
    //ㄴ정수는 21억까진 저장가능, 위에 저 숫자는 너무 커서 저장 X, L은 대문자로 저장

    //정수와 실수의 연산 결과
    //정수+정수, 정수*정수 등 -> 무조건 정수 결과값 나옴.
    //실수가 연산에 포함되어 있으면 결과는 실수로 나옴.
    System.out.println(10.0/3);
    System.out.println(2 + 3 / 2 -1.0);
  }
}
