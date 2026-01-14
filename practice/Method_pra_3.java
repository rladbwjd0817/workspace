public class Method_pra_3 {
    public static void main(String[] args) {
        gugudan(3);
        test3_2(4);
    }

    public static int gugudan(int a){
        int mul = 0;
        System.out.println("=== "+ a + "단 ===");
        for (int i = 1; i < 10; i++){
            mul = a * i;
            System.out.println(a + " * " + i + " = " + a * i);
        }
        return mul;
    }

    public static void test3_2(int a){
        //1~100까지 수를 저장해 - i
        //a라는 수의 배수를 출력해  a = 2; 라고 가정
        for (int i = 1; i < 101; i++){
            if (i % a == 0){
                System.out.println(i);
            }
        }
    }

    public static int test3_3(int a){
        a = (int) Math.random();
        for (){

        }
    }





}
