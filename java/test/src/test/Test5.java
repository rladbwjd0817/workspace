package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] baseball = new int[3];
//    도전횟수 저장할 변수
    int tryCnt = 0;

//    키보드로 입력받은 정수 3개를 저장할 변수
    int[] answer = new int[3];

//    배열의 각 요소에 1~9까지의 랜덤 정수 저장
    for (int i = 0; i < baseball.length; i++){
//      중복검사 없이 일단 랜덤한 수를 배열에 저장
      baseball[i] = (int) (Math.random() * 9 + 1);

//      방금 넣은 정수가 중복인지 확인 => 중복검사 갯수는 고정이 아니라 계속 변함.
//      반복횟수 : j (중복인지 아닌지)
      for (int j = 0; j < i; j++){
//      arr[i]와 arr[j]가 같은지 비교 -> 같으면 i -1
        if (baseball[i] == baseball[j]){
          i--;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(baseball));
//    정답을 맞출 때 까지 정답작성
    while(true){
      int strike = 0;
      int ball = 0;

//    정답 작성
      System.out.print(++tryCnt + " >> "  );
      answer[0] = sc.nextInt();
      answer[1] = sc.nextInt();
      answer[2] = sc.nextInt();

//    답 체크 -> 정답 맞을 때 까지
//    baseball 배열의 데이터 수만큼 반복
      for (int i = 0; i < baseball.length; i++){
//       answer 배열에 저장된 데이터 수만큼 반복
        for (int j = 0; j < answer.length; j++){
         if (baseball[i] == answer[j]){
           if (i == j){
             strike++;
           }
           else {
             ball++;
           }
         }
        }
      }
//    결과 출력
      System.out.println(strike + "스트라이크," + ball + "볼");

//    3스트라이크면
      if(strike == 3){
        System.out.println(tryCnt +"회만에 정답을 맞췄습니다.");
        break; //if문 조건이 만족하면 while문 벗어남
      }

    }
  }
}
