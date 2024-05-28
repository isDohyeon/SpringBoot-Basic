package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class RestaurantApplication {
    public static void main(String[] args) {
        // 메모리 상에 레스토랑을 올림
        // 단축키 option + enter : 현재 상황에서 문맥적으로 필요한 동작 지원
        // 단축키 control + space : 자동완성 추천
        //Restaurant restaurant = new Restaurant();

        Chef chef = new Chef();
        //restaurant.setChef(chef); // setChef(new Chef()) 셰프를 주입한 것 = 레스토랑은 Chef 를 의존한다. -> 의존성 주입
        chef.setName("백종원");
        chef.setAge(57);
        // 로그를 보고 싶을 때는 System.out.println 사용하면 안됨.
        // log4j와 같은 라이브러리를 사용해서 로그를 찍어야함
        // log 의 5가지 레벨
        // trace, debug, info, warning, error
        // System.out.println("println 으로 출력 : " + restaurant);

        // 방법 1. -> 객체로 구현 Restaurant restaurant = new Restaurant();
        //        restaurant.setName("Miso restaurant");
        //        restaurant.setAddress("대전광역시 동구");
        //        restaurant.setPhone("042-123-4567");
        // 방법 2. -> 스프링 빈에서 가져옴 getbin -> Object를 반환
        // ApplicationContext 가 부모의 개념 -> ClassPathXmlApplicationContext 가 구현하고자 하는 인터페이스 (주로)
        ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // 다형성을 활용

        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("로그로 출력 : restaurant {}", restaurant); // 중괄호 안에 뒤에있는 데이터를 쓴다
    }
}
