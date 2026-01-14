public class CircleTest {
  public static void main(String[] args) {
    //객체 생성 및 생성자
    Circle c1 = new Circle();

    //!!!!!!!!!!!!!!멤버변수의 값에 직접 접근하는 것은 자제해라!!!!!!!!
    // -> 잘못된 데이터가 들어가는 것을 막을 수 없기 때문에 쓰지 않으려고 해야 함!!!!!!!!!!
//     c1.r = 10.5;

    // 멤버변수의 값을 변경할때는 'setter 메서드'를 활용
      c1.setR(10.5);
    //

    System.out.println(c1.getSize());
  }
}
