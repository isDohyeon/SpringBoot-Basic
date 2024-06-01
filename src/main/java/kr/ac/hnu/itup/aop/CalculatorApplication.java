package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication // 이게 붙으면 얘는 모든걸 자동으로 만들어줌
public class CalculatorApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);

        Calculator calculator = context.getBean("forLoop", Calculator.class);
        long factorial = calculator.factorial(20);
        log.info("for loop : {}", factorial);

        calculator = context.getBean("recursiveFunction", Calculator.class);
        factorial = calculator.factorial(20);
        log.info("recursive : {}", factorial);
    }
}
