package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;

// 인터페이스 구현
@Slf4j
public class EspressoMachine implements CoffeeMachine {
    @Override
    public Coffee brew(Bean bean) {
        log.info("Bean : {}", bean);
        log.info("원두를 통해 커피를 만듭니다.");
        return new Coffee();
    }
}
