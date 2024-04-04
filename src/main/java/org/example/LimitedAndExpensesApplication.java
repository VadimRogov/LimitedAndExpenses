package org.example;
import org.example.webClientes.CourseWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LimitedAndExpensesApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LimitedAndExpensesApplication.class, args);
        CourseWebClient courseWebClient = context.getBean(CourseWebClient.class);
        System.out.println(courseWebClient.getValute().block());


        // SpringApplication.run(LimitedAndExpensesApplication.class, args);
    }
}
