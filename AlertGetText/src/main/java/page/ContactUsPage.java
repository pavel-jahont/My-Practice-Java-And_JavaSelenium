package AlertGetText.src.main.java.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private static final By ERROR_MESSAGE_CONTAINER = By.cssSelector(".alert li");
    private static final By SUCCESS_MESSAGE_CONTAINER = By.cssSelector("p.alert");

    private final WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getErrorMessageText() {
        return driver.findElement(ERROR_MESSAGE_CONTAINER).getText();
    }

    public String getSuccessMessageText() {
        return driver.findElement(SUCCESS_MESSAGE_CONTAINER).getText();
    }
}
