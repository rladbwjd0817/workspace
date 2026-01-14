package test;

public class MyStudent implements StudentUtil{

  @Override
  public int getTotalScore(Student student) {
    return student.getKorScore() + student.getEngScore() + student.getMathScore();
  }

  @Override
  public Student getHighScoreStudent(Student student1, Student student2) {
//    int sum1 = student1.getKorScore() + student1.getEngScore() + student1.getMathScore();
    int sum1 = getTotalScore(student1);
//    int sum2 = student2.getKorScore() + student2.getEngScore() + student2.getMathScore();
    int sum2 = getTotalScore(student2);
    return sum1 > sum2 ? student1 : student2;
  }

  @Override
  public String getGradeByStudentName(Student[] students, String name) {
    String result = "학생 정보 없음";
    Student foundStudent = null;

    //학생 수 만큼 반복
    //     학생               배열
    for (Student student : students){
      if (student.getName().equals(name)){
        double avg = getTotalScore(student) / 3.0; //매개변수 student는 내가 찾은 학생
        result = getGrade(avg);
        break;
      }
    }
    return result;
  }

  @Override
  public int[] getTotalScoresToArray(Student[] students) {
    //학생들의 총점을 저장할 배열 생성
    int[] totalScoreArr = new int[students.length];
    for (int i =0; i < totalScoreArr.length; i++){
      totalScoreArr[i] = getTotalScore(students[i]);
    }

    return totalScoreArr;

  }

  //점수에 따른 등급을 리턴하는 메서드
  public String getGrade(double avg){
    String result = null;

    if (avg >= 90 && avg <= 100){
      result = "A";
    } else if (avg >= 80) {
      result = "B";
    } else if (avg >= 70) {
      result = "C";
    } else {
      result = "D";
    }
    return result;
  }



}
