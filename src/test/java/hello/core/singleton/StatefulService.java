package hello.core.singleton;

public class StatefulService {
    //private int price; // 공유필드는 사용하지말자
    public int order(String name, int price){
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        //this.price = price; // 값을 넣는 행위 금지, 읽기만 하자
        return price; // 호출된 메소드 안에서 결과를 넘기자.
    }
    /*
    public int getPrice(){
        //return price; // 사용하지말자
    }*/
}
