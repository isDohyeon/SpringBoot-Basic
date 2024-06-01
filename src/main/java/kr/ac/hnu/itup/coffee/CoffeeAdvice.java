package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class CoffeeAdvice {
    // advice
    @Before("execution(* kr..*.brew(..))") // 뜻 알기
    public void grind() {
        log.info("원두를 갈아줍니다."); // proxy
    }

    @After("execution(* kr..*.brew(..))")
    public void putCoffeeInCup() {
        log.info("커피를 컵에 담아줍니다.");
    }
}
