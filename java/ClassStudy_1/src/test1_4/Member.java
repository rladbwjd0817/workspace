package test1_4;

public class Member {
  private String name;
  private String id;
  private String password;

  //기본생성자

//  public Member(){}
  public Member() {}
  //모든 데이터를 변경할 수 있는 생성자
  //모르는 데이터는 매개변수로 받아온다.
//  public Member(String name, String id, String password){
//   this.name = name;
//   this.id = id;
//   this.password = password;

//  }

  public Member(String name, String id, String password) {
    this.name = name;
    this.id = id;
    this.password = password;
  }

  //쉽게 출력문 쓰는 방법임, 단축키 alt + insert -> toStirng()
  @Override
  public String toString() {
    return "Member{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  //setter - 각각의 멤버변수의 값을 변경하는 메서드
//  public void setName(String name){
//    this.name = name;
//  }
//
//  public void setId(String id){
//    this.id = id;
//  }
//
//  public void setPassword(String password){
//    this.password = password;
//  }
//
//  //getter - 멤버변수의 값을 리턴하는 메서드
//  public String getName(){
//    return name;
//  }
//
//  public String getId(){
//    return id;
//  }
//
//  public String getPassword(){
//    return password;
//  }

//alt + insert - 생성자 or setter, getter 만드는 단축키
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void displayInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + password);
  }


}
