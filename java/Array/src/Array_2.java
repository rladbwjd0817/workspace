public class Array_2 {
  public static void main(String[] args) {
    //배열 값 읽고 쓰기

    //실수를 3개 저장할 수 있는 배열 arr1 선언 및 생성
    double[] arr1 = new double[3];

    //arr1 배열에 저장된 데이터를 출력
    //배열 변수를 출력하면 이상한 데이터 나옴!!!!
    System.out.println(arr1);

    //배열을 출력할 때는 명확히 몇 번째 요소를 출력할지 코드로 작성해야 함.
    System.out.println(arr1[2]);

    //정수를 10개 저장할 수 있는 배열 arr2 선언 및 생성
    int[] arr2 = new int[10];

    //arr2 배열의 모든 요소의 값을 출력하시오.
    //배열의 요소 갯수는 저장한 데이터 갯수 -1하기!
    //배열 출력은 for문 활용
    for (int i = 0; i < 10; i++){
      System.out.println(arr2[i]);
    }

    System.out.println();

    //arr2에 5를 저장하는 코드 -> 몇 번째 요소에 넣을 건지 명확하게 해야함.
    //arr2 배열의 0번째 요소에 5를 저장
    arr2[0] = 5;

    //arr2 배열의 모든 요소에 3을 저장하는 코드
    for (int i = 0; i < 10; i++){
      arr2[i] = 3;
      System.out.println(arr2[i]);
    }
  }
}
