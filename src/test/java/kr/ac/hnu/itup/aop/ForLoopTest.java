package kr.ac.hnu.itup.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ForLoopTest {

    @Test
    void factorial() {
        ForLoop test = new ForLoop();
        long func = test.factorial(5);
        log.info("ForLoop 테스트 : {}", func);
    }
}