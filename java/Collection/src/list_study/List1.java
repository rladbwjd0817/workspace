//컬렉션 프레임 워크
package list_study;

import java.util.ArrayList;
import java.util.List;

public class List1 {
  public static void main(String[] args) {

    //list : 배열과 같음.
    //     : 데이터를 많이 저장할 수 있는 자료형
    //     : 같은 자료형만 가능

    //정수를 여러 개 저장할 수 있는 리스트를 생성
    //리스트 <> 안에는 기본자료형 못 쓰기에 앞 글자를 대문자로 바꿈!
    //기본자료형 int -> 클래스 Integer
    //double -> Double
    //boolean -> Boolean
    //float -> Float

    List<Integer> list1 = new ArrayList<>();     //정수가 여러개 들어갈 수 있는 통
                 // 객체
    //리스트에 데이터 추가
    list1.add(1); //0번째
    list1.add(5); //1번째
    list1.add(10); //2번째

    //데이터 읽기 = 리턴
    int aa = list1.get(1); // 출력값 : 5 => list의 1번째 데이터를 리턴하겠다.
    //출력
    System.out.println(list1.get(2));

    //데이터 삭제
    list1.remove(1); //1번째 요소 삭제
    System.out.println(list1.get(1));

    //리스트에 저장된 데이터의 갯수
    list1.size();
    System.out.println(list1.size());


    //실수를 여러개 저장할 수 있는 리스트
    List<Double> list2 = new ArrayList<>();
    list2.add(2.0);
    list2.add(5.7);

    double bbb = list2.get(1);

    //문자열을 여러개 저장할 수 있는 리스트
    List<String> list3 = new ArrayList<>();
    list3.add("kkk");
    list3.add("bbb");
    list3.add("힘내");
    list3.add("취직하쟈");

    String ccc = list3.get(3);
    list3.remove(0);











  }
}
