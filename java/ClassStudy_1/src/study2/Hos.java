package study2;

public class Hos {
  public static void main(String[] args) {
    Animal[] cage = new Animal[5];

    cage[0] = new Dog();
    cage[1] = new Cat();
    cage[2] = new Cow();
    cage[3] = new Cow();
    cage[4] = new Cat();

    //cage[0]는 animal로 인식하고 있어서 메서드 cry만 가능함.

    for(int i = 0; i < cage.length; i++){
      System.out.println();
    }










    Dog[] dogCage = new Dog[5];
    Cat[] catCage = new Cat[5];
    Cow[] cowCage = new Cow[5];

    //오른쪽이 찐 만들고 d에 저장
//    Dog d = new Dog();

    dogCage[0] = new Dog();
    dogCage[1] = new Dog();

    catCage[0] = new Cat();
    catCage[1] = new Cat();

    cowCage[0] = new Cow();
    cowCage[1] = new Cow();

    dogCage[0].cryDog();
    catCage[0].cryCat();
    cowCage[0].cryCow();



  }
}
