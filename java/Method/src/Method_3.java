import java.net.StandardSocketOptions;

public class Method_3 {


  public static void main(String[] args) {
    System.out.println("시작");
    printAge(20);
    printAge(30);
    printAge(25);

    int age = 40;
    printAge(age);

    int num = 50;
    printAge(num); // 같은 자료형이면 저장 가능함


    System.out.println("종료");
  }

  //나이를 출력하는 메서드
  //매개변수는 이름보다 실체(이름안에 들어가는 데이터)가 중요해!!!!!!
  public static void printAge(int age){ //int age = 30; 이 실행되는구나!!
    System.out.println("나이는 " + age);
  }

}
