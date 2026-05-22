package lambda;

// 자바에서 만들어준 함수형 인터페이스의 대표들
// 1. Predicate<T> : boolean test(T t);
// => 전달 인자를 근거로 참 또는 거짓 결과를 반환

// 2. Supplier<T> : T get();
// => 메서드 결과 데이터를 반환

// 3. Consumer<T> : void accept(T t);
// => 인자로 데이터를 받아가고 결과 데이터는 반환하지 않을 때

// 4. Function<T, R> : R apply(T t);
// => 매개변수와 리턴 데이터가 전부 있는 기능

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda2 {
  public static void main(String[] args) {
    // Function<T, R> : R apply(T t);
    // 문자열 데이터가 주어지면 해당 문자열의 길이를 리턴하는 기능
    Function<String, Integer> f = str -> str.length();
    System.out.println(f.apply("kjkyj"));


    List<Integer> list = Arrays.asList(1,2,3,4,5);

    // Consumer<? extends Integer> action
    // = Consumer<Integer> action
    Consumer<Integer> c = num -> System.out.println(num);
    list.forEach(c);

    // 리스트의 정수를 차례로 출력
    list.forEach(num -> System.out.println(num));

    System.out.println();
    System.out.println();

    // 짝수만 삭제하는 기능 구현
    list.removeIf(even -> even % 2 == 0);


    // 짝수의 합
//    int sum = 0;
//    for (int e : list){
//      if(e % 2 == 0){
//        sum = sum + e;
//      }
//    }
//    System.out.println(sum);
    printEvenSum(list);

    // boolean test(T t);
    Predicate<Integer> p1 = num -> num % 2 == 0;
    sum(list, p1);
    sum(list, num -> num % 2 == 0);

    // 홀수의 합
//    int sum1 = 0;
//    for (int e : list){
//      if(e % 2 == 1){
//        sum1 = sum1 + e;
//      }
//    }
//    System.out.println(sum1);

    Predicate<Integer> p2 = num -> num % 2 == 1;
    sum(list, p2);



  }

  // 내 입맛에 맞는 합을 리턴하는 메서드
  public static int sum(List<Integer> list, Predicate<Integer> p){
    int sum = 0;

    for(int e : list){
      if(p.test(e)){
        // 조건에 맞는 e를 더해줄거임
        sum = sum + e;

      }
    }

    return sum;
  }



  public static void printEvenSum(List<Integer> list){
    int sum = 0;
    for (int e : list){
      if(e % 2 == 0){
        sum = sum + e;
      }
    }
    System.out.println(sum);
  }

}
