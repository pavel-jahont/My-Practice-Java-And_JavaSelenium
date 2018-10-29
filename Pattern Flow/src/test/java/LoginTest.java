import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InboxPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

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
        //пароль неверный
        InboxPage inboxPage = loginPage.setUsername("pavel.jahont").setPassword("abcdEf").signIn();

        Assert.assertTrue(inboxPage.isProfileLinkDisplayed(), "Profile link is not displayed!");
    }
}
