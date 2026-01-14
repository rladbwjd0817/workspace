package exception1;


import javax.naming.OperationNotSupportedException;
import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리 : 오류처리
//예외 : 코드로 수정가능한 것
//오류 : 외부상황으로 인해 발생하는 것(ex. 컴퓨터 전원꺼짐,,,)
public class Exception1 {
  public static void main(String[] args) {
    //예외가 발생하는 즉시 프로그램 종료!
    /*
     예외처리 문법
     try{
        예외가 발생할 수 있는 코드 작성
        1. 첫 번째 줄
        2. 두 번째 줄
        3. 세 번째 줄
     } catch(Exception e){
        예외 발생 시 실행할 코드 -> try 구분에서 예외가 발생하지 않으면 실행 X
        만약 2번째 줄이 예외발생하면 밑에 있는 3번째 줄은 실행하지 않고, 바로 catch문을 실행함.
     } catch(Exception e){
        예외 발생 시 실행할 코드
     }
     쓰레드 - 코드 해석해주는 애
     오류가 발생하면 catch문을 해석하는 애 따로, 본문 해석하는 애 따로 생김.
    */
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("첫 번째 수 : ");
      int a = sc.nextInt();
      System.out.print("두 번째 수 : ");
      int b = sc.nextInt();

      System.out.println("a / b = " + a / b);
    } catch (ArithmeticException e){
      System.out.println("수학적 문제가 발생했다 고칠래?");
      //e.getMessage()는 예외 발생 이유를 문자열로 리턴
      System.out.println(e.getMessage());
      e.printStackTrace(); //예외 발생 원인, 위치 알려줌
    } catch (InputMismatchException e){
      System.out.println("이건 입력정보 잘못 입력해서 생긴 문제야 얼렁 고쳐");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    //수학적문제가 발생했을 때는 ArithmeticException이 오류를 받아서 catch문을 실행하는데
    //InputMismatchException은 catch문 실행 X

    System.out.println("프로그램 종료");


  }
}
