//앞에 설계도로 만든 클래스들이 잘 작동하는지 확인
public class SmartPhone_Test {
  public static void main(String[] args) {
    SmartPhone p1 = new SmartPhone(); //SmartPhone클래스에 있는 내용 다 있음

    //p1 객체의 데이터를 수정 -> !!실무에서 사용하지 않는 방법!!
    //잘못된 데이터를 막을 수 없기에 잘 안씀
    p1.brand = "삼성";
    p1.modelName = "S25";
    p1.color = "gray";
    p1.price = 10000;
    p1.phoneNumber = "010-3415-1564";

    //p1 객체의 모든 정보를 출력
    System.out.println(p1.brand);
    System.out.println(p1.modelName);
    System.out.println(p1.color);
    System.out.println(p1.price);
    System.out.println(p1.phoneNumber);

    System.out.println("========================");

//  <!!!실무에서 사용하는 방법!!!>
    //최소한 잘못된 데이터가 들어가는 것을 방어할 수 있어서 이걸 사용
    SmartPhone p2 = new SmartPhone();
    p2.printAllData();
    p2.setBrand("apple");
    p2.setModelName("iphone 13");
    p2.setColor("red");
    p2.setPrice(10000);
    p2.setPhoneNumber("010-4521-4856");
    System.out.println("=============================");
    p2.printAllData();


  }
}
