package generic;

public class GBoxTest {
  public static void main(String[] args) {
    GBox<Orange> b1 = new GBox<Orange>();
    b1.set(new Orange());
    Orange o = b1.get();

    GBox<Apple> b2 = new GBox<>();
    b2.set(new Apple());
    Apple apple = b2.get();

    GBox2<Phone> g1 = new GBox2<>();
    GBox2<SmartPhone> g2 = new GBox2<>();

    GBox3 box3 = new GBox3();
    GBox<Orange> ob = box3.<Orange>makeBox(new Orange());

    GBox<Orange> ob1 = new GBox<>();
    GBox<Apple> ob2 = new GBox<>();




  }
}
