public class Array_Test_2_2 {
  public static void main(String[] args) {
    //초기값 5~1로 갖는 배열
    int[] arr = {5, 4, 3, 2, 1};
    int[] newArr = new int[5];
    //복사하는 행위 반복
//    newArr[0] = arr[0];
//    newArr[1] = arr[1];
    for (int i = 0; i < arr.length; i++){
      newArr[i] = arr[i];
      System.out.println(newArr[i]);
    }
  }
}
