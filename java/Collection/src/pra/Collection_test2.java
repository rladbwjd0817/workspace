package pra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection_test2 {
  public static void main(String[] args) {
    //scanner로 값을 입력받아야 하니 scanner선언
    Scanner sc = new Scanner(System.in);
    //정수 저장할 수 있는 리스트 생성
    List<Integer> list = new ArrayList<>();
    //키보드로 입력받은 5개의 정수 리스트에 저장
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    list.add(sc.nextInt());
    //리스트에 저장된 모든 데이터의 합을 출력
    //합을 저장할 창고 생성
    int sum = 0;
    for (int e : list){ //[1,2,3,4,5]
      sum = sum + e;
    }
    System.out.println(sum);
  }
}
