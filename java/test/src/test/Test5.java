package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];

//    배열의 각 요소에 1~9까지의 랜덤 정수 저장
    for (int i = 0; i < arr.length; i++){
      arr[i] = (int) (Math.random() * 9 + 1);

      for (int j = 0; j < i; j++){
//      arr[i]와 arr[j]가 같은지 비교 -> 같으면 i -1
        if (arr[i] == arr[j]){
          i--;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(arr));

  }
}
