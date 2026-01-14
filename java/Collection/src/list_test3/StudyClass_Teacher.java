package list_test3;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;

public class StudyClass_Teacher {
  private String className;
  private String teacherName;
  private List<Student> stuList;

  public StudyClass_Teacher(String className, String teacherName, List<Student> stuList){
    this.className = className;
    this.teacherName = teacherName;
    this.stuList = stuList;
  }

  //setter
  public void setStuList(List<Student> stuList){
    this.stuList = stuList;
  }

  public void setClassName(String className){
    this.className = className;
  }

  public void setTeacherName(String teacherName){
    this.teacherName = teacherName;
  }

  //getter

  public String getClassName() {
    return className;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public List<Student> getStuList(){
    return stuList;
  }

  @Override
  public String toString() {
    return "StudyClass_Teacher{" +
            "className='" + className + '\'' +
            ", teacherName='" + teacherName + '\'' +
            ", stuList=" + stuList +
            '}';
  }

  //해당 반 모든 학생 모든 정보 출력
  public void showStudentsInfo(){
    for (Student s: stuList){
      System.out.println(s);
    }
  }

  //해당 반 평균 성적 리턴
  int sum = 0;
  public double getAvgScore(){
    for (int i = 0; i < stuList.size(); i++){
      sum = sum + stuList.get(i).getScore();
    }
//    System.out.println((double) sum / stuList.size());
    return (double) sum / stuList.size();
  }

  //해당 반에서 최고 성적을 지닌 학생 리턴
  public Student getTopStudent(){
    Student topStu = stuList.get(0);
    //최고 성적의 학생(0번째 학생이 가장 큰 점수를 가진 학생)
    for (Student student : stuList){
      if (topStu.getScore() < student.getScore()){
        topStu = student;
      }
    }
    return topStu;
  }

}
