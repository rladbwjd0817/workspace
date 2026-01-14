package pra;

import java.util.ArrayList;
import java.util.List;

public class Collection_test4 {
  public static void main(String[] args) {
    //정수 리스트 생성
    List<Integer> num = new ArrayList<>();

    //리스트에 1~100까지의 랜덤한 정수 10개 넣어

    //짝수의 갯수를 저장할 창고
    int evenCnt = 0;

     for (int i = 1; i < 11; i++){
       int randomNum = (int) (Math.random() * 100 + 1);
       num.add(randomNum);
       if (randomNum % 2 == 0){
         System.out.println(randomNum);
         evenCnt++;
       }
     }
    System.out.println("랜덤 숫자 : " + num);
    System.out.println("짝수 갯수 : " + evenCnt);
//    System.out.println("모든 짝수 : " + even);


    //저장된 데이터 중 짝수의 개수
    //모든 짝수를 출력
  }
}
