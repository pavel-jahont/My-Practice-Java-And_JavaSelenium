package Grid.src.test.java;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by student on 13.09.2016.
 */
public class MailRuTest {

    private WebDriver driver;

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void titleTest() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://172.18.5.105:4444/wd/hub"), caps);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru");

        Assert.assertEquals(driver.getTitle(), "Mail.Ru: �����, ����� � ���������, �������, ����");
    }
}
