package SeleniumJava.ActionsSelectSwitchTo.src.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FrameTest {

    @Test
    public void frameTest() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("http://the-internet.herokuapp.com/iframe");
        WebElement editorContainer = driver.findElement(By.id("mceu_13"));
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
//        driver.switchTo().activeElement();
        driver.findElement(By.tagName("p")).click();

        Actions actions = new Actions(driver);
        actions.sendKeys("Hello world").build().perform();
        driver.switchTo().defaultContent();
        Assert.assertTrue(editorContainer.isDisplayed(), "Editor is not visible!");

        driver.quit();
    }
}
