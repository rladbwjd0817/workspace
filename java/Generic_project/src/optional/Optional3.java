package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional3 {
  public static void main(String[] args) {
    List<Member> memberList = new ArrayList<>();
    memberList.add(new Member("kim", 20));
    memberList.add(new Member("Lee", 30));
    memberList.add(new Member("Park", 40));
    memberList.add(new Member("Hong", 50));
    memberList.add(new Member("Choi", 60));

    // 리스트에서 나이가 35세 이상인 회원의 나이만 추출 -> 40, 50, 60
    Optional<List<Member>> op = Optional.of(memberList);
    // op.map(e -> {});

  }
}

class Member{
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
