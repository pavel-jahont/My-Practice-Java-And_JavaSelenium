package pages;

import core.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailRuMainPage extends BaseData {
    private static final By FIELD_NAME_OF_MAIL = By.xpath("//input[contains(@id,'mailbox__login')]");
    private static final By FIELD_PASSWORD = By.xpath("//*[contains(@id,'mailbox__password')]");
    private static final By BUTTON_ENTER = By.xpath("//input[contains(@id,'mailbox__auth__button')]");
    private static final String EMAIL = "pavel.romanov.news";
    private static final String PASSWORD = "Laboratory2018";


    public static void logInIntoMail() throws InterruptedException {
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(FIELD_NAME_OF_MAIL));
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(FIELD_NAME_OF_MAIL));
        driver.findElement(FIELD_NAME_OF_MAIL).click();
        driver.findElement(FIELD_NAME_OF_MAIL).sendKeys(EMAIL);
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(FIELD_PASSWORD));
        driver.findElement(FIELD_PASSWORD).click();
        driver.findElement(FIELD_PASSWORD).sendKeys(PASSWORD);
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(BUTTON_ENTER));
        driver.findElement(BUTTON_ENTER).click();
    }
}
