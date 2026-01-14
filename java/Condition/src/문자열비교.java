public class 문자열비교 {
  public static void main(String[] args) {
    //문자열 비교에는 equals() 메서드를 사용

    String addr = "울산";
    System.out.println( addr.equals("부산") );
    System.out.println( addr.equals("울산") );

    System.out.println( "서울".equals("울산") );

    String tel = "010-7777";
    System.out.println( addr.equals("tel") );


    //=======================================================//
    String name = "고길동";

    //name 변수에 저장된 문자열이 "고길동"이라면...
    //문자열 비교에는 '==' 사용하면 X -> 정수나 실수에서 가능
    //
    if( name.equals("고길동") ){

    }
  }
}
