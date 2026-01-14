package study1;

//초급
public class Junior {
  public void devel(){
    System.out.println("신입이 식은땀 흘리며 코딩하고 있습니다.");
  }

}


//중상급 - 초급이 하는건 다 할 수 있으니깐
class Senior extends Junior{
  public void meeting(){
    System.out.println("고객사와 미팅을 합니다.");
  }

  //오버라이딩
  public void devel(){
    super.devel();
    System.out.println("중급은 클로드와 제미나이로 5인분 중입니다.^0^");
  }



}
