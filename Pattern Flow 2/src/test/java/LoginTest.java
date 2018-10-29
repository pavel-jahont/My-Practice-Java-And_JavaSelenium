package Patterns.flow.src.test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InboxPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by student on 01.09.2016.
 */
public class LoginTest {

    private static final String DEFAULT_URL = "https://gmail.com";
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        InboxPage inboxPage = loginPage.setUsername("seleniumtests10").setPassword("060788avavav").signIn();

        Assert.assertTrue(inboxPage.isProfileLinkDisplayed(), "Profile link is not displayed!");
    }
}
