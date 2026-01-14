package static_sudy;

//일반적인 멤버변수는 객체가 각각 가지는 데이터
//static을 활용하면 모든 객체가 공용으로 사용할 수 있는 데이터를 표현
//static은 멤버변수 및 메서드에서 사용 가능

/* <static 해석순서 - 컴퓨터>
* 1. static이 붙어 있는 변수나 메서드를 최우선으로 해석
* 2. static 붙어 있지 않는 변수 및 메서드를 해석
*
* static이 붙어있는 멤버변수 및 메서드를 접근하는 방법
* => 클래스명.변수, 클래스명.메서드
* static이 붙어있으면 객체만들 필요 X
*/
class Cnt {
  static int num;

  public Cnt(){
    num++;
    System.out.println("num = " + num);
  }
  public static void aaa(){
    System.out.println(1);
  }
}


