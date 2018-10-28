package pages;

import core.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailPage extends BaseData {
    private static final By BUTTON_WRITE_LETTER = By.xpath("//*[contains(@class,'b-toolbar__btn js-shortcut')]//span");
    private static final By FIELD_TO_WHOM = By.xpath("//span[contains(@class,'js-input compose__labels__input')]//following-sibling::textarea[1]");
    private static final By FIELD_TOPIC = By.xpath("//*[contains(@class,\"compose-head__cell\")]//input[contains(@class,\"b-input\")]");
    private static final By FIELD_MESSAGE = By.xpath("//*[contains(@class,'mceIframeContainer mceFirst mceLast')]//iframe");
    private static final By BUTTON_SEND = By.xpath("//*[contains(@class,'b-toolbar__btn b-toolbar__btn_ b-toolbar__btn_false js-shortcut')]");
    private static String toWhom = "test@mail.ru";
    private static String hello = "Hello";
    private static String message = "Hello World!!!! I'm here! ";



    public static void clickButtonWriteLetter(){
        wait30sec.until(ExpectedConditions.elementToBeClickable(BUTTON_WRITE_LETTER));
        driver.findElement(BUTTON_WRITE_LETTER).click();
    }
    public static void fillFieldsOfLetter(){
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(FIELD_TO_WHOM));
        driver.findElement(FIELD_TO_WHOM).click();
        driver.findElement(FIELD_TO_WHOM).sendKeys(toWhom);
        wait30sec.until(ExpectedConditions.presenceOfElementLocated(FIELD_TOPIC));
        driver.findElement(FIELD_TOPIC).click();
        driver.findElement(FIELD_TOPIC).sendKeys(hello);
        driver.findElement(FIELD_MESSAGE).click();
        driver.findElement(FIELD_MESSAGE).sendKeys(message);
        driver.findElement(BUTTON_SEND).click();
    }
}
