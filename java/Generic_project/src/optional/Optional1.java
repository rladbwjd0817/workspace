package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Optional1 {
  public static void main(String[] args) {
    String name = null;

    // null 체크 기능이 있는 Optional 상자에 데이터를 담는 코드
    //Optional<String> op1 = Optional.of(name); // null 데이터 허용 X
    Optional<String> op2 = Optional.ofNullable(name); // null 데이터 허용

    // op1 상자의 데이터가 null 이 아니면
    if (op2.isPresent()){
      System.out.println(op2.get());
    }

    // 데이터가 null이 아닐 때만 실행 코드 작성하는 방법
    // 매개변수 : Consumer<String> : void accept(String t);
    // Consumer<String> c = str -> System.out.println(str);
    op2.ifPresent(str -> System.out.println(str));

    Optional<String> op3 = Optional.of("Hello Oppa");

    // map() : 반복 + return / return이 중요함!
    // 상자 통으로 리턴됨
    String e = op3.map((s) -> s.replace(" ", "_")) // "Hello_Oppa"
                  .map(s -> s.toLowerCase()).get(); // "hello_oppa





  }
}
