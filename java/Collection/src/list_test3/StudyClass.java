package list_test3;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
  private List<Student> student;
  private String className;
  private String teacherName;

  public StudyClass(List<Student> student, String className, String teacherName) {
    this.student = student;
    this.className = className;
    this.teacherName = teacherName;
  }

  public void printAllStudentInfo(){
    Student s1 = new Student("dd", 20, 70);
    System.out.println(s1.getAge());
    System.out.println(s1.getName());
    System.out.println(s1.getScore());
  }

  public int avgScore(){
    return avgScore();
  }
}
