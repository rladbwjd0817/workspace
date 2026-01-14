public class If_3 {
  public static void main(String[] args){
    int num = 5;

    //if, else 둘 다 실행되거나 안되는 경우 X
    //둘 중에 하나는 꼭 실행됨!!

    //num이 10보다 크면 1을 출력
    //조건이 만족하지 않으면 2를 출력

    if(num > 10){
      System.out.println(1);
    }
    //그렇지 않으면......
    else{
      System.out.println(2);
    }
  }
}
