public class MonitorTest {
  public static void main(String[] args) {
//                    생성자
    Monitor m1 = new Monitor(1000); //모델명은 null, 인치는 0.0 가격은 1000이 저장됨.
    System.out.println(m1.price);

    Monitor m2 = new Monitor(); // 1번 생성자
    Monitor m3 = new Monitor("java");

  }
}
