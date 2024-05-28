package kr.ac.hnu.itup;

import lombok.Data;

@Data
public class Chef {
    private String name;
    private int age;

    public Ingredient prepare() {
        System.out.println("재료 손질하기");
        return new Ingredient();
    }

    public Food cook() {
        System.out.println("요리를 한다");
        return new Food();
    }
}
