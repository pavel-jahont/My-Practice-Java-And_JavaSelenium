package SeleniumJava.ActionsSelectSwitchTo.src.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownTest {

    @Test
    public void dropdownTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement optionsSelect = driver.findElement(By.cssSelector("select#dropdown"));
        Select select = new Select(optionsSelect);
        select.selectByIndex(1);

        Thread.sleep(5000);
        select.selectByVisibleText("Option 2");

        Thread.sleep(5000);
        select.selectByValue("1");
        Thread.sleep(10000);

        driver.quit();
    }
}
