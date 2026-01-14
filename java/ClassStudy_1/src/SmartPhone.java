public class SmartPhone {

  String brand;
  String modelName;
  String color;
  int price;
  String phoneNumber; //"010-4545-7878"

  //제조사 데이터를 변경하는 메서드
  //메서드의 매개변수는 메서드 기능 구현 시 필요한 데이터가 있다면 매개변수로 전달받으세요!
  public void setBrand(String data){
    brand = data;
  }

  public void setModelName(String name){
    modelName = name;
  }

  public void setColor(String col){
    color = col;
  }

  public void setPrice(int p){
    price = p;
  }

  public void setPhoneNumber(String number){
    phoneNumber = number;
  }

  //휴대폰의 모든 데이터를 출력하는 메서드
  public void printAllData(){
    System.out.println("제조사 : " + brand);
    System.out.println("모델명 : " + modelName);
    System.out.println("색상 : " + color);
    System.out.println("가격 : " + price);
    System.out.println("휴대폰 번호 : " + phoneNumber);
  }


}

