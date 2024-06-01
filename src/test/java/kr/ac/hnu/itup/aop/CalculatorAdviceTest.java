package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class CalculatorAdviceTest {
    @Around("execution(* kr.ac.hnu.itup.aop.*.factorial(..))")
    // -> 리턴타입 패키지이름.클래스이름.메서드이름(매개변수)\
    // = * kr..*.factorial(..)
    public Object calculate(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();// 우리가 원하는 factorial()을 호출해줌, long타입
        long end = System.currentTimeMillis();
        log.info("걸린 시간 : {}", end - start);
        return proceed;

}   }