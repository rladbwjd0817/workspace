public class Method_1 {
  //이름과 나이를 출력하는 메서드 정의
  public static void printNameAndAge(){
    System.out.println("이름 : 김길동");
    System.out.println("나이 : 31살");
  }


  //메서드는 특정 기능 상자
  //main 메서드를 정의
  public static void main(String[] args) {
    System.out.println("시작");
    printhello();
    printhello();
    printNameAndAge();
    System.out.println("종료");
  }

  //method 기능
  //"안녕" 문자열을 출력하는 기능을 가진 메서드를 정의
  //메서드명 - 메서드 이름(어떤 기능을 담당하는지 알려주도록 지으면 좋음)
  //매개변수 - 메서드가 기능을 실행하기 위해서 필요한 데이터
//          - 필요한 데이터가 없으면 기능을 만들어
  public static void printhello(){
    System.out.println("안녕");
    System.out.println("반가워");
  }


}

