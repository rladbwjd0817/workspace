package pra;

public class Phone_Pra_Test {
  public static void main(String[] args) {
    //객체 생성
    Phone_pra p1 = new Phone_pra();

    p1.setProdution("삼성");
    p1.setModelName("갤럭시");
    p1.setColor("blue");
    p1.setPrice(10000);
    p1.setPhoneNumber("0104548654");

    p1.printPhoneData();
  }
}
