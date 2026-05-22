package generic;// 특정 메서드에만 제네릭 적용

public class GBox3 {
  public void aaa(){

  }

  // 제네릭 문법이 적용된 메서드 -> 잘 사용안함 -> 와일드카드를 많이 사용
  // 매개변수로 객체가 전달되면 그 객체를 담고 있는 상자를 리턴
  public <T> GBox<T> makeBox(T t){
    GBox<T> box = new GBox<>();
    box.set(t);
    return box;
  }

  public <T> void aaa(GBox<T> t){

  }

  // 위의 aaa와 100% 동일한 기능을 하는 메서드
  // 와일드카드
  public void bbb(GBox<?> t){

  }

  // 와일드카드 + 상한 제한<extends>(자료형에 제한을 주는 것이 목적이 아님!)
  // 문법적으론 자료형 제한주는게 맞지만
  // 활용적인 측면에서 사용하는 이유는 코드에 제한을 주기 위해서임
  // -> 개발자 실수 방지
  public void ccc(GBox<? extends Phone> t){
    // public void ccc(generic.GBox<generic.Phone> t)
  }

  // 와일드카드 + 하한 제한<super>
  // 문법적으로 Phone이 들어오거나 Phone의 부모인 Object가 들어올 수 있음
  // 하위 자식은 올 수 없음
  // -> 개발자 실수 방지
  public void ddd(GBox<? super Phone> t){
    // public void ddd(generic.GBox<generic.Phone> t)

  }

  // 박스에 저장된 데이터를 읽기
  public void outBox(GBox<? extends Toy> box){
    Toy y = box.get();
//    box.set(new generic.Toy());
  }

  // 박스에 저장된 데이터를 넣기
  public void inBox(GBox<? super Toy> box){
//    generic.Toy y = box.get();
    box.set(new Toy());
  }

  // => 매개변수를 보고 Toy가 들어있는 GBox가 들어오는구나 라고 생각하기!





}
