import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @DataProvider
    public Object[][] loginDataProvider() {
        return new Object[][] {
                new Object[] { "seleniumtests10", "060788avavav"},
                new Object[] { "seleniumtests30", "060788avavav"},
                new Object[] { "seleniumtests40", "060788avavav"}
        };
    }

    @Test(dataProvider = "loginDataProvider")
    public void loginToGmailTest(String username, String password) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://gmail.com");
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".gb_b.gb_R")).isDisplayed(), "Profile button is not displayed!");
        driver.quit();
    }
}
