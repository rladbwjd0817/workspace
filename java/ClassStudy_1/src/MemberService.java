public class MemberService {
  private String id;
  private String password;

  public MemberService(){}

  //setter
  public void setId(String id){
    this.id = id;
  }

  public void setPassword(String password){
    this.password = password;
  }

  //getter
  public String getId(){
    return id;
  }

  public String getPassword(){
    return password;
  }

  //login 메서드
  public boolean login(String id, String password){
    boolean bo = true;
    if (id == "hong" && password == "12345"){
      System.out.println(bo);
    } else {
      System.out.println(false);
    }
    return bo;
  }

  public void logout(){

  }
}
