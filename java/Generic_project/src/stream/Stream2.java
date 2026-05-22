package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
  public static void main(String[] args) {
    List<Student> stuList = new ArrayList<>();
    stuList.add(new Student("kim", 100, 90));
    stuList.add(new Student("lee", 80, 95));
    stuList.add(new Student("park", 90, 70));
    stuList.add(new Student("hong", 75, 84));
    stuList.add(new Student("choi", 80, 65));

    // 1. 학생 리스트에서 국어점수가 80점 이상인 학생만 추출
    List<Student> students = stuList.stream()
                                    .filter(stu -> stu.getKorScore() >= 80)
                                    .toList();

    // 2. 국어는 70점 이상 그리고 영어는 80점 이상인 학생만 추출
    List<Student> stuScore = stuList.stream()
                                        .filter(stu -> stu.getKorScore() >= 70 && stu.getEngScore() >= 80)
                                        .toList();

    List<Student> r3 = stuList.stream()
                              .filter(stu -> stu.getKorScore() >= 70)
                              .filter(stu -> stu.getEngScore() >= 80)
                              .toList();

    // 3. 리스트에 저장된 학생들의 국어점수만 리스트로 추출 [70, 80, 90...]
    List<Integer> studentList = stuList.stream()
                                        .map(stu -> stu.getKorScore())
                                        .toList();

    // 4. 총점이 150점 이상인 학생들의 이름을 리스트로 반환
    List<String> stuNameList = stuList.stream()
                                      .filter(stu -> stu.getKorScore() + stu.getEngScore() >= 150)
                                      .map(stu -> stu.getName())
                                      .toList();

    // 국어 점수의 합
    int totalKorScore =  stuList.stream()
                                .mapToInt(s -> s.getKorScore()).sum();

    // 평균 국어점수
    double avgKorScore =  stuList.stream()
                               .mapToInt(s -> s.getKorScore()).average().getAsDouble();
    // 가장 큰 수
    int r6 =  stuList.stream()
                      .mapToInt(s -> s.getKorScore()).max().getAsInt();

    // 가장 작은 수
    int r7 =  stuList.stream()
                      .mapToInt(s -> s.getKorScore()).min().getAsInt();

    // 학생수
    long r9 =  stuList.stream()
                      .mapToInt(s -> s.getKorScore()).count();



  }


}
