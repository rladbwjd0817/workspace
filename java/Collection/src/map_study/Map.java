package map_study;

import java.util.HashMap;
import java.util.Iterator;

public class Map {
  public static void main(String[] args) {

    //key, value
    //Map key를 확인할 때 hashcode가 있는데 이 hashcode는 대애충 주소값! 기본타입은 주소값이 없어서 못 들어옴!
    java.util.Map<Integer, String> map = new HashMap<>();
    map.put(1, "김유정"); //데이터 추가
    map.put(2, "김희정"); //데이터 추가
    map.put(3, "이은경"); //데이터 추가
    map.put(4, "전지윤"); //데이터 추가
    map.put(5, "박한솔"); //데이터 추가
    map.put(6, "박한솔"); //데이터 추가

    //key가 1인 데이터를 읽을게~~ => 안에 내용물 value가 포인트임
    map.get(1);
    System.out.println(map.get(3));

    //모든 데이터 읽기
    //map은 순번이 없기 때문에 일반 for문 사용안되고, for-each문을 사용해야 함!
    //for-each 문에서 key가 빠져나옴
    //map.keySet() : map에서 key값만 추출
    //value가 중복이 되면 중복 값이 나옴. key가 중복이 되면 위의 내용을 밑에 내용이 덮어씀.
    //★ 그렇기에 key 중복 X !!
    for (int key  : map.keySet()){
      System.out.println("key = " + key + ", value = " + map.get(key));
    }

    System.out.println();
    Iterator<Integer> keys = map.keySet().iterator();
    while (keys.hasNext()){
      Integer key = keys.next();
      System.out.println(key);
    }






  }
}
