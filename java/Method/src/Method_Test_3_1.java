import java.util.Arrays;

public class Method_Test_3_1 {
  public static void main(String[] args) {
//    gugudan(3);
//    test3_2(4);
//    int[] a = {1,9,13,3};
//    int result = test3_6(a);
//    System.out.println(result);

    int[] a = {1,2,3,4,5};
    int[] result = test3_9(a);
    System.out.println(Arrays.toString(result));




  }

  public static int gugudan(int a){
    int mul = 0;
    System.out.println("=== "+ a + "단 ===");
    for (int i = 1; i < 10; i++){
      mul = a * i;
      System.out.println(a + " * " + i + " = " + a * i);
    }
    return mul;
  }

  public static void test3_2(int a){
    //1~100까지 수를 저장해 - i
    //a라는 수의 배수를 출력해  a = 2; 라고 가정
    for (int i = 1; i < 101; i++){
      if (i % a == 0){
        System.out.println(i);
      }
    }
  }

  public static void test3_3(int a){
    a = (int) Math.random();
    for (int i = 0; i < 1; i++){

    }
  }

  public static int test3_6(int[] a){ //a = [1,5,7,3] 가정
    int max = a[0];

    for (int i = 1; i < a.length; i++){
      if (max < a.length){
        max = a[i];
      }
    }
    return max;
  }

  public static int[] test3_9(int[] a){ //a = {1,2,3,4,5} => [2,4]
    //배열 크기는 변경 불가!! => 변경해서 저장할 새로운 창고 만들어야 함.
    //1.매개변수로 들어온 배열 요소에서 짝수의 갯수 구하기
    int cnt = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] % 2 == 0){
        cnt++;
      }
    }
    //2.답을 저장할 배열을 생성
    int[] resultA = new int[cnt];
    //매개 변수로 전달된 배열 요소 중 짝수만 결과 배열에 저장
    int index = 0; // 답이 들어갈 배열의 index번호임 -> 몇 번째 요소이냐?
    for (int i = 0; i < a.length; i++){
      if(a[i] % 2 == 0){
//        resultA[index] = a[i];
//        index++;
        resultA[index++] = a[i];
//        resultA[++index] = a[i]; => 얜 안됨!!!!! index가 0이 아니라 1증가 후 1일 때 a[i]값이 1에 저장됨.
      }
    }
    return resultA;
  }





}
