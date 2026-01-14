package test;

public class Math_test {
  public static void main(String[] args) {
    MathUtil ma = new Mymath();

    boolean result1 = ma.isEven(1, 2, 3);
    System.out.println(result1);
    System.out.println(ma.getSumFromOne(11));
    double result2 = ma.getCircleArea(4);
    System.out.println(result2);
  }
}
