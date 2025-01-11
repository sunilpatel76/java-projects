package spatel.example.swaglabs.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;
import spatel.example.swaglabs.exception.BrowserInitException;

@Component
public class DriverManager {
    private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();

    public void initializeWebDriver(String browser) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        LOGGER.info("invoked browser, with chrome options {}", options);

        WebDriver webDriver = new ChromeDriver(options);
        setDriver(webDriver);
    }

    public synchronized WebDriver getDriver() {
        if (THREAD_LOCAL.get() == null) {
            throw new BrowserInitException("browser not is not initialized, make sure add browser");
        }
        return THREAD_LOCAL.get();
    }

    public synchronized void setDriver(WebDriver driver) {
        THREAD_LOCAL.set(driver);
    }

    public synchronized void removeDriver() {
        if (THREAD_LOCAL.get() != null) {
            THREAD_LOCAL.get().quit();
            THREAD_LOCAL.remove();
        }
    }

    public void sayHello() {
        System.out.println("--------------->");
    }
}
