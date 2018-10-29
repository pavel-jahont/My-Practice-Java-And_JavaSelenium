package Cucumber.src.test.java;import com.codeborne.selenide.Configuration;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginStepdefs {

    private LoginPage loginPage = new LoginPage();

    @Given("^I am on Mail.ru login page$")
    public void I_am_on_Mail_ru_login_page() throws Throwable {
        Configuration.timeout = 10000;
        open("https://mail.ru");
    }

    @When("^I enter \"([^\"]*)\" in username input$")
    public void I_enter_in_username_input(String username) {
        loginPage.setUsername(username);
    }

    @And("^I enter \"([^\"]*)\" in password input$")
    public void I_enter_in_password_input(String password) {
        loginPage.setPassword(password);
    }
}
