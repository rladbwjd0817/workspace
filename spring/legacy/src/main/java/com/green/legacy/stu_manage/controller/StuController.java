package com.green.legacy.stu_manage.controller;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
@RequiredArgsConstructor
public class StuController {
  private final StuService stuService;

  @RequestMapping("/main")
  public String main(@RequestParam(name = "classNum", required = false, defaultValue = "0") int  classNum, Model model){
    // 전달되는 학급 번호
    System.out.println("classNum = " + classNum);

    // 학급목록
    model.addAttribute("classList", stuService.selectClassList());
    // 학생목록
    model.addAttribute("stuList", stuService.selectStuList(classNum));

    // 선택한 학급번호
    model.addAttribute("selectedClassNum", classNum);

    return "stu/stu_manage";
  }

  // 비동기 방식
  @ResponseBody // 이 메서드는 비동기 메서드임을 인지
  @RequestMapping("/list")
  public List<StuDTO> getStuList(@RequestParam(name = "classNum") int classNum){

    return stuService.selectStuList(classNum);
  }

  // 학생 한 명 점수 조회
  @ResponseBody
  @RequestMapping("/score")
  public ScoreDTO getScoreInfo(@RequestParam(name = "stuNum") int stuNum){
    return stuService.getScoreInfo(stuNum);
  };

  // 학생 한 명 점수 등록 + 수정
  @ResponseBody
  @RequestMapping("/update")
  public void saveScore(@RequestBody ScoreDTO scoreDTO){
    stuService.saveScore(scoreDTO);
  }
}
