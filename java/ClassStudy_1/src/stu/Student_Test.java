package stu;

import java.util.Scanner;

public class Student_Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;
    StudentService studentService = new StudentService();

    System.out.println("- 예시 -");
    System.out.println("학생관리 프로그램을 실행합니다.");

    while(isRunning){
      System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 :");
      int menu = sc.nextInt();
      switch (menu){
        case 1 :
          //학생등록 기능 실행
          studentService.regStudent();
          break;
        case 2 :
          //학생정보변경(연락처) 기능 실행
          studentService.changeStuTel();
          break;
        case 3 :
          //학생정보출력 기능 실행
          studentService.printStudentInfo();
          break;
        case 4 :
          //모든 학생 정보 출력 기능 실행
          studentService.printStuInfoAll();
          break;
        case 5 :
          System.out.println("프로그램을 종료합니다.");
          //true를 false로 바꾸세요.
          isRunning = false;
          break; // << switch case문에 있는 break는 반복문종료가 아니라 밑에 출력하지 마세요 뜻
        default:
          System.out.println("메뉴를 다시 선택하세요.");
      }


    }
  }
}

//문제가 안풀리면 변수를 활용해볼까 생각해보기!
