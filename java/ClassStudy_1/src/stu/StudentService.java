package stu;

import java.util.Scanner;

public class StudentService {

  //학생최대 3명 -> 배열
  //생성자는 선언과 생성 동시에 하는 건 좋은 코드가 X
  private Student[] students; // << 멤버 변수
  private Scanner sc;  // << 멤버 변수
  private int stuCnt; //등록된 학생 수

  //그래서 생성자에 만들기
  //학생 3명이 저장될 공간만 있음.
  public StudentService(){
  students = new Student[3];
  sc = new Scanner(System.in);
  stuCnt = 0;
  }


  //학생등록 메서드
  public void regStudent(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("나이 : ");
    int age = sc.nextInt();
    System.out.print("연락처 : ");
    String tel = sc.next();
    System.out.print("학점 : ");
    String grade = sc.next();

    //입력받은 정보를 가진 학생 객체 생성
    Student s = new Student(name, age, grade, tel);

    // 생성한 객체를 배열에 저장
//    students[stuCnt] = s;
//    stuCnt++;
    students[stuCnt++] = s;



  }
  //학생정보변경 메서드
  public void changeStuTel(){
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경 학생 : ");
    //찾아야 할 학생의 이름
    String name = sc.next();

    //배열에 저장한 데이터의 순번
    int matchedIndex = -1;
    //변경할 연락처
    String changeTel = sc.next();
    //이름이 일치하는 학생의 연락처를 변경
    for (int i = 0; i < stuCnt; i++){
      if (students[i].getName().equals(name)){
        matchedIndex = i;
        break;
      }
    }
    //정보를 찾았을 때 or 못 찾았을 때
    if (matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다.");
    } else {
      System.out.print("연락처 : ");
      String tel = sc.next();
      students[matchedIndex].setTel(tel);
      System.out.println("변경 완료 되었습니다.");
    }


  }

  //학생정보출력 메서드
  public void printStudentInfo(){
    System.out.print("정보를 열람할 학생 : ");
    //찾아야 할 학생의 이름
    String name = sc.next();

    //students 배열에서 입력한 학생 이름 찾기
    int matchedIndex = -1; //이름이 일치하는 학생의 index, 일치하는 순번!
    for(int i = 0; i < stuCnt; i++) {
      if (students[i].getName().equals(name)) {
        matchedIndex = i;
        break;
      }
    }
    if (matchedIndex == -1){
      System.out.println("일치하는 학생이 없습니다.");
    } else {
      System.out.println("요청하신 학생의 정보입니다.");
      System.out.println(students[matchedIndex]);
    }

  }

  //모든 학생 정보 출력 메서드
  public void printStuInfoAll(){
    System.out.print("모든 학생의 정보입니다. ");
    System.out.println("현재 총 학생 수는 " + stuCnt + "명 입니다.");

    //등록된 학생 수 만큼 반복해서 정보 출력
    //학생은  students 배열에 저장되어 있음
    //여기선 배열의 길이만큼 반복하면 안됨!
    for (int i = 0; i < stuCnt; i++){
      System.out.println(students[i]);
    }
//    System.out.println(students[0]);
//    System.out.println(students[1]);
//    System.out.println(students[2]);
    //students[0] 여기에 학생 한 명이 저장되어 있다.

  }
}
