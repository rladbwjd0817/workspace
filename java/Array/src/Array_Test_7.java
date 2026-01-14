public class Array_Test_7 {
  public static void main(String[] args) {
    //정수를 10개 저장할 수 있는 배열 생성
    int[] arr1 = new int[10];
    //모든 요소에 3 넣어 -> 출력
    for (int i = 0; i < arr1.length; i++){
      //i는 arr배열의 몇 번째 요소인지 알려주는 숫자, arr의 모든 요소에 3을 저장
      arr1[i] = 3;
//      System.out.println(arr1[i]);
    }
    for (int i = 0; i < arr1.length; i++){
      System.out.println(arr1[i]);
    }
  }
}
