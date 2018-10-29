package Cucumber.src.main.java.page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final By USERNAME_INPUT = By.id("mailbox__login");
    private static final By PASSWORD_INPUT = By.id("mailbox__password");
    private static final By LOGIN_BUTTON = By.id("mailbox__auth__button");

    public void setUsername(String username) {
        $(USERNAME_INPUT).val(username);
    }

    public void setPassword(String password) {
        $(PASSWORD_INPUT).val(password);
    }

    public void clickLogin() {
        $(LOGIN_BUTTON).click();
    }
}
