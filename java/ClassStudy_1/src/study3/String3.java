package study3;

public class String3 {
  public static void main(String[] args) {
    //String 클래스에서 많이 사용하는 메서드
    String s1 = " Simple";
    String s2 = "String";

    //concat : 문자열 나열, +와 같은 역할
    //"a" + "b" => 내부적으로 "a".concat("b")를 실행
    System.out.println(s1.concat(s2));

    //length : 문자열의 길이를 리턴
    System.out.println(s1.length());

    //String.valueOf(숫자) : 매개변수로 전달된 정수, 실수 모두를 문자열로 변환
    //valueOf - 앞에 static이 붙어있어 클래스명. 으로 호출함.
    String s3 = "10";
    System.out.println(String.valueOf(s3));

    //contains : 매개변수로 전달된 문자열이 포함되어 있으면 true, 아니면 false
    System.out.println(s3.contains("1"));

    //substring() : 일부 문자열 추출
    String s4 = "abcdefg";
    //문자열의 두번째 요소부터 추출(0부터 시작)
    System.out.println(s4.substring(2)); //cedfg
    //두번째 문자열부터 다섯번째 전 까지(다섯번째는 포함 X) 추출!
    System.out.println(s4.substring(2,5)); //cde

    //replace : 문자열 교체 함수
    System.out.println(s4.replace("cde", "p"));

    String s5 = "010-1111-2222";
    //s5 문자열을 "-" 기준으로 분리
    String[] result = s5.split("-");
    System.out.println(result[1]);

    String s6 = " a b c ";
    //trim : 문자열 앞, 뒤 공백 제거
    //=> 회원가입 할 때 공백입력하지 못하게 하려구
    System.out.println(s6.trim());
    System.out.println(s6);

  }
}
