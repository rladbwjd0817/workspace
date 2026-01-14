import java.util.Arrays;
import java.util.Scanner;

public class Array_Test_12 {
  public static void main(String[] args) {
    //국, 영, 수 각 점수, 총점, 평균 배열써서 출력
    //국,영,수, 총점 같은 자료형으로 배열 가능
    Scanner sc = new Scanner(System.in);
    //0번째 요소: 국어, 1번 : 영어, 2번 : 수학, 3번 : 총점
    int[] scores = new int[4];
    String[] subjectc = {"국어", "영어", "수학"};
    //평균 데이터를 저장할 창고
    double avg;

    //점수 입력 받기 - 과목이 3개니 점수 받는 것이 3번 반복되어 for문으로 반복하기
    //scores.length - 1은 총점은 빼고 과목수만 늘리겠다!!
    for (int i = 0; i < scores.length - 1; i++){
      //한 과목 점수 입력 받는 코드
      while (true){
        //subjectc[i]는 위의 for문 반복 밑에 있어서 i가 1에 증가함에 따라 과목이 바뀜
        System.out.print(subjectc[i] + " 점수 : ");
        scores[i] = sc.nextInt();

        if (scores[i] >= 0 && scores[i] <= 100){
          break;
        }
      }
    }
    //입력 받은 국,영,수 점수로 총점 및 평균내기
    for (int i = 0; i < scores.length - 1; i++){
      //scores의 배열 길이는 현재 4이고 총점이 들어간 배열의 요소 숫자가 나옴.
      //scores[scores.length - 1] : 총점
      scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
      //평균
    }
    avg = scores[scores.length - 1] / (double)(scores.length - 1);
    //출력
    for (int i = 0; i <scores.length -1 ; i++){
      System.out.println(subjectc[i] + " 점수 : " + scores[i]);
    }
    System.out.println("총점 : " + scores[scores.length - 1]);
    System.out.println("평균 : " + avg);
  }
}
