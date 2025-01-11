package spatel.example.swaglabs.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spatel.example.swaglabs.driver.DriverManager;
import spatel.example.swaglabs.helper.WebBrowser;

public abstract class BasePage {

    public static final Logger LOGGER = LogManager.getLogger(BasePage.class);

    protected WebBrowser webBrowser;

    public void invokeApplication(String url) {
        webBrowser.invokeWebUrl(url);
    }



}
