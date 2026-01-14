package array;

public class Acc_test1 {
  public static void main(String[] args) {

    //계좌를 3개 저장할 수 있는 배열 arr을 생성
    //int[] arr = new int[3];
    //계좌 3개 만든게 아니라 계좌가 3개 저장될 수 있는 통만 있음.
    Acc[] arr = new Acc[3];

    //arr 배열에 acc(계좌) 정보를 저장
    //1. 계좌 정보 생성
    Acc a1 = new Acc("kim" , "1111", 10000);
    Acc a2 = new Acc("Park" , "2222", 20000);
    Acc a3 = new Acc("young" , "3333" , 30000);

    //2. 생성한 계좌는 배열에 저장.
    //배열 한 칸에 acc정보 다 들어가있음.
    arr[0] = a1;
    arr[1] = a2;
    arr[2] = a3;

    //문제1. 배열의 0번째 요소에 저장한 계좌의 예금액을 출력
    System.out.println(arr[0].getBalance());

    //문제2. 배열의 1번요소에 저장된 계좌의 모든 정보를 출력
    System.out.println(arr[1].toString()); //toString 생략가능해!

    //문제3. 배열에 저장된 모든 계좌의 예금액 합을 출력

    //getBalance[0] -> 0번째 요소에 있는 예금액 리턴
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum = sum + arr[i].getBalance();
    }
    System.out.println("예금액 총 합 : " + sum);
    /// //////////////////////////////////////////////////////////
    int sum2= 0;
    for (Acc e : arr){
//      System.out.println(e); // << toString이 생략되어 있어 출력함.
      sum2 = sum2 + e.getBalance();
    }



    //문제4. 배열에 저장된 계좌정보 중 계좌번호가 "2222"인 계좌를 찾고,
    // 해당 계좌의 계좌주를 출력해보세요.
    for (int i = 0; i < arr.length; i++){
      if (arr[i].getAccNumber().equals("2222")){
        System.out.println(arr[i].getOwner());
      }
    }
    /// ////////////////////////////////////////////////
    for (Acc e : arr){
      if (e.getAccNumber().equals("2222")){
        System.out.println("계좌주 : " + e.getOwner());
      }
    }






  }
}
