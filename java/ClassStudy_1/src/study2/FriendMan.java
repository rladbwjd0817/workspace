package study2;

public class FriendMan {
  public static void main(String[] args) {
    Friend[] fs = new Friend[10]; //다형성으로 인해 대학동창, 직장동료 다 같이 저장,
    int cnt = 0; //저장된 인맥 수

    fs[cnt++] = new UnivFriend("kkk", "유아교육", "0212");
    fs[cnt++] = new UnivFriend("yyy", "컴공", "0114");
    fs[cnt++] = new CompFriend("ddd", "human", "1112");
    fs[cnt++] = new CompFriend("vvv", "dev", "4444");


    for (int i = 0; i < cnt; i++){
      //다형성을 쓰면 부모클래스 메서드만 사용가능
      //오버라이딩하면 자기 것도 쓸 수 있기에 다형성이 있으면 오버라이딩 활용
      fs[i].showInfo();
    }



    //대학동창 5명을 저장할 수 있는 공간
//    UnivFriend[] ufs = new UnivFriend[5];
//    int ucnt = 0; //대학 동창 수
//
//
//    //직장동료 5명을 저장할 수 있는 공간
//    CompFriend[] cfs = new CompFriend[5];
//    int ccnt = 0; //직장 동료 수
//    ufs[ucnt++] = new UnivFriend("kkk", "유아교육", "0212");
//    ufs[ucnt++] = new UnivFriend("yyy", "컴공", "01114");
//
//    cfs[ccnt++] = new CompFriend("hhh", "human", "1112");
//    cfs[ccnt++] = new CompFriend("bbb", "dev", "4444");
//
//    for(int i = 0; i < ucnt; i++){
//      ufs[i].showUnivInfo();
//    }
//
//    for (int i = 0; i < ccnt; i++){
//      cfs[i].showCompInfo();
//    }

  }
}
