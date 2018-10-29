import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import org.testng.annotations.Listeners;
import helperClasses.Listener;
import core.BaseData;

@Listeners(Listener.class)

public class Test_1 extends BaseData {
    private static final By FIELD_LOGIN = By.id("login");
    private static final By FIELD_PASS = By.id("pass");
    private static final By BUTTON_ENTER = By.xpath("//*[@type='submit']");
    private static final By TITLE_ON_THE_PAGE = By.xpath("//h1[contains(text(),'test1@testserver.com')]");
    private static final By TITLE_ENTER = By.xpath("//*[@class='form-signin-heading']");


    @Test(dataProvider = "Authentication")      @TestCaseId(" ID_0001 ")      @Stories("Positive tests")
    public void testPositive(String Username, String Password) {

        driver.get("http://testpage1.denga.pro");
        driver.findElement(FIELD_LOGIN).sendKeys(Username);
        driver.findElement(FIELD_PASS).sendKeys(Password);
        driver.findElement(BUTTON_ENTER).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_ON_THE_PAGE));
        WebElement element = driver.findElement(TITLE_ON_THE_PAGE);
        Assert.assertTrue(element.isDisplayed());
    }

    @Test(dataProvider = "Non-Authentication")      @TestCaseId(" ID_0002 ")      @Stories("Negative tests")
    public void testNegative(String Username, String Password) {
        driver.get("http://testpage1.denga.pro");
        driver.findElement(FIELD_LOGIN).sendKeys(Username);
        driver.findElement(FIELD_PASS).sendKeys(Password);
        driver.findElement(BUTTON_ENTER).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_ENTER));
        WebElement element = driver.findElement(TITLE_ENTER);
        Assert.assertTrue(element.isDisplayed());
    }
}
