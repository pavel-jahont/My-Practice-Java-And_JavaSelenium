package Patterns.pageFactory.src.main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student on 01.09.2016.
 */
public class LoginPage {

    private final WebDriver driver;

    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "next")
    private WebElement nextButton;

    @FindBy(id = "Passwd")
    private WebElement passwordInput;

    @FindBy(id = "signIn")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public InboxPage login(String email, String password) {
        emailInput.sendKeys(email);
        nextButton.click();
        passwordInput.sendKeys(password);
        signInButton.click();

        //InboxPage inboxPage = new InboxPage(driver);
        //return inboxPage;
        return new InboxPage(driver);
    }
}
