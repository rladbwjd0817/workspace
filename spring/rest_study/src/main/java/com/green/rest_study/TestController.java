package com.green.rest_study;

//react에서 들어온 요청에 대한 응답을 하는 클래스: controller -> API

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //객체 생성 + REST 문법을 적용한 컨트롤러 역할 부여
public class TestController {

//  회원목록을 조회하는 API
  @GetMapping("/members") //요청이 들어오면 실행할 연결고리(url)
//  GetMapping, PostMapping ,,,, -> 제어상태
//  ("/members"), (/123456) -> 제어 대상
  public String getMemberList(){
    System.out.println("회원 목록을 조회합니다."); //콘솔창에 나타남
//    응답하고 데이터를 다시 웹브라우저에 주는것 -> return
    return "김자바, 박자바, 최자바"; //웹브라우저로 응답
  }

//  3번 회원의 정보를 조회하는 API
  @GetMapping("/members/3")
  public String getMemberDetail(){
    System.out.println("3번 회원의 정보를 조회합니다.");
    return "김자바";
  }

//  회원 등록 api
  @PostMapping("/members")
  public int regMember(){
    System.out.println("회원을 등록합니다.");
    return 1; //1: 등록성공, 0: 등록실패 라고 가정
  }





}
