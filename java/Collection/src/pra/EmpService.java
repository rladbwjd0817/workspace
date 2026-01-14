package pra;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
  private List<Emp> empList;
  private Emp e1;
  private Scanner sc;

  public EmpService() {
    empList = new ArrayList<>();

    empList.add(new Emp(1001, "김자바", "개발부", "010-2222-1111", 10000 ));
    empList.add(new Emp(2002, "이자바", "개발부", "010-3333-2222", 20000 ));
    empList.add(new Emp(3003, "콩자바", "영업부", "010-4444-3333", 30000 ));
    empList.add(new Emp(4004, "박자바", "생산부", "010-5555-4444", 40000 ));
    empList.add(new Emp(5005, "총자바", "영업부", "010-6666-5555", 50000 ));
    empList.add(new Emp(6006, "확자바", "생산부", "010-7777-6666", 60000 ));

    e1 = new Emp();
    sc = new Scanner(System.in);
  }

  public void login(){
    boolean isRunning = true;
    while (isRunning){
      System.out.print("사번 : ");
      int empNo = sc.nextInt();
      System.out.print("비밀번호(연락처의 마지막 4자리) : ");
      String pw = sc.next();

      //일부 문자열 추출 - substring()
      //문자열 쪼개기 - split()
      //정보가 일치하는 회원 찾기
      boolean isNotFound = true;
      for (Emp e: empList){
        if (e.getEmpNo() == empNo && e.getPw().equals(pw)){
          System.out.println("로그인 하였습니다.");
          System.out.println(e.getEmpName() + "님 반갑습니다.");
          isRunning = false;
          isNotFound = false;
          break;
        }
      }
      if (isNotFound){
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
      }
    }
  }
  public void showSalaryInfoPerDept(){
    System.out.print("부서명 : ");
    String deptName = sc.next();

    System.out.println("=== " + deptName + " 월급 현황 ===");

    int sum = 0;
    int cnt = 0;
    for (Emp e : empList){
      if (e.getDeptName().equals(deptName)){
        e.showInfo();
        sum = sum + e.getSalary();
        cnt++;
      }
    }
    System.out.println(deptName + "의 월급 총액은 " + sum + "원이며, 평균 급여는" + (sum/ (double)cnt) + " 원 입니다.");



  }

  public void increaseSalary(){
    System.out.print("부서명 : ");
    String deptName = sc.next();
    System.out.print("인상급여 : ");
    int salary = sc.nextInt();

    System.out.println(deptName + "각 사원의 급여가 각각" + salary + "원씩 인상됩니다.");


  System.out.println(deptName + "각 사원의 급여가 각각" + deptName + " 월급 현황 ===");
    for (int i = 0; i < empList.size(); i++){
      if (empList.get(i).getDeptName().equals(deptName)){
        empList.get(i).setSalary(empList.get(i).getSalary() + salary);
      }
    }
    System.out.println("==월급 인상 후 " + deptName + " 월급 현황 ==");

    for (int i = 0; i < empList.size(); i++){
      if (empList.get(i).getDeptName().equals(deptName)){
        empList.get(i).showInfo();
      }
    }
  }


//  public void department(){
//    //키보드로 부서명을 입력받아
//    String deptName = sc.next();
//    int sum = 0; // 월급 총액
//    //입력받은 부서명이 리스트에 있는 부서와 같은지 확인
//    for (int i = 0; i < empList.size(); i++){
//      if (empList.get(i).equals(deptName)){
//        System.out.println("== 개발부 월급 현황 ==");
//
//        for (Emp e3 : empList){
//          System.out.print("이름 : " + e3.getEmpName());
//          System.out.println(", 월급 : " + e3.getSalary());
//          System.out.println("개발부서의 월급 총액은 " + sum + "원이며,");
//
//          for (int j = 0; j < empList.size(); j++){
//            sum = sum + empList.size();
//            break;
//          }
//
//        }
//
//      }
//
//    }
//    //같으면 그 부서 이름과 월급 출력
//    //그 부서의 월급 총액과 평균 급여 출력
//  }



}

//  막히는 부분 : 리스트 내 정보 출력하는 것