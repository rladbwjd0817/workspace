//노래 설계도(공장)

import java.lang.reflect.Array;
import java.util.Arrays;

public class Song {
  String title;
  String artist;
  String album;
  int year; //연도를 더하거나 하지 않기에 String으로 사용해도 상관 없음.
  // 배열사용을 위해서는 선언만으로 끝내지 않고 생성을 해야 사용가능함.
  String[] composer = new String[3];

  //매개변수로 들어온 데이터를 객체의 데이터를 바꾸겠다는 의미.
  //매개변수는 데이터의 통로라고 생각!
  public void setAllData(String title1, String artist1, String album1, int year1, String[] composer1) {
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer1;
  }

  //모든 멤버변수 출력하는 메서드
  public void printAllData(){
    System.out.println("Title : " + title);
    System.out.println("Artist : " + artist);
    System.out.println("Album : " + album);
    System.out.println("year : " + year + "년");
    System.out.print("작곡가 : ");
    System.out.println(Arrays.toString(composer));
//    System.out.print("작곡가" + composer);
//    for (int i = 0; i < composer.length; i++){
//      System.out.print(composer[i] + " ");
//    }

    //class도 자료형이기에 <클래스명 객체명;> 이렇게 사용가능함

  }

}
