package Patterns.pageFactory.src.main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student on 01.09.2016.
 */
public class InboxPage {

    private final WebDriver driver;

    @FindBy(css = ".gb_b.gb_R0")
    private WebElement profileLink;

    public InboxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isProfileLinkDisplayed() {
        WebElement profileLink = null;
        try {
            profileLink = driver.findElement(By.cssSelector(".gb_b.gb_R0"));
        } catch (NoSuchElementException ex) {
            return false;
        }
        return profileLink.isDisplayed();
    }
}
