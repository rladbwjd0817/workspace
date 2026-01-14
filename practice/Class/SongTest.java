public class SongTest {
    public static void main(String[] args) {
        //객체선언 및 생성
        Song s1 = new Song();

        s1.setAllDate("Idol", "BTS", "Love My Self", 2018,
                new String[]{"RM", "suga", "jhope"});
        s1.printAllDate();
        System.out.println("=============================================");
        s1.setAllDate("Fake Love", "BTS", "Love Your Self", 2018,
                new String[]{"RM", "suga", "pdog", "jhope"});
        s1.printAllDate();




    }
}
