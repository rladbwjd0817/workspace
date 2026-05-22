package lambda;

public class OuterTest {
  public static void main(String[] args) {
    Outer outer = new Outer();

    Outer.Member m = outer.new Member();
  }


}
