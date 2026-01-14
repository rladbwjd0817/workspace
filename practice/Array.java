public class Array {
    public static void main(String[] args) {
        //1~8까지 배열 선언 및 초기화
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //짝수 갯수 저장할 창고
        int cnt = 0;

        for (int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                cnt++;
            }
            System.out.println(arr[i]);
        }
        System.out.println("짝수의 갯수 : " + cnt);
    }
}
