package spatel.example.swaglabs;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = SwaglabsApplication.class)
@CucumberContextConfiguration
public class SwaglabsApplicationTests {
    @Test
    void springBootTest() {
        System.out.println("++SpringBootTest++");

    }
}
