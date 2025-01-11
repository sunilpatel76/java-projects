package spatel.example.swaglabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "spatel.example.swaglabs")
public class SwaglabsApplication {

    public static void main(String[] args) {
        System.out.println("++ SpringBootApplication ++");
        SpringApplication.run(SwaglabsApplication.class, args);
    }
}
