public class StudentTest {
    public static void main() {
        Student student1 = new Student();

        student1.setAllData("전정국", 29, "부산", 901, "010-0901-0613");
        student1.printAllData();

        student1.setAllData("박지민", 31, "부산", 1013, "010-1013-0613");
        student1.printAllData();


    }
}
