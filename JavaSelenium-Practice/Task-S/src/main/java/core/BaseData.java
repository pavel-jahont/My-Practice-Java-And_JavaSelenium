package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseData {
    protected static WebDriver driver;

    @BeforeTest
    public void setUp(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");  // из recources поместить в путь
        driver = new ChromeDriver();
        System.setProperty("webdriver.ie.driver", "C:\\Program Files\\IEDriverServer.exe");    // из recources поместить в путь
        driver = new InternetExplorerDriver();*/
    }

    @AfterTest
   public void tearDown() {
        driver.quit();
    }

    protected static void setUpInStack() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeTest
    protected static void tearDownInStack(){
        driver.quit();
    }


    protected static void driverGetUrlTutBy(){
        driver.get("http://www.tut.by/");
    }

    protected static void driverGetUrlGmailCom(){
        driver.get("http://www.gmail.com/");
    }

    protected static void driverGetDeltaCom(){
        driver.get("https://www.delta.com/");
    }

}

