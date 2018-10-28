package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseData {
    protected static WebDriver driver;
    protected static WebDriverWait wait30sec;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait30sec = new WebDriverWait(driver, 30);
        driver.get("http://www.mail.ru/");
    }

    @AfterTest
   public void tearDown() {
        driver.quit();
    }
}

