//계산기 설계도
public class Calculator {
    int num1; //첫 번째 수
    int num2; //두 번째 수
    String oper; //연산자

    public void setAllData(int num11, int num22, String oper1){
        num1 = num11;
        num2 = num22;
        oper = oper1;
    }

//    public int addi(int num11, int num22){
//         return num11 + num22;
//    }
//
//    public int subtract(int num11, int num22){
//        return num11 - num22;
//    }
//
//    public int multiply(int num11, int num22){
//        return num11 * num22;
//    }
//
//    public int division(int num11, int num22){
//        return num11 / num22;
//    }


    public void printAllData(){
        System.out.println("-결과-");
        System.out.println("첫 번째 수 : " + num1);
        System.out.println("두 번째 수 : " + num2);
        System.out.println("연산자 : " + oper);
        if (oper.equals("+")){
//            return num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (oper.equals("-")) {
//            return num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (oper.equals("*")) {
//            return num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
//            return num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

    }
}
