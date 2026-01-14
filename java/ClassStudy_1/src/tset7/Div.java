package tset7;

public class Div {
  private int a, b;

  public void setValue(int a, int b){
    this.a = a;
    this.b = b;
  }

  // 실행 연산결과를 리턴
  public int calculate(){
    return a / b;
  }
}
