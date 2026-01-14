//Student 설계도

public class Student {
  String name;
  int age;
  String address;
  int idNumber;
  String call;

  public void initAllData(String name, int age, String address, int idNumber, String call){
    this.name = name;
    this.age = age;
    this.address = address;
    this.idNumber = idNumber;
    this.call = call;
  }

  public void setName(String name){ // << 이름값을 변경하려구 설정한 메서드
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return age;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public String getAddress(){
    return address;
  }

  public void setIdNumber(int idNumber){
    this.idNumber = idNumber;
  }

  public int getIdNumber(){
    return idNumber;
  }

  public void setCall(String call){
    this.call = call;
  }

  public String getCall(){
    return call;
  }

  public void printAllData(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + address);
    System.out.println("학번 : " + idNumber);
    System.out.println("전화번호 : " + call);
    System.out.println("============================");
  }


}
