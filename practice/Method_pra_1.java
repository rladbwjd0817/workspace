import java.util.Scanner;

public class Method_pra_1 {
    public static void main(String[] args) {
        test1("안녕하세요");
        test2(7);
        test3("아포방포");
        test4(7, 13);
        test5(7, 5, 70);
        test6(40, 6);
        test7("방탄포에버", "아미포에버");

        System.out.print("키보드로 입력 받은 값 : ");
        Scanner sc = new Scanner(System.in);
        test8(sc.nextInt());

        System.out.print("두 수 : ");
        test9(sc.nextInt(), sc.nextInt());

        test10(9);
        test11(8, 4);
        test12(9);
        test13(10, 4);
        test14(4, 14);
        test15("방탄", 3);

    }

    public static void test1(String hello){
        System.out.println(hello);
    }

    public static void test2(int a){
        System.out.println(a);
    }

    public static void test3(String str){
        System.out.println(str);
    }

    public static void test4(int a, int b){
        System.out.println("두 수의 합 : " + a + b);
    }

    public static void test5(int a, int b, int c){
        System.out.println("세 수의 곱 : " + a * b * c);
    }

    public static void test6(int a, int b){
        if (a > b){
            System.out.println("두 수의 몫 : " + a  / b);
            System.out.println("두 수의 나머지 : " + a  % b);
        } else {
            System.out.println(" ");
        }
    }

    public static void test7(String str, String str2){
        System.out.println(str + str2);
    }

    public static void test8(int a){
        System.out.println(a);
    }

    public static void test9(int a, int b){
        System.out.println("두 수의 합 : " + (a + b));
    }

    public static void test10(int a){
        if (a % 2 == 0){
            System.out.println("10번 문제의 수는 " + "짝수입니다.");
        }else {
            System.out.println("10번 문제의 수는 " + "홀수입니다.");
        }
    }

    public static void test11(int a, int b){
        if (a % 2 == 0 && b % 2 ==0){
            System.out.println("11번 두 수는 짝수야");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("11번 두 수는 홀수야");
        } else {
            System.out.println("11번 한 수만 짝수야");
        }
    }

    public static  void test12(int a){
        //0~입력받은 숫자까지 출력하는 메소드
        //입력받는 행위가 반복
        for (int i = 0; i < a + 1; i++){
            System.out.print(i);
        }
    }

    public static void test13(int a, int b){ //a = 10, b = 4 가정
        //큰 수, 작은 수 정하기
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        for (int i = min + 1; i < max; i++){
            System.out.println(i);
        }
    }

    public static void test14(int a, int b){
        //두 정수 중 큰 수, 작은 수 정하기
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int cnt = 0; //5의 배수 갯수 저장하는 창고

        for (int i = min + 1; i < max; i++){
            if (i % 5 == 0)
                cnt++;
        }
        System.out.println("14번 문제 5의 배수 갯수 : " + cnt + "개");
    }

    public static void test15(String str, int a){ // str = 방탄 a = 3 => 방탄방탄방탄
        //문자열을 숫자만큼 반복출력
        for (int i = 0; i < a; i++){
            System.out.print(str);
        }
    }
}
