import java.util.Scanner;

public class Method_pra_2 {
    public static void main(String[] args) {
        test2_1(4, 6);

        System.out.print("2_2 두 수 : ");
        Scanner sc = new Scanner(System.in);
        test2_2(sc.nextInt(), sc.nextInt());

        test2_3(7, 18);
        test2_4("방탄", "보라해");
        test2_5(95);
        String result = test2_6(7);
        System.out.println(result + "good");
        test2_7(7.4);
        test2_8(7, 5, 6);
        test2_9(10);
        test2_10("방탄아 콘서트열자");
    }

    public static int test2_1(int a, int b){
        System.out.println("2_1 두 수의 합 : " + (a + b));
        return a + b;
    }

    public static int test2_2(int a, int b){
        System.out.println("2_2 두 수의 곱 : " + a * b);
        return a * b;
    }

    public static int test2_3(int a, int b){
        int max = Math.max(a,b);
        System.out.println("2_3 더 큰 수 : " + max);
        return max;
    }

    public static String test2_4(String a, String b){
        System.out.println(a + b);
        return a + b;
    }

    public static String test2_5(int a){
        String grade ="";
        if (a >= 90){
            grade = "A";
        } else if (a >= 70) {
            grade = "B";
        } else {
            grade = "C";
        }
        System.out.println("2_5 등급은 : " + grade);
        return grade;
    }

    public static String test2_6(int a){
        return a + "";
    }

    public static double test2_7(double a){ // a = 4;
        //제곱 값 : 자신을 입력받은 수 만큼 곱하는 것 => 반복
        //i = 곱하는 횟수
        double mul = a * a; // 곱셈 결과를 저장하는 창고
        for (double i = 1; i == a; i++){
            mul++;
        }
        System.out.println(mul);
        return mul;
    }

    public static int test2_8(int a, int b, int c){
        System.out.println("2_8 세 수의 평균 : " + (a + b + c) / 3);
        return (a + b + c) / 3;
    }

    public static int test2_9(int a){ //a = 10; 가정
        //1 ~ a 까지 저장
        //저장 한 수 중 홀수만 구하고, 홀수의 합을 리턴
        int sum = 0;
        for (int i = 1; i < a + 1; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static boolean test2_10(String str){
        //삼항연산자 : 조건 ? 참 : 거짓;
        boolean str2;
        str2 = str.length() % 2 == 0 ? true : false;
        System.out.println(str2);
        return str2;
    }
}
