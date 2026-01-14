package com.green.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//html로 데이터를 전송하는 클래스
@RestController //클래스 위에 있는 어노테이션은 대부분 객체 생성하는 어노테이션
public class TestController {

  @GetMapping("/test1")
  public String aaa(){
    return "java";
  }

  @GetMapping("/test2")
  public int bbb(){
    return 10;
  }

  @GetMapping("/test3")
  public Student ccc(){
    Student s = new Student("kim", 80);
    return s;
  }

  @GetMapping("/test4")
  public List<Student> ddd(){
    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("kim", 70));
    stuList.add(new Student("lee", 70));
    stuList.add(new Student("park", 70));
    return stuList;
    //웹브라우저로 데이터를 보내면 웹브라우저는 List를 자바스크립트의 배열처럼 해석해서 출력함.
  }



}
