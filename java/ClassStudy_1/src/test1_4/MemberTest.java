package test1_4;

public class MemberTest {
  public static void main(String[] args) {
    //객체생성        기본생성자 -> 생성자호출
    Member m1 = new Member();

    m1.setName("자바");
    m1.setId("java");
    m1.setPassword("123");

    System.out.println(m1. getName());
    System.out.println(m1. getId());
    System.out.println(m1. getPassword());
    System.out.println("==================================");

    Member m2 = new Member("김자바", "java", "123");
    m2.displayInfo();

    System.out.println(m2.toString());
    //객체명만 출력하면 자동으로 toString() 메서드가 호출이 됨
    System.out.println(m2);
  }
}
