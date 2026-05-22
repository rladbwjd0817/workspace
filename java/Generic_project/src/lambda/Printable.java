package lambda;

// 람다가 적용되려면 추상메서드가 하나밖에 없는 인터페이스가 존재해야 함
// 자바측에서 람다 활용성을 높이기 위해 추상메서드가 하나밖에 없는 인터페이스를 다수 만들어놨음
// 이처럼 추상메서드가 하나밖에 없는 인터페이스를 '함수형 인터페이스'라 부름.
public interface Printable {
  void print();
}

interface Test1{
  void aaa(int a);
}

interface Test2{
  void bbb(String a, int b);
}

interface Test3{
  int bbb(int a);
}