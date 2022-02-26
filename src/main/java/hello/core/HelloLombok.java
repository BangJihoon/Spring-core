package hello.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(27);
        helloLombok.setName("Bang");

        System.out.println("helloLombok.name = " + helloLombok.name);
        System.out.println("helloLombok.age = " + helloLombok.age);
        System.out.println("helloLombok = " + helloLombok); //toString 까지 만들어줌
    }
}
