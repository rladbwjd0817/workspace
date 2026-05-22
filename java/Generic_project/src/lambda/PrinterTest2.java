package lambda;

public class PrinterTest2 {
  public static void main(String[] args) {

    Printable prn1 = new Printable() { // 익명 이너 클래스(클래스에 이름이 없음)
      @Override
      public void print() {
        System.out.println("OPS");
      }
    };

    Printable prn2 = () -> System.out.println("OBG");

    // 람다표현식
    Printable prn = () -> System.out.println("JK OPPA");

    prn.print();

  }
}
