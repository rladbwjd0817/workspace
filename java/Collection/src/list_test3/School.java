package list_test3;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

public class School {
  private List<StudyClass_Teacher> classList;

  public School(List<StudyClass_Teacher> classList) {
    this.classList = classList;
  }

  public List<StudyClass_Teacher> getClassList() {
    return classList;
  }

  public void setClassList(List<StudyClass_Teacher> classList) {
    this.classList = classList;
  }

  //담당교사명을 받아,
  //해당 담당교사가 맡고 있는 모든 반의 학생 정보 출력
  public void showAllStudentINfo(String teacherName){
    for (int i = 0; i < classList.size(); i++){
      if (classList.get(i).getTeacherName().equals(teacherName)){
        classList.get(i).showStudentsInfo();
      }
    }
  }

  //각 반별 평균 점수 및 전체 학급에 대한 평균 점수를 출력
  public void showAvg(){
    double sum = 0;
    for (StudyClass_Teacher cls : classList){
      double classAvg = cls.getAvgScore();
      System.out.println(classAvg);
      sum = sum + classAvg;
    }
    System.out.println("학교 전체 평균 : " + (sum / classList.size()));
  }

  //모든 반에서 최고 성적을 가진 학생의 이름과 점수 출력
  public void showBestStudent(){
    List<Student> bestStudents = new ArrayList<>();

    //각 반별 최고 점수 학생 정보 뽑아오기
    for (int i = 0; i < classList.size(); i++){
      Student s = classList.get(i).getTopStudent();
      bestStudents.add(s);
    }
    Student student = bestStudents.get(0);
    for (Student stu : bestStudents){
      if (stu.getScore() < stu.getScore()){
        student = stu;
      }
    }
    System.out.println(student);
  }

  //매개변수로 반 이름 받고, 해당 반의 평균 리턴
//  public int classAvg(){
//    return
//  }



}
