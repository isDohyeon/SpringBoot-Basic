package kr.ac.hnu.itup.cafe;

import lombok.Data;

@Data
public class Chef {
    private String name;
    private int age;

    public Ingredient prepare() {
        System.out.println("재료 손질하기");

        Ingredient ingredient = new Ingredient();
        ingredient.setName("김");
        ingredient.setPrice(500);
        return ingredient;
    }

    public Food cook(Ingredient ingredient) {
        System.out.println(ingredient + "를 사용하여 요리를 합니다!");

        Food food = new Food();
        food.setName("김밥");
        food.setPrice(5000);
        return food;
    }
}
