package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final By EMAIL_INPUT = By.id("Email");
    private static final By NEXT_BUTTON = By.id("next");
    private static final By PASSWORD_INPUT = By.id("Passwd");
    private static final By SIGN_IN_BUTTON = By.id("signIn");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage setUsername(String username) {
        driver.findElement(EMAIL_INPUT).sendKeys(username);
        driver.findElement(NEXT_BUTTON).click();
        return this;
    }

    public LoginPage setPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);

        return this;
    }

    public InboxPage signIn() {
        driver.findElement(SIGN_IN_BUTTON).click();
        return new InboxPage(driver);
    }

    //    public InboxPage login(String email, String password) {
//        driver.findElement(EMAIL_INPUT).sendKeys(email);
//        driver.findElement(NEXT_BUTTON).click();
//        driver.findElement(PASSWORD_INPUT).sendKeys(password);
//        driver.findElement(SIGN_IN_BUTTON).click();
//
//        //InboxPage inboxPage = new InboxPage(driver);
//        //return inboxPage;
//        return new InboxPage(driver);
//    }
}
