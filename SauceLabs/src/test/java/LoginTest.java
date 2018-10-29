package SauceLabs.src.test.java;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by student on 16.09.2016.
 */
public class LoginTest {

    public static final String USERNAME = "PavelJahont";
    public static final String ACCESS_KEY = "778b4389-7468-48fc-a898-43281dbd9ed6";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    @Test
    public void loginTest() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Linux");
        caps.setCapability("version", "45.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 10000;
        open("https://mail.ru");
        sleep(10000);
        $(By.id("mailbox__login")).sendKeys("seleniumtests10");
        $(By.id("mailbox__password")).sendKeys("060788avavav");
        $(By.id("mailbox__auth__button")).click();
    }
}
