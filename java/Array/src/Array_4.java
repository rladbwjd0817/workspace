import java.util.Arrays;

public class Array_4 {
  public static void main(String[] args) {

    //배열이 자료형이라는 의미
    int[] a1 = {1,2,3};
//    String[] a2 = a1; = a1, a2는 자료형이 다르기에 저장 불가!
//    int d1 = a1; => 배열(참조자료형), 기본자료형 다르기에 대입 안돼

    //기본 자료형은 값이 복사됨!

    int[] a3 = a1; //같은 자료형이면 대입가능

    int[] a = {1,2,3};
    // 참조자료형 : a라는 변수에 하나의 값만 저장이 가능하나 그 하나의 데이터에 여러 데이터를 참조해서 가지고 오는 형태
    // 참조자료형은 데이터 복사 안됨.
    //=> 아파트 생각하기
    //=> 아파트 부지 a에 {}동에 1호 집주소(위치)를 가지고 옴
    int[] b = a;
    //아파트 부지 b에 a부지에 세워진 {}동 1호 집주소(위치)를 가지고 옴

    int[] arr1 = {1,3,5};
    int[] arr2 = {4,5};
    arr2 = arr1;
    arr2[0] = 6;
    arr1[1] = 7;

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));




  }
}
