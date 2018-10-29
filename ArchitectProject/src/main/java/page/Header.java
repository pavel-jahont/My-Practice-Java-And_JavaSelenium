package ArchitectProject.src.main.java.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    private static final By LOGIN_BUTTON = By.className("auth-bar__item--text");
    private static final By EXIT_LINK = By.cssSelector("a.exit");

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {

    }

    public WebElement getExitLink() {
        return driver.findElement(EXIT_LINK);
    }

    public LoginPage clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return new LoginPage(driver);
    }
}
