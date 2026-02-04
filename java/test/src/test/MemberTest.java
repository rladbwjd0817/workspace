package test;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member();
    member.setInfo("java", "1234", "kim", 20);
    System.out.println(member);

//    isLogin 메서드 호출
    if (member.isLogin("java", "1234")){
      System.out.println("로그인 성공");
    }

  }
}
