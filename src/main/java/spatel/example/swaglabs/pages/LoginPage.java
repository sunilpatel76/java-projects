package spatel.example.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import spatel.example.swaglabs.elements.LoginPageElements;
import spatel.example.swaglabs.helper.WebBrowser;

public class LoginPage extends BasePage implements LoginPageElements {


    public LoginPage(WebDriver driver) {
        webBrowser = new WebBrowser(driver);
    }

    public void inputUserCredential(String userName, String password) {
        webBrowser.webEdit(input_Username).sendKey(userName);
        webBrowser.webEdit(input_Password).sendKey(password);
    }

    public void clickLogin() {
        webBrowser.webButton(btn_Login).click();
    }

}
