public class Member_2 {
  private String name;
  private String id;
  private String password;
  private int age;

  public Member_2(){}

  public Member_2(String name, String id){
    this.name = name;
    this.id = id;
  }

  //setter
  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public void setAge(int age){
    this.age = age;
  }

  //getter
  public String getName(){
    return name;
  }

  public String getId(){
    return id;
  }

  public String getPassword(){
    return password;
  }

  public int getAge(){
    return age;
  }


//출력메서드
  public void printMemberData(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
//    System.out.println("패스워드 : " + password);
//    System.out.println("나이 : " + age);
  }
}
