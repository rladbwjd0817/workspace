import java.util.Scanner;

public class 성적 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("- 결과 -");
    //=========국,영,수 점수 입력받기=============//
//    int kor = sc.nextInt();
//    System.out.println("국어점수 : " + kor);
//    int english = sc.nextInt();
//    System.out.println("영어점수 : " + english);
//    int math = sc.nextInt();
//    System.out.println("수학점수 : " + math);
//    int total = sc.nextInt();
//    System.out.println("총점 : " + (kor + english + math));
//    Double avg = sc.nextDouble();
//    System.out.println("평균 : " + (kor + english + math)/3.0);

    //1. 문제를 풀기 위한 변수선언
    //2. korScore - 국어점수, englishScore - 영어점수, mathScore - 수학점수
    //3. 같은 자료형일 경우 : int a, b, c; -> 나열 가능
    //4. 문자는 괄호로 감싸기
    int korScore, engScore, mathScore, totalScore;
//    double avg; -> 평균
//    =======국영수 점수 입력받기=============//
    System.out.print("국어점수 : ");
    korScore = sc.nextInt();
    System.out.print("영어점수 : ");
    engScore = sc.nextInt();
    System.out.print("수학점수 : ");
    mathScore = sc.nextInt();

//    총점 및 평균 계산
    totalScore = korScore + engScore + mathScore;
    Double avg = totalScore / 3.0;

//    결과 출력
    System.out.println("총점 : " +totalScore);
    System.out.println("평균 : " +avg);
  }
}
