import java.util.Scanner;

public class CalculatorTest {
    public static void main() {
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);
        cal.setAllData(sc.nextInt(), sc.nextInt(), sc.next());
        cal.printAllData();

    }
}
