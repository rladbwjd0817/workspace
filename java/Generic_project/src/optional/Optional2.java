package optional;

import java.util.Optional;

public class Optional2 {
  public static void main(String[] args) {
    Contact contact = new Contact("010", "ulsan");

    Optional<Contact> op1 = Optional.of(contact);

    // 전화번호를 출력, 만약 null이면 '연락처 없음'
    // 1. Consumer<T> : void accept(T t);
    // 2. Runnable : void run();
    op1.ifPresentOrElse(
            e -> System.out.println(e.getPhone()),
            () -> System.out.println("연락처 없음")
    );

    String phone = op1.map((data) -> data.getPhone())
                      .orElseGet(() -> "연락처 없음");

    System.out.println(phone);
  }

}
