package Patterns.PO.src.main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by student on 01.09.2016.
 */
public class InboxPage {

    private static final By PROFILE_LINK = By.cssSelector(".gb_b.gb_R00");

    private final WebDriver driver;

    public InboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProfileLinkDisplayed() {
        WebElement profileLink = null;
        try {
            profileLink = driver.findElement(PROFILE_LINK);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return profileLink.isDisplayed();
    }
}
