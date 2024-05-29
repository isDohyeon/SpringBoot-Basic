package kr.ac.hnu.itup;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantConfig {
    @Bean
    public Restaurant restaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("백종원");
        restaurant.setAddress("대전광역시 동구");
        restaurant.setPhone("042-123-456");
        restaurant.setChef(chef());
        return restaurant;
    }

    @Bean
    public Chef chef() {
        Chef chef = new Chef();
        chef.setAge(57);
        chef.setName("박도현");
        return chef;
    }
}
