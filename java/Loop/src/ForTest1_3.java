public class ForTest1_3 {
  public static void main(String[] args) {
    for(int i = 2; i < 11; i += 2){
      System.out.print(i + " ");
    }
    for(int i = 2; i < 11; i++){
      if (i % 2 == 0){
        System.out.println(i);
      }
    }
  }
}
