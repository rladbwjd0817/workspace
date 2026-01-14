//계산기 설계도
public class Calculator {
  int num1; //첫 번째 수
  int num2; //두 번째 수
  String oper; //연산자

  public void initAllData(int num1, int num2, String oper){
    this.num1 = num1;
    this.num2 = num2;
    this.oper = oper;
  }

//  //변경할 값
//  public void setNum1(int num1){
//    this.num1 = num1;
//  }
//
//  public void setNum2(int num2){
//    this.num2 = num2;
//  }
//
//  public void setOper(String oper){
//    this.oper = oper;
//  }
//
//  //리턴할 값
//  public int getNum1(){
//    return num1;
//  }
//
//  public int getNum2(){
//    return num2;
//  }
//
//  public String getOper(){
//    return oper;
//  }

  //return은 데이터를 재사용할 때 용이하므로 재사용하는 데이터는 return할 수 있도록 하기!
 // 모든 변수의 값을 변경하는 메서드
  public void setData(int num1, int num2, String oper){
    this.num1 = num1;
    this.num2 = num2;
    this.oper = oper;
  }

  //


  //연산결과를 출력하는 메서드
  public void printAllData() {
//    System.out.println("-결과-");
//    System.out.println("첫 번째 수 : " + num1);
//    System.out.println("두 번째 수 : " + num2);
//    System.out.println("연산자 : " + oper);

    //연산자를 잘못 입력하면 메서드 실행 X
    if (!(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/"))) {
      return; // << break;랑 비슷한 역할 return 되는 데이터는 없다!
    }

    System.out.print(num1 + " " + oper + " " + num2 + " = ");

    switch (oper){
      case "+" :
        System.out.println(num1 + num2);
        break;
      case "-" :
        System.out.println(num1 - num2);
        break;
      case "*" :
        System.out.println(num1 * num2);
        break;
      case "/" :
        System.out.println((double)num1 / num2);
    }
  }


//    if (oper.equals("+")){
//      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//    } else if (oper.equals("-")) {
//      System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//    } else if (oper.equals("*")) {
//      System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//    } else if (oper.equals("/")) {
//      System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//    } else {
//      System.out.println("잘못 입력 하였습니다.");
//    }

  //매개변수로 전달된 데이터가 짝수일때만 출력
//  public void printEven(int num){
//    if (num % 2 != 0) return; //특정 조건에서 메서드를 중지시킬 때 사용 -> 남아있는 코드실행 안함!
//    System.out.println(num);
//  }

  }



