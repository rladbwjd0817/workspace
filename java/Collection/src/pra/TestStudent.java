package pra;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    Student stu1 = new Student("kkk", 70, 80);
    studentList.add(stu1);

    Student stu2 = new Student("yyy", 80, 90);
    studentList.add(stu2);

    Student stu3 = new Student("jjj", 90, 50);
    studentList.add(stu3);

    for(Student student : studentList){
      System.out.println(student);
    }

    System.out.println("=====================================================================");

    for(Student student : studentList){
      if (student.getTotalScore() >= 150){
        System.out.println(student);
      }
    }
    System.out.println("=====================================================================");
    double avg = 0;

    for (Student student : studentList){
      avg = student.getTotalScore() / 2.0;
      System.out.println("평균 점수 : " + avg);
    }
    System.out.println("=====================================================================");

    for (Student student : studentList){
      if (stu1.getTotalScore() > stu2.getTotalScore()){
        System.out.println(stu1);
      } else if (stu2.getTotalScore() > stu3.getTotalScore()) {
        System.out.println(stu2);
      } else {
        System.out.println(stu3);
      }
      break;
    }





  }


}
