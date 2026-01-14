import java.util.Scanner;

public class If_test2_3 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //0. 박수의 갯수를 저장할 변수를 0으로 초기화
     int clapCnt = 0; // 박수를 저장할 데이터
     //1. 1~99사이 키보드로 정수 입력받음
     int num; // 키보드로 입력받은 데이터 저장
     System.out.print("1~99 사이의 정수를 입력하시오.");
     num = sc.nextInt();
     //2. 박수짝, 박수짝짝인지 확인

     //2-1. 10의 자리 1의 자리 수 분리
     //-> 몫을 10으로 나눴을 때 나오는 정수가 10의 자리,
     //-> 몫을 10으로 나눈 후 나오는 나머지 정수가 1의 자리
     int tens = num / 10;
     int ones = num % 10;

     //2-2. 10의 자리 수가 3,6,9인지 확인 -> 박수 갯수를 1증가
//     if (tens == 3 || tens == 6 || tens == 9){
     if (tens % 3 == 0 && tens != 0) {
//        clapCnt = clapCnt + 1;
//        clapCnt++;
       ++clapCnt;
//        clapCnt += 1;
     }
     //2-3. 1의 자리 수도 3,6,9인지 확인 -> 박수 갯수를 1증가
     if (ones % 3 == 0 && ones != 0){
       ++clapCnt;
     }
     //3. 박수의 갯수에 따라 박수를 친다.
     switch (clapCnt){
       case 1 :
         System.out.println("박수짝");
         break;
       case 2 :
         System.out.println("박수짝짝");
     }



  }
}
