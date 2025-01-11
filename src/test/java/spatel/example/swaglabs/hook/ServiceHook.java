package spatel.example.swaglabs.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import spatel.example.swaglabs.driver.DriverManager;

public class ServiceHook {
    private static final Logger LOGGER = LogManager.getLogger(ServiceHook.class);
    private final DriverManager applicationDriver;

    @Value("${application.browser}")
    String applicationBrowser;

    @Autowired
    private ServiceHook(DriverManager applicationDriver) {
        this.applicationDriver = applicationDriver;
        LOGGER.info("++ ServiceHook private constructor ++");
    }

    @Before
    public void initializeWebDriver() {
        applicationDriver.initializeWebDriver(applicationBrowser);
        LOGGER.info("Initialize web driver, using browser-> {}", applicationBrowser);
    }

    @After
    public void removeWebDriver() {
        applicationDriver.removeDriver();
    }
}
