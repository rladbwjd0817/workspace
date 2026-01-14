import javax.swing.*;

public class Array_Test_2_3 {
  public static void main(String[] args) {
    //1,2,3을 초기값을 갖는 배열 arr1
    int[] arr1 = {1,2,3};
    //4,5,6을 초기값을 갖는 배열 arr2
    int[] arr2 = {4,5,6};
    //새로운 배열 newArr에 arr1과 arr2의 값을 복사
    int[] newArr = new int[arr1.length + arr2.length];

    //복사 후 newArr은 1,2,3,4,5,6의 값을 가져야 함
    //newArr 배열에 arr1배열의 모든 요소를 저장
    //복사하는 행위가 반복
    for (int i = 0; i < arr1.length; i++){
      newArr[i] = arr1[i];
    }
    //newArr 배열에 arr2배열의 모든 요소를 저장
    //복사하는 행위가 반복
    for (int i = 0; i < arr2.length; i++){
      newArr[i + arr1.length] = arr2[i];
    }
    for (int i = 0; i < newArr.length; i++){
      System.out.println(newArr[i] + " ");

    }
  }
}
