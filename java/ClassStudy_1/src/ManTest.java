public class ManTest {
  public static void main(String[] args) {
    Man m1 = new Man();
    //객체의 값을 변경 ->다이렉트도 접근하는 방법은 이제 사용 X
    m1.name = "Kim Taehyong";
    m1.age = 30;
    m1.address = "거창";
    //객체의 값을 출력
    System.out.println(m1.name);
    System.out.println(m1.age);
    System.out.println(m1.address);
    System.out.println("==============================");

    Man m2 = new Man(); // << 상황에 따라 효율적인 방법을 사용
    m2.setName("Park JiMin");
    m2.setAge(31);
    m2.setAddress("Seoul");
    System.out.println(m2.getName());
    System.out.println(m2.getAge());
    System.out.println(m2.getAddress());
    System.out.println("==============================");

    Man m3 = new Man(); // << 상황에 따라 효율적인 방법을 사용
    m1.initManData("김유정", 31, "중구");
    m1.printManData();


//    System.out.println(m1.getName()); // << 이름값 되돌려주는 리턴 메서드
//    System.out.println(m1.name); // << 이름데이터에 직접적으로 쓰는 데이터지만 사용 X



  }
}
