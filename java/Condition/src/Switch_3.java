public class Switch_3 {
  public static void main(String[] args) {
    // 90 <= score <= 100  -> 'A' 출력
    // 80 <= score <= 89  -> 'B' 출력
    // 70 <= score <= 79  -> 'C' 출력
    // score < 70  -> 'D' 출력
    int score = 87;
    String grade = "";

    switch (score/10){
//      case 10:
      case 9, 10:
        grade = "A";
        break;
      case 8:
        grade = "B";
        break;
      case 7:
        grade = "C";
        break;
      default:
        grade = "D";
    }

    System.out.println(grade);
  }
}
