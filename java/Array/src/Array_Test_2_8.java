public class Array_Test_2_8 {
  public static void main(String[] args) {
    //길이가 100인 배열을 만들어
    int[] ar = new int[100];
    //소수 저장할 창고
    int j = 0;
    //각 요소의 값을 1~100으로 변경 -> 변경해서 저장하는 것이 반복
    for (int i = 0; i < ar.length; i++){
      ar[i] = i + 1;
      if (i / i == 2){
        System.out.println(ar[i]);
      }
    }
    //배열에 들어간 수 중 소수만 출력
  }
}


//함수 = 메서드 : 특정 기능을 정의한 것
/*메서드 정의 - 특정 기능 만들기
* */