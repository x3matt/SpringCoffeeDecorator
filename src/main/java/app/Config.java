package app;

import entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entities")
public class Config {

    @Bean
    public BlackCoffee getBlackCoffee(){
        return new BlackCoffee();
    }
    @Bean
    public Milk getMilk(BlackCoffee coffee){
        return new Milk(coffee);
    }
    @Bean
    public Sugar getSugar(Milk milk){
        return new Sugar(milk);
    }
    @Bean
    public Cappuccino getCappuccino(Sugar sugar){
        return new Cappuccino(sugar);
    }
}
