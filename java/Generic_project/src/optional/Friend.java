package optional;

import javax.swing.*;
import java.util.Optional;

public class Friend {
  String name;
  Company company;

  public Friend(String name, Company company) {
    this.name = name;
    this.company = company;
  }

  public String getName() {
    return name;
  }

  public Company getCompany() {
    return company;
  }

  // 매개변수로 Friend 객체가 전달되면 주소 정보를 출력하는 기능
  public void printAddress(Friend friend){
    Optional<Friend> o = Optional.ofNullable(friend);
    String address = o.map((e) -> e.getCompany())
                      .map((e) -> e.getContact())
                      .map((e) -> e.getAddress())
                      .orElseGet(() -> "주소가 없음"); // 위의 map 중 하나라도 null이 있으면 orElseGet 함수가 실행
    System.out.println(address);

    /// //////////////////////////////////////////////////////////////////////////////////////////////////
    // null 체크
    String address2 = null;
    if (friend != null ){
      Company c = friend.getCompany();
      if (c != null){
        Contact contact = c.getContact();
        if (contact != null){
          address2 = contact.getAddress();

        }
      }
      if (address == null) System.out.println("주소 정보가 존재하지 않습니다.");
      else System.out.println(address);
    }




    // 안전성에 있어서 최악인 코드임
    //String address1 = friend.getCompany().getContact().getAddress();

  }
}

class Company {
  String compName;
  Contact contact;

  public Company(String compName, Contact contact){
    this.compName = compName;
    this.contact = contact;
  }

  public String getCompName(){
    return compName;
  }

  public Contact getContact(){
    return contact;
  }
}

class Contact{
  String phone;
  String address;

  public Contact(String phone, String address){
    this.phone = phone;
    this.address = address;
  }

  public String getPhone(){
    return phone;
  }

  public String getAddress(){
    return address;
  }
}
