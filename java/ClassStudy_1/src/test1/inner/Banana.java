package test1.inner;


public class Banana {
  private int price;
  private String production;

  //setter - 멤버변수 값을 변경하는 메서드
  public void setPrice(int price){
    this.price = price;
  }

  public void setProduction(String production){
    this.production = production;
  }

  //getter - 멤버변수 값 반환하는 메서드
  public int getPrice(){
    return price;
  }

  public String getProduction(){
    return production;
  }

  //출력메서드
  public void printData(){
    System.out.println(price);
    System.out.println(production);
  }
}
