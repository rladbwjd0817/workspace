import java.util.Scanner;

public class Array_test_12 {
    public static void main(String[] args) {
        //국, 영, 수 점수 입력받아
        Scanner sc = new Scanner(System.in);
        //각 과목에 대한 점수 및 총점, 평균 출력
        // 정수형으로 할 때
        int[] score = new int[3];
        int sum = 0;
        //총점 저장할 창고 = sum
        int avg = 0;
        //평균 저장할 창고 = avg
        //반복 : 점수 입력받는거, 각 점수 더하는 행위 ->총점,
        //    : 점수 나누는 행위
        for (int i = sc.nextInt(); i < score.length; i++){
            sum = sum + i;
            System.out.println("각 점수 : " + score[i]);
            if (sum / 3 == avg){
                System.out.println("평균 : " + avg);
            }
            System.out.println("총합 : " + sum);
        }
    }
}
