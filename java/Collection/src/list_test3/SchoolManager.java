package list_test3;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
  public static void main(String[] args) {

    //학생을 9명 생성
    Student s1 = new Student("전하은", 11, 50);
    Student s2 = new Student("허이솔", 10, 90);
    Student s3 = new Student("김도훈", 8, 90);
    Student s4 = new Student("김윤빈", 8, 80);
    Student s5 = new Student("송라미", 8, 70);
    Student s6 = new Student("이재아", 8, 90);
    Student s7 = new Student("조윤서", 9, 60);
    Student s8 = new Student("박도연", 9, 90);
    Student s9 = new Student("최은솔", 8, 60);

    //학급별 저장되어야 하는 학생 목록 생성
    List<Student> stulist1 = new ArrayList<>();
    stulist1.add(s1);
    stulist1.add(s2);
    stulist1.add(s3);

    List<Student> stulist2 = new ArrayList<>();
    stulist2.add(s4);
    stulist2.add(s5);
    stulist2.add(s6);

    List<Student> stulist3 = new ArrayList<>();
    stulist3.add(s7);
    stulist3.add(s8);
    stulist3.add(s9);

    //학급 3개 생성
    StudyClass_Teacher cls1 = new StudyClass_Teacher("풀잎향기반", "김유정", stulist1);
    StudyClass_Teacher cls2 = new StudyClass_Teacher("아침이슬반", "김유정", stulist2);
    StudyClass_Teacher cls3 = new StudyClass_Teacher("예쁜둥지반", "이은경", stulist3);

    List<StudyClass_Teacher> clsList = new ArrayList<>();
    clsList.add(cls1);
    clsList.add(cls2);
    clsList.add(cls3);

    //학교
    School school = new School(clsList);

    int age= school.getClassList().get(1).getStuList().get(1).getAge();
    System.out.println(age + "살");

    String teacherName = school.getClassList().get(2).getTeacherName();
    System.out.println(teacherName + "선생님");
    System.out.println();

    school.showAllStudentINfo("김유정");
    System.out.println();

    school.showAvg();
    System.out.println();

    school.showBestStudent();
  }
}
