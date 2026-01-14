/* 접근제한자 : 멤버 변수 및 메서드의 접근 범위를 지정하는 문법
    ->멤버변수와 메서드에서 사용가능
   public > default > protected > private
   범위 넓음                        범위 좁음
   private - 멤버변수 및 메서드를 정의한 클래스 내에서만 접근 허용 -> 다른 클래스에서 사용 X
   protected - pass, 상속의 개념을 알아야 이해 가능
   default - 같은 패키지(폴더) 내에서 접근 허용(접근제한자룰 작성하지 않는 것이 default 접근제한자다.)
   public - 같은 프로젝트내에서 접근 허용

   <결론>
   1. 멤버변수는 항상 private 접근제한자를 사용한다.
   2. 메서드의 접근제한자는 일단은 public을 사용

* */


public class Circle {
  //!!!!!!!!!!!!!!!!멤버변수 앞에는 무조건 private 접근제한자 꼭 써!!!!!!!!!!!!!!!!!
  private double r; //직접대입 막는 접근제한자 : private

  //r 값을 변경하는 메서드 -> 다른 클래스에서 r값을 접근할 수 있도록 메서드를 만들어줌.
  public void setR(double r){
    if (r < 0){
      this. r = 0.0;
    }
    else {
      this.r = r;
    }
  }

  //원의 둘레를 리턴하는 메서드 => 2 * 파이 * r
  public double getSize(){
//    Math.PI; // 상수
    return 2 * Math.PI * r;
  }

  //원의 넓이를 리턴하는 메서드 => 파이 * r * r
  public double getArea(){
    return Math.PI * r * r;
  }

}
