package study3;

public class String1 {
  public static void main(String[] args) {
    //String은 클래스 자료형!
    Student s = new Student(); //클래스를 사용하는 방법
    String str = "java";

    //String도 객체를 생성해서 사용할 수 있음!
    String str2 = new String("java");

    //문자열 객체를 생성하는 두 방법은 차이가 있음
    //기본자료형처럼 문자열 객체를 생성하면 같은 문자열은 하나의 데이터만 저장한다.
    String a = "java";
    String b = "java";
    //명령어 new가 있어서 객체를 새로 만들어 각각 새로운 객체를 만듦.
    //결론적으로 같은 문자열이 2개 만들어지고, c,d가 참조하는 주소값이 다름.
    String c = new String("java");
    String d = new String("java");

    // '==' : 숫자 비교 시에는 두 수가 같은지 비교
    //      : 숫자를 제외한 나머지 자료형에 대해서는 '주소가 같은지 비교' 하는 연산 / equals()와 같은 역할
    if (a == b){
      System.out.println("a와 b가 같습니다.");
    }
    if (c == d){
      System.out.println("c와 d가 같습니다.");
    }

    //문자열이 같은지 비교하기 위해서는 equals() 메서드를 사용한다.
    //String 클래스 안에 equals() 메서드가 정의되어 있기 때문에 . 찍고 사용할 수 있다.
    //=> String 클래스는 Object 클래스를 상속하고 있다. (모든 클래스는 Object클래스를 상속한다.)
    //   그리고 Object 클래스안에 equals() 메서드가 정의되어 있다.
    //   String 클래스의 equals() 메서드를 object 클래스의 equals() 메서드를 오버라이딩 한 것!

    if (a.equals(b)){

    }
  }
}
