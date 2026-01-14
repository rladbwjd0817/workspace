//Student 설계도

public class Student {
    String name;
    int age;
    String address;
    int idNumber;
    String call;

    public void setAllData(String name1, int age1, String address1, int idNumber1, String call1){
        name = name1;
        age = age1;
        address = address1;
        idNumber = idNumber1;
        call = call1;
    }

    public String setName(String name1){
        name1 = "";
        return name1;
    }

    public int setAge(int age1){
        age1 = 0;
        return age1;
    }

    public String getAddress(String address1){
        address1 = "";
        return address1;
    }

    public int getIdNumber(int idNumber1){
        idNumber1 = 0;
        return idNumber1;
    }

    public String getCall(String call1){
        call1 = "";
        return call1;
    }

    public void printAllData(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("학번 : " + idNumber);
        System.out.println("전화번호 : " + call);
        System.out.println("============================");
    }


}
