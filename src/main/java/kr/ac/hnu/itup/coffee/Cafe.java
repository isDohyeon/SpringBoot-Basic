package kr.ac.hnu.itup.coffee;

import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public class Cafe {
    private CoffeeMachine machine;
    // property : setter 메소드
    // 현업 - property : field 까지 포함
    @Setter
    private Barista barista;
    private List<Bean> beans = Arrays.asList(
            new Bean(),
            new Bean(),
            new Bean(),
            new Bean(),
            new Bean()
    );

    public Cafe(CoffeeMachine machine) {
        this.machine = machine;
    }

    public Coffee getOrder(int money, String menu) {
        Coffee coffee = machine.brew(beans.get(0));
        return coffee;
    }

}
