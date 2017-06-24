package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class BaseData {
    protected static WebDriver driver;
    protected static WebDriverWait wait30 ;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.gmail.com/");
        wait30 = new WebDriverWait(driver, 30);
    }

    @AfterTest
     public void tearDown() {
       driver.quit();
    }
}

