package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component // 이걸 사용하려면 Spring에 Bean으로 등록해야함 Aspect는 Spring의 annotation이 아님 -> @Component 사용
// Bean과 Component 둘다 Bean으로 사용 가능한
// @Bean : 메서드에만 붙일 수 있음. 다른 사람이 만든 클래스, 내가 Component를 붙일 수 없을 때
// @Component : 이 클래스가 내가 만든 클래스일 때 붙일 수 있음 - 내 맘대로 붙일 수 있을 때
// -> Config 클래스가 필요 없음. annotation만 붙이면 됨
public class CalculatorAdvice {
    @Around("execution(* kr.ac.hnu.itup.aop.*.factorial(..))")
    // -> 리턴타입 패키지이름.클래스이름.메서드이름(매개변수)\
    // = * kr..*.factorial(..)
    public Object calculate(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();// 우리가 원하는 factorial()을 호출해줌, long타입
        long end = System.nanoTime();

        String className = joinPoint.getSignature().getDeclaringTypeName();
        log.info("{} 걸린 시간 : {}ns", className, end - start);
        return proceed;
    }
}
