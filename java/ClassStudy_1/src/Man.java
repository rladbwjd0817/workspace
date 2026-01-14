//setter - 클래스가 가진 각각의 멤버변수 값을 변경하는 메서드
//       + 메서드명은 반드시 'set멤버변수명' 으로 지정해줘야 함.
//!!!!setter 쓰든 안쓰든 만들어놓고 시작하기!!!!
//리턴하는 메서드 << 변수명 : get~~
//getter : 클래스의 각각의 멤버변수 값을 리턴하는 메서드
//       + 메서드명은 반드시 'get 멤버변수명'으로 지정해줘야 함.
public class Man {
  String name;
  int age;
  String address;


  //모든 멤버변수의 값을 초기화하는 메서드(멤버변수 값 변경 메서드)
  //매개변수는 데이터를 받는 통로!
  //this.name : 이 클래스에 정의된 name -> 매개변수로 선언된 name을 멤버변수 name에 넣으세요~
  //this 키워드는 멤버변수 및 메서드에서 사용 가능함.
  public void initManData(String name, int age, String address){
    this.name = name;
    // name = name이 모두 매개변수를 가리킴.
    //그래서 이미 코드가 해석이 잘 되지 않아 null값이 나옴.
    //멤버변수와 매개변수는 중복가능하게 설정이 되어 있음. -> 그러다보니 동일하면 가까운곳에서 선언된 것을 인식함.
    //그래서 앞의 멤버변수 name을 멤버변수로 인식할 수 있도록 앞에 this. 을 붙임
    this.age = age;
    this.address = address;
  }


//  public void setName(String name){
//    this.name = name;
//  }
//  public void setAge(int age){
//    this.age = age;
//  }
//
//  public void setAddress(String address){
//    this.address = address;
//  }
//
//
//  public String getName(){
//    return name;
//  }
//
//  public int getAge(){
//    return age;
//  }
//
//  public String getAddress(){
//    return address;
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


//  public String setName(String name1){
//    name = name1;
//    return name1;
//  }
//
//  public int setAge(int age1){
//    age = age1;
//    return age1;
//  }
//
//  public String setAddress(String address1){
//    address = address1;
//    return address1;
//  }

  public void printManData(){
    System.out.println("이름 : " + this.name); // << this. 출력문에서도 사용가능
    System.out.println("나이 : " + getAge() + "살");
    System.out.println("주소 : " + address);
    System.out.println("==============================");
  }


}
