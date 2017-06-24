package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class BaseData {
    protected static WebDriver driver;
    protected WebDriverWait wait30;
    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait30 = new WebDriverWait(driver, 30);
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "test@testserver.com", "testtest" }};
    }
    @DataProvider(name = "Non-Authentication")
    public static Object[][] credentials2() {
        return new Object[][] { { "Non-existentUser@testserver.com", "Non-existentUser@testserver.com" },
                { "", "" } ,
                { "test@testserver.com", "" },
                { "", "test@testserver.com" }
        };
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
