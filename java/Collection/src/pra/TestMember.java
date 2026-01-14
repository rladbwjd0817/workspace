package pra;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {
    List<Member> memberlist = new ArrayList<>();

    //<list에 데이터 저장 방법>
    Member m1 = new Member();
    m1.setName("hehe");
    m1.setAge(25);
    m1.setId("dydy");
    m1.setPw("***");

    memberlist.add(m1);

    //2번째 방법
    Member m2 = new Member("bbb", "2222", "lee", 30);
    memberlist.add(m2);

    //3번째 방법
    memberlist.add(new Member("java", "3333", "park", 25));

    for (int i = 0; i < memberlist.size(); i++){
      System.out.println(memberlist.get(i));
    }

    System.out.println("=========================================================");
    for (Member member: memberlist){
      System.out.println(member);
    }

    System.out.println();
    //7번문제
    int sum = 0;
    for (Member member: memberlist){
      sum = sum + member.getAge();
    }
    System.out.println("나이 : " + sum);

    System.out.println();
    //8번 문제 - 몇 번째 데이터를 지울까?
    //id가 자바인 회원이 몇 번째 데이터인가? 를 알아내야 함.
    int foundIndex = -1; //답이 0,1,2로 시작하니까
    for (int i = 0; i < memberlist.size(); i++){
      if (memberlist.get(i).getId().equals("java")){
        memberlist.remove(i);
      }
    }
//    if (foundIndex != -1){
//      memberlist.remove(foundIndex);
//    } else {
//      System.out.println("일치하는 학생이 없습니다.");
//    }

    for (Member member: memberlist){
      System.out.println(member);
    }






  }
}
