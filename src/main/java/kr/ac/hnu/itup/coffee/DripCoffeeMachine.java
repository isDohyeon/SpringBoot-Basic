package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;

// CoffeeMachine 인터페이스 구현
@Slf4j
public class DripCoffeeMachine implements CoffeeMachine {
    @Override
    public Coffee brew(Bean bean) {
        log.info("bean : {}", bean);
        log.info("원두를 가지고 에스프레소를 만듭니다");
        return new Coffee();
    }
}
