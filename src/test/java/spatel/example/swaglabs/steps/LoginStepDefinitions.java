package spatel.example.swaglabs.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import spatel.example.swaglabs.driver.DriverManager;
import spatel.example.swaglabs.pages.LoginPage;

public class LoginStepDefinitions extends CommonStepsUtils {
    private static final Logger LOGGER = LogManager.getLogger(LoginStepDefinitions.class);
    private final LoginPage loginPage;

    @Autowired
    public LoginStepDefinitions(DriverManager driverManager){
        loginPage = new LoginPage(driverManager.getDriver());
        LOGGER.info("+++LoginStepDefinitions+++");
    }

    @Given("user invoke {string} browser with url {string}")
    public void invokeApplication(String browser, String url) {
        loginPage.invokeApplication(url);
    }
    @Then("application should display login screen")
    public void verifyLoginScreen() {

    }
    @When("user input user name {string} and password {string}")
    public void inputUserCredential(String username, String password) {
        loginPage.inputUserCredential(username, password);
    }
    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }
    @Then("application should display {string} page")
    public void verifyProductPage(String title) {

    }
}
