package study1;

public class Test {
  public static void main(String[] args) {
    Junior j = new Junior();
    j.devel();

    //overriding 하면 객체 호출시 부모클래스 사용X
    //-> 덮어써서 자식클래스만 나옴.
    Senior s = new Senior();
    s.devel();
  }
}
