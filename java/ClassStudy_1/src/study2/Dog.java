package study2;


class Animal{
  public void cry(){
    System.out.println("동물이 웁니다.");
  }
}

public class Dog extends Animal {
  public void cryDog(){
    System.out.println("강아지가 웁니다.");
  }
}

class Cat extends Animal{
  public void cryCat(){
    System.out.println("고양이가 웁니다.");
  }
}

class Cow extends  Animal{
  public void cryCow(){
    System.out.println("소가 웁니다.");
  }
}
