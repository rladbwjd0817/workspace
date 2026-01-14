package study3;

public class String2 {
  public static void main(String[] args) {

    //String은 immutable 변수다. => 독특한 아이,,,,,,,,,
    //immutable : 한 번 값이 저장되면 값 변경 불가함.

    String a = "java";
    String b = a;

    a = "python";

    System.out.println(a);
    System.out.println(b);


  }
}
