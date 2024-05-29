package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;


@Slf4j
@SpringBootApplication
//@ImportResource("classpath:root-context.xml")
public class ItupApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ItupApplication.class, args);
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("\n로그로 출력 - {}", restaurant);
        System.out.println("println으로 출력 - " + restaurant);
    }
}
