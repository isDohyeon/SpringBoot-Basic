package kr.ac.hnu.itup.aop;

import org.springframework.stereotype.Component;

@Component
public class ForLoop implements Calculator {
    @Override
    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
