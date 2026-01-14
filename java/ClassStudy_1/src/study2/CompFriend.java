package study2;

public class CompFriend extends Friend {
  private String dept;


  public CompFriend(String name, String dept, String phone) {
    super(name, phone);
    this.dept = dept;
  }

  public void showInfo() {
    super.showInfo();
//    showInfo();
    System.out.println("부서: " + dept);
    System.out.println("========================");
  }
}
