package lambda;

public class Lambda1 {
  public static void main(String[] args) {
    Test1 t1 = s -> System.out.println(s);
    t1.aaa(10);

    Test2 t2 = (a, b) -> {
      System.out.println(a);
      System.out.println(b);
    };
    t2.bbb("jk", 32);

    Test3 t3 = num -> num * 3;
    int result = t3.bbb(7);
    System.out.println(result);

  }
}
