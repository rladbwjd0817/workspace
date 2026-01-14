package map_study;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
  public static void main(String[] args) {

    //key : 책 번호, vlaue :
    Map<Integer, Book> map = new HashMap<>();
    map.put(1001, new Book("셜록 홈즈", 10000, "코난도일"));
    map.put(1002, new Book("이 세계에서 사랑이 사라진다해도", 20000, "김자바"));
    map.put(1003, new Book("달러구트 꿈 백화점", 30000, "이자바"));

    //책번호가 1002번 책 가격을 출력
    System.out.println( map.get(1002).getPrice());

  }

//  public static Map<String, Object> aaa(){
//    String name;
//    int age;
//
//    Map<String, Object> map4 = new HashMap<>();
//    return map4;
//  }
//
//  public void vvv(){
//
//  }
}
