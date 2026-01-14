package practice;

public class ColorLcd extends Lcd{
  int colorSize;
  public ColorLcd(int colorSize, int size){
    super(size);
    this.colorSize = colorSize;
  }

  //자식클래스
  /*부모클래스인 Lcd에 있는 int size가 자식클래스인 ColorLcd도
  들어가있음.
  정수형 colorSize를 선언하고,
  ColorLcd 생성자는 정수형 colorSize와 정수형 size를 매개변수로 받아
  부모클래스의 생성자 Lcd를 호출하여 size의 값을
  정수형 n에 넣고 부모클래스의 size에 n의 값을 저장
  이 클래스에 정의된 colorSize 멤버변수는 매개변수 colorSize로 값을 받아
  저장한다.
  */
}
