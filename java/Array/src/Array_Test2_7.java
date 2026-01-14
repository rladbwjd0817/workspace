import java.util.Arrays;

public class Array_Test2_7 {
  public static void main(String[] args) {
    //정수 10개 담을 수 있는 배열 생성
    int[] arr = new int[10];

    //반복 : 랜덤 수를 10개 나오게 해서 저장하는 것, 최소min, 최대max의 값을 배열요소와 비교하는 것

    //Math.random 함수 사용해서 1에서 100사이의 정수를 배열 각 요소에 저장
    for (int i = 0; i < arr.length; i++){
      //Math.random은 실수 0.0 ~ 0.9999
      arr[i] = (int) (Math.random() * 100 + 1);
//      if (min < arr[i]){
//        min = arr[i];
//      }
//      if (max < arr[i]){
//        max = arr[i];
//      }
    }
    //배열에 저장된 모든 정수 및 최소, 최대값 출력
    System.out.println(Arrays.toString(arr));
    //최대, 최소값 저장할 변수
    int min = arr[0]; //arr 배열의 0번째 값이 가장 작다고 가정
//    for (int i = 0; i < arr.length; i++){
//      if (min > arr[i]){
//        min = arr[i];
//      }
//    }
    int max = arr[0]; //arr 배열의 0번째 값이 가장 크다고 가정
    for (int i = 1; i < arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
      }
      if (min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println("min : " + min);
    System.out.println("max : " + max);
  }
}
