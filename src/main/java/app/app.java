package app;
import entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Coffee cappuccino = context.getBean(Cappuccino.class);
        System.out.println("Ingredients :"+cappuccino.getDescription());
        System.out.println("**********************");
        System.out.println("Price :"+cappuccino.getCost()+"$");
    }
}
