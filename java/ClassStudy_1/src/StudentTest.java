public class StudentTest {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.initAllData("김유정", 31, "울산", 201441114, "010-1013-4564");
    student1.printAllData();

    Student student2 = new Student();

    student2.setName("김희정");
    student2.setAge(31);
    student2.setAddress("양주");
    student2.setIdNumber(201441118);
    student2.setCall("010-4562-4596");

    System.out.println("이름 : " + student2.getName());
    System.out.println("나이 : " + student2.getAge());
    System.out.println("주소 : " + student2.getAddress());
    System.out.println("학번 : " + student2.getIdNumber());
    System.out.println("전화번호 : " + student2.getCall());
    System.out.println("============================");
  }
}
