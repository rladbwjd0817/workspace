package pra;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Emp {
  private int empNo; //사번
  private String empName;
  private String deptName;
  private String tel;
  private int salary;

  public Emp(){}

  public Emp(int empNo, String empName, String deptName, String tel, int salary) {
    this.empNo = empNo;
    this.empName = empName;
    this.deptName = deptName;
    this.tel = tel;
    this.salary = salary;
  }

  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  //연락처의 마지막 4자리 문자열만 리턴하는 메서드
  public String getPw(){
    return tel.substring(9);
  }

  //사원의 이름 및 월급정보 출력하는 메서드
  public void showInfo(){
    System.out.println("이름 : " + empName + ", 월급 : " + salary);
  }

  public int getTotalSalary(){
    return getTotalSalary();
  }
}
