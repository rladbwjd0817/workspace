public class Array_Test_2_6 {
  public static void main(String[] args) {
    //max 최대값 저장하는 창고
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};

    //작성 위치
    //배열의 요소 중 가장 큰 수 max 저장
    //max의 값과 배열의 요소 비교
    //두 개 비교해서 큰 수는 max에 저장
    //array배열에서 찾는 행위가 반복
    //
    for (int i = 0; i < array.length; i++){
      //만약에 max의 값보다 배열의 요소가 가지는 값이 더 클 때 max에 저장
      if (max < array[i]){
        max = array[i];
      }
    }
    System.out.println("max: " + max);
  }
}
