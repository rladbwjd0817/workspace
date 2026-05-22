package com.green.legacy.stu_manage.service;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.mapper.StuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StuService {
  private final StuMapper stuMapper;

//  전체 학급 정보 조회 기능 실행 메서드
  public List<StuDTO> selectStuList(int classNum){
    return stuMapper.selectStuList(classNum);
  }

  public List<ClassDTO> selectClassList(){
    return stuMapper.selectClassList();
  }

//  학생 점수 조회
  public ScoreDTO getScoreInfo(int stuNum){
    return stuMapper.getScoreInfo(stuNum);
  }

//  학생 점수 추가
  public void saveScore(ScoreDTO scoreDTO){
    stuMapper.saveScore(scoreDTO);
  }

}
