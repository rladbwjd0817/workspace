package test5;

public class MemberService {

  //매개변수로 전달된 id가 "hong", password가 "12345"일때 true 리턴
  public boolean login(String id, String password){
//    if (id.equals("hong") && password.equals("12345")){
//      return true;
//    } else {
//      return false;
//    }

    return id.equals("hong") && password.equals("12345");
  }

  public void logout(String id){
    System.out.println("로그아웃 되었습니다.");
  }
}
