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

        Chef chef = restaurant.getChef();
        Ingredient ingredient = chef.prepare(); // prepare() 호출 -> 재료 손질하기 출력
        Food food = chef.cook(ingredient); // cook() 호출 -> Ingredient(name=김, price=500.0)를 사용하여 요리를 합니다! 출력
        log.info("\nfood : {}", food); // cook()안의 food 객체에 대한 로그 출력
        //log.info("\ncook : {}", cook);
    }
}
