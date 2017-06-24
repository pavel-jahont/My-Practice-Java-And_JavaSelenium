package helperClass;

import core.BaseData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static java.lang.Thread.sleep;

public class Waiters extends BaseData {
    public static void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").
                                toString().equals("complete");
                    }
                };
        try {
            sleep(1000);
            WebDriverWait wait = new WebDriverWait(BaseData.driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public static WebDriverWait getWaiter() {
        return new WebDriverWait(driver, 30);
    }

}
