package spatel.example.swaglabs.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebBrowser {
    private static final Logger LOGGER = LogManager.getLogger(WebBrowser.class);
    private final WebDriver webDriver;
    private final Duration durationMaxSec = Duration.ofSeconds(15L);
    private WebElement webElement;

    public WebBrowser(WebDriver driver) {
        this.webDriver = driver;
    }

    public void invokeWebUrl(String url) {
        webDriver.get(url);
        LOGGER.info("Invoked application web url, {}", url);
    }

    public WebBrowser webEdit(By by) {
        try {
            webElement = (new WebDriverWait(webDriver, durationMaxSec))
                    .until(ExpectedConditions.elementToBeClickable(by));
            return this;
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void sendKey(String keys) {
        webElement.sendKeys(keys);
    }

    public WebBrowser webButton(By by) {
        try {
            webElement = (new WebDriverWait(webDriver, durationMaxSec))
                    .until(ExpectedConditions.elementToBeClickable(by));
            return this;
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void click() {
        webElement.click();
    }
}
