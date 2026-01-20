package com.green.epm;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
  //Emp 객체 다수 저장할 수 있는 List 멤버변수 생성
  List<Emp> empList;

  public EmpController(){
    empList = new ArrayList<>();

    empList.add(new Emp(1, "김자바", "영업부", 1000, "사원"));
    empList.add(new Emp(2, "최자바", "홍보부", 2000, "과장"));
    empList.add(new Emp(3, "이자바", "홍보부", 3000, "대리"));
    empList.add(new Emp(4, "박자바", "영업부", 4000, "사원"));
    empList.add(new Emp(5, "홍자바", "행정부", 5000, "대리"));
  }

//  사원 목록 조회 요청에 응답하는 api
//  url : (GET) localhost:8080/emps
  @GetMapping("")
  public List<Emp> getEmplist(){
    System.out.println("사원 목록 조회입니다.");
    return empList;
  }

//  사번을 통해 특정 사원 한명의 정보를 요청하면 이에 응답하는 api
//  url : (GET) localhost:8080/emps/{empNum}
  @GetMapping("/{empNum}")
  public Emp getEmpNum(@PathVariable("empNum") int empNum){
    Emp result = null;

    for (Emp e : empList){
      if (e.getEmpNum() == empNum){
        result = e;
      }
    }
    System.out.println("해당 사원의 정보를 조회합니다.");
    return result;
  }

//  사원등록요청에 응답하는 api, 요청시 등록할 사원정보가 함께 전달
//  url : (POST) localhost:8080/emps/{newEmp}
  @PostMapping("")
  public List<Emp> postEmp(Emp newEmp){
    for (int i = 0; i < empList.size(); i++){
      empList.add(newEmp);
    }
    System.out.println("해당 사원이 등록되었습니다.");
    return empList;
  }

//  사번을 통해 특정 사원 한명을 삭제하는 요청이 오면 이에 응답하는 api
//  url: (DELETE) localhost:8080/emps/
  @DeleteMapping("/{empNum}")
  public List<Emp> deleteEmp(@PathVariable("empNum") int empNum){

    for (int i = 0; i < empList.size(); i++){
      if (empList.get(i).getEmpNum() == empNum){
        empList.remove(i);
      }
    }
    System.out.println("해당 사원이 삭제되었습니다.");
    return empList;
  }

//  사번을 통해 특정 사원 한 명의 정보 수정 요청이 오면 이에 응답하는 api
//  요청 시 정보를 수정하려는 사원의 사번과 일치하는 사원의 수정할 급여, 부서명 정보가 함께 전달됨.
//  url : (PUT) localhost:8080/emps/{empNum}
  @PutMapping("/{empNum}")
  public Emp putEmpNum(@PathVariable("empNum") int empNum){
    Emp result = null;

    for (Emp e : empList){
      if (e.getEmpNum() == empNum){
        e.setSalary(e.getSalary());
        e.setEmpName(e.getEmpName());
      }
      result = e;
    }
    System.out.println("사원의 정보가 수정되었습니다.");
    return result;
  }






}
