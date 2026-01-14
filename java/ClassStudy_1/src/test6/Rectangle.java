package test6;

public class Rectangle {
  private int x1, y1, x2, y2;


  //기본생성자
  public Rectangle(){}

  //값을 설정하는 생성자
  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //setter - 멤버변수 값을 변경하는 메서드
  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  //사각형 넓이 리턴
  public int square(){
    return (x2 - x1) * (y2 - y1);
  }

  public void show(){
    System.out.println("좌표 : " + (x1 + "," + y1) + " , " + (x2 + "," + y2));
    System.out.println("넓이 : " + square());
  }

  //사각형의 넓이가 같으면 return true
  //r은 우리가 클래스 안에서 만든 직사각형 자료들의 총 집합
  public boolean equals(Rectangle r){
    return square() == r.square();
  }





}
