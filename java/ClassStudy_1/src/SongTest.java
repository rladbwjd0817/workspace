public class SongTest {
  public static void main(String[] args) {
    //객체선언 및 생성
    Song s1 = new Song();

    s1.setAllData("Idol", "BTS", "Love My Self", 2018,
            new String[]{"RM", "suga", "jhope"});
    s1.printAllData();
    System.out.println("=============================================");

    s1.setAllData("나의 옛날 이야기", "IU", "꽃갈피", 2016,
            new String[]{"IU", "waef"});
    s1.printAllData();
    System.out.println("=============================================");

    //매개변수로 배열이 들어갈 때 변수를 하나 만들어 넣는 방법
    //String[] a = {"asd", "sdg", "aweg"};
//    s1.setAllData("노래제목", "가수", "앨범", 2015, a); << a는 배열의 변수를 넣어서 출력
  }
}