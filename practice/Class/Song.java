//노래 설계도(공장)

import java.lang.reflect.Array;
import java.util.Arrays;

public class Song {
    String title;
    String artist;
    String album;
    int year;
    String[] composer;

    public void setAllDate(String title1, String artist1, String album1, int year1, String[] composer1) {
        title = title1;
        artist = artist1;
        album = album1;
        year = year1;
        composer = composer1;
    }

    public void printAllDate(){
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
        System.out.println("Album : " + album);
        System.out.println("년도 : " + year);
        System.out.println(Arrays.toString(composer));
    }

}
