package test;

public class Member {
  private String id;
  private String pw;
  private String name;
  private int age;

  public void setInfo(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void showInfo(){
    System.out.println(getId());
    System.out.println(getPw());
    System.out.println(getName());
    System.out.println(getAge());
  }

  @Override
  public String toString() {
    return "Member{" +
            "id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  public boolean isLogin(String id, String pw){
//    id = "java", pw = 1234

    if (this.id.equals(id) && this.pw.equals(pw)){
      return true;

    } else {
      return false;
    }
  }



}
