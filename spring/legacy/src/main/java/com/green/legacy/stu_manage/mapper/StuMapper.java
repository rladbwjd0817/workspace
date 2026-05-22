package com.green.legacy.stu_manage.mapper;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {

//  전체 학생 정보 조회
  List<StuDTO> selectStuList(int classNum);

  // 전체 학급 조회
  List<ClassDTO> selectClassList();

  // 학생 점수 조회
  ScoreDTO getScoreInfo(int stuNum);

  // 학생 점수 등록 및 수정
  void saveScore(ScoreDTO scoreDTO);

}
