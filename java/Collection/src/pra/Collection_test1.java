package pra;

import java.util.ArrayList;
import java.util.List;

public class Collection_test1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("이얄 ");
    list.add("5시 ");
    list.add("다되간당");

    for (String e : list){
      System.out.print(e);
    }
  }
}
