package kr.ac.hnu.itup.coffee;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Bean을 생성하는 곳
@Configuration
public class CoffeeConfig {
    @Bean
    public Barista barista() {
        return new Barista();
        // <bean id="barista" class="kr.ac.hnu.itup.coffee.Barista"/> 와 같다.
    }
    // 반환되는 타입보다 상위 타입을 리턴한다고 선언하는 것 : 리스코프의 치환법칙, 객체지향의 원리 : 다형성
    @Bean
    public CoffeeMachine drip() { // CoffeeMachine이 DripCoffeeMachine보다 상위 타입
        return new DripCoffeeMachine();
        // <bean id="drip" class="kr.ac.hnu.itup.coffee.DripCoffeeMachine"/> 와 같다
    }
    @Bean
    public CoffeeMachine espresso() { // CoffeeMachine이 EspressoMachine보다 상위 타입
        return new EspressoMachine();
        // <bean id="espresso" class="kr.ac.hnu.itup.coffee.EspressoMachine"/> 와 같다.
    }
    @Bean
    public Cafe cafe() {

        Cafe cafe = new Cafe(drip());
        cafe.setBarista(barista());
        return cafe;
    }

    @Bean
    public CoffeeAdvice coffeeAdvice() {
        return new CoffeeAdvice();
    }
}
