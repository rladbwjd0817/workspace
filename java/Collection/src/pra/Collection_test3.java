package pra;

import java.util.ArrayList;
import java.util.List;

public class Collection_test3 {
  public static void main(String[] args) {
    //이름을 저장하는 리스트를 만들어
    //리스트에 적당히 데이터를 저장해
    //저장된 이름 중 '홍길동'이라는 이름이 있다면 '해당 이름이 존재합니다.' 문구 출력

    List<String> name = new ArrayList<>();
    name.add("김도하");
    name.add("권슬아");
    name.add("김도훈");
    name.add("홍길동");
    name.add("송라미");

    for (int i = 0; i < name.size(); i++){
      if (name.get(i).equals("홍길동")){
        System.out.println("해당 이름이 존재합니다.");
      }
    }
  }
}
