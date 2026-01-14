public class Member {
  String name;
  String id;
  String password;
  int age;

  // 회원의 모든 정보를 변경하는 기능을 가진 메소드
  public void setMemberInfo(String name1, String id1,String pw, int ag){
    name = name1;
    id = id1;
    password = pw;
    age = ag;
  }

  public void printAllData(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + password);
    System.out.println("나이 : " + age);
  }

  @Override
  public String toString() {
    return name + id + password + age;
  }
}
