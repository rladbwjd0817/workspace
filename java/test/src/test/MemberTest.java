package test;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member();
    member.setInfo("java", "1234", "kim", 20);
    System.out.println(member);

//    isLogin 메서드 호출
    member.isLogin("java", "1234");
    member.isLogin("java", "1111");
  }
}
