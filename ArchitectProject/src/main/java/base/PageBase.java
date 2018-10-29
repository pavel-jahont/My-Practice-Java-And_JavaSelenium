package ArchitectProject.src.main.java.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.Header;
import page.LoginPage;

import java.util.List;

public abstract class PageBase implements IPage {

    protected WebDriver driver;
    protected Header header;

    public void headerLogout() {
        header.logout();
    }

    public LoginPage clickLogin() {
        return header.clickLogin();
    }

    public boolean isUserLoggedIn() {
        return header.getExitLink().isDisplayed();
    }

    protected void waitExpectedElements(List<By> elements) {
        //wait for elements
    }
}
