public class Member_2_Test {
  public static void main(String[] args) {
//    Member_2 m2 = new Member_2("kkk", "jiji");

    Member_2 user1 = new Member_2("홍길동", "hong");
    user1.printMemberData();
    System.out.println("=======================");

    Member_2 user2 = new Member_2();
    user2.setName("강자바");
    user2.setId("java");

    user2.getName();
    user2.getId();
    user2.printMemberData();

  }
}
