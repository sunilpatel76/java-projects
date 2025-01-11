package spatel.example.swaglabs.elements;

import org.openqa.selenium.By;

public interface LoginPageElements {

    By input_Username = By.xpath("//*[@id='user-name']");
    By input_Password = By.xpath("//*[@id='password']");
    By btn_Login = By.xpath("//*[@id='login-button']");
}
