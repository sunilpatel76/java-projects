package spatel.example.swaglabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        dryRun = true,
        plugin = {"pretty", "html:target/cucumber.html"},
        features = "src/test/resources/features",
        glue = "spatel.example.swaglabs",
        tags = "@default"
)
public class CucumberTestRunner {
}
