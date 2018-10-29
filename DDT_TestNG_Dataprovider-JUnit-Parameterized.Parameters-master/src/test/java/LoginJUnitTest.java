import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class LoginJUnitTest {

    private String username;
    private String password;

    public LoginJUnitTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tt() {
        return Arrays.asList(new Object[][] {
                new Object[] { "seleniumtests10", "060788avavav"},
                new Object[] { "seleniumtests30", "060788avavav"},
                new Object[] { "seleniumtests40", "060788avavav"}
        });
    }

    @org.junit.Test
    public void loginToGmailTest() {
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://gmail.com");
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys(password);
        driver.findElement(By.id("signIn")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".gb_b.gb_R")).isDisplayed());
        driver.quit();
    }
}
