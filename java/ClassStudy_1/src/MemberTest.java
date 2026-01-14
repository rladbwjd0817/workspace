/* 1. 객체 생성 - new 클래스명();
*  2. 메서드 호출
*
*
* */

public class MemberTest {
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.setMemberInfo("kyj ", " seifi ", " ******** ", 31);
//    m1.printAllData();
    System.out.println(m1);
  }
}
