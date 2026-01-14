package pra;

public class Phone_pra {
  private String prodution;
  private String modelName;
  private String color;
  private int price;
  private String phoneNumber;

  //기본생성자
  public Phone_pra(){}

  public Phone_pra(String prodution, String modelName, String color, int price, String phoneNumber){
    this.prodution = prodution;
    this.modelName = modelName;
    this.color = color;
    this.price = price;
    this.phoneNumber = phoneNumber;
  }

  //setter - 멤버변수 변경 값
  public void setProdution(String prodution){
    this.prodution = prodution;
  }
  public void setModelName(String modelName){
    this.modelName = modelName;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setPrice(int price){
    this.price = price;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  //getter - 멤버변수 값 리턴
  public String getProdution(){
    return prodution;
  }
  public String getModelName(){
    return modelName;
  }
  public String getColor(){
    return color;
  }
  public int getPrice(){
    return price;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }

  //모든 데이터 출력
  public void printPhoneData(){
    System.out.println("제조사 : " + prodution);
    System.out.println("모델명 : " + modelName);
    System.out.println("색상 : " + color);
    System.out.println("가격 : " + price);
    System.out.println("휴대폰 번호 : " + phoneNumber);
  }
}
