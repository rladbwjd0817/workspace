package practice;

public class B extends A {
  //실무에서 이런 코드 쓰지 않음
  private int x; //Test8과 다른 x
  private int y; //Test8과 다른 y

  public B(){
    x = 1;
    y = 1;
  }

  public B(int x){
    super(x);
    this.x = 1;
    y = 1;
  }

  public B(int x, int y){
    super(x, y);
    this.x = 1;
    this.y = 1;
  }

  public B(int x, int y, int x1){
    super(x, y);
    this.x= x1;
    this.y = 1;
  }

  public B(int x, int y, int x1, int y1){
    super(x, y);
    this.x = x1;
    this.y = y1;
  }



  public void disp(){
    //부모클래스가 가진 disp메서드를 호출
    super.disp();
    System.out.println(", x = " + x + ", y = " + y);
  }
  //부모한테 본인이 가진 x,y값 초기화하라는 명령
  //-> 부모가 가진 변수를 초기화 -> 생성자!

//  public int getX(){
//    return x;
//  }
//
//  public int getY(){
//    return y;
//  }
}
