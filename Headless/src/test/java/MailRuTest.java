package Headless.src.test.java;import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MailRuTest {

    @Test
    public void t() throws IOException {
        WebDriver driver = new HtmlUnitDriver(true);
//        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.ru");
//        TakesScreenshot screen = (TakesScreenshot) driver;
//        File f = screen.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(f, new File("d:\\f.png"));

        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
