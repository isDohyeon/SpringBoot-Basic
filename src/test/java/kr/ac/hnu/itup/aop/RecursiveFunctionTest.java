package kr.ac.hnu.itup.aop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


class RecursiveFunctionTest {
    // Test에 Lombok을 못쓰는 이유 - build.gradle 파일에 compileOnly랑 annotationProcess로만 설정해두었기 때문
    private static final Logger log = (Logger) LoggerFactory.getLogger(RecursiveFunctionTest.class);

    @Test
    void factorial() {
        RecursiveFunction func = new RecursiveFunction();
        long test = func.factorial(5);
        log.info("재귀함수 테스트 : {}", test);
    }
}