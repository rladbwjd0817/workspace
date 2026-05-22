package com.green.jpa_study.controller;

import com.green.jpa_study.dto.MemberRequest;
import com.green.jpa_study.dto.MemberResponse;
import com.green.jpa_study.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/members")
public class MemberController {
  private final MemberService memberService;

  @GetMapping("")
  public ResponseEntity<?> findAll(){
    try {
      return ResponseEntity.status(HttpStatus.OK).body(memberService.findAll());
    }catch (Exception e){
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //회원 등록
  @PostMapping("")
  public ResponseEntity<?> create(@RequestBody MemberRequest memberRequest){
    try {
      MemberResponse result = memberService.create(memberRequest);
      return ResponseEntity.status(HttpStatus.OK).body(result);
    }catch (Exception e){
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  // 회원정보 수정
  @PutMapping("/{stuNum}")
  public ResponseEntity<?> update(@PathVariable("stuNum") Long stuNum, @RequestBody MemberRequest memberRequest){
    try {
      MemberResponse m = memberService.update(stuNum, memberRequest);
      return ResponseEntity.status(HttpStatus.OK).body(m);
    }catch (Exception e){
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
