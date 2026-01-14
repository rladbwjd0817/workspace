package practice;

public class Work {
  public static void main(String[] args) {
    B bp = new B();
    B bp1 = new B(10);
    B bp2 = new B(10, 20);
    B bp3 = new B(10, 20, 30);
    B bp4 = new B(10, 20, 30, 40);

    //앞의 x, y는 부모클래스의 x, y
    //뒤의 x, y는 자식클래스의 x, y
    bp.disp(); //x=1, y=1, x=1, y=1
    bp1.disp(); //x=10, y=1, x=1, y=1
    bp2.disp(); //x=10, y=20, x=1, y=1
    bp3.disp(); //x=10, y=20, x=30, y=1
    bp4.disp(); //x=10, y=20, x=30, y=40
  }
}
