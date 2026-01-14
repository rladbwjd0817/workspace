package pra;

import list_study.List2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionTest_1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("오늘 저녁 ");
    list.add("치킨 ");
    list.add("고");
    System.out.print(list.get(0));
    System.out.print(list.get(1));
    System.out.println(list.get(2));

    List<Integer> list2 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    list2.add(sc.nextInt());
    list2.add(sc.nextInt());
    list2.add(sc.nextInt());
    list2.add(sc.nextInt());
    list2.add(sc.nextInt());
    int sum = 0;
    for (int i = 0; i < list2.size(); i++){
      sum = sum + i;
    }
    System.out.println(sum);






  }




}
