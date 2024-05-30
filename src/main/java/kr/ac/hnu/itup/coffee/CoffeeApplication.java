package kr.ac.hnu.itup.coffee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@Slf4j
// 어노테이션으로 실행
@SpringBootApplication
//@ImportResource("classpath:coffee-context.xml") -> Xml 방식
public class CoffeeApplication {
    public static void main(String[] args) {
        // Xml 가져오기
        ApplicationContext context = SpringApplication.run(CoffeeApplication.class, args);
        Cafe cafe = context.getBean("cafe", Cafe.class);
        Coffee iceAmericano = cafe.getOrder(5000, "아이스 아메리카노");
        System.out.println(iceAmericano + "를 마신다.");
        log.info("마시는 커피 : {}", iceAmericano);
    }
}
