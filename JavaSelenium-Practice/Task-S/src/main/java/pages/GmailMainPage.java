package pages;

import core.BaseData;
import helperClass.NewParser;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static locators.Locators.get;

/**
 * Created by User on 11/11/2016.
 */
public class GmailMainPage extends BaseData{

    private static final String[] USER_DATA_CSV = NewParser.getDataFrom(NewParser.Parsers.csv);
    private static final String FIRST_USER_LOGIN_CSV = USER_DATA_CSV[0];
    private static final String FIRST_USER_PASSWORD_CSV = USER_DATA_CSV[1];

    private static final By FIELD_EMALL_MAIN_PAGE = get("GmailMainPage.FieldEmailMainPage");
    private static final By BUTTON_NEXT_MAIN_PAGE = get("GmailMainPage.ButtonNextMainPage");
    private static final By FIELD_PASSWORD_MAIN_PAGE = get("GmailMainPage.FieldPasswordMainPage");
    private static final By BUTTON_INPUT_MAIN_PAGE = get("GmailMainPage.ButtonInputMainPage");


    public static void fillFieldMail(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.presenceOfElementLocated(FIELD_EMALL_MAIN_PAGE));
        driver.findElement(FIELD_EMALL_MAIN_PAGE).click();
        driver.findElement(FIELD_EMALL_MAIN_PAGE).clear();
        driver.findElement(FIELD_EMALL_MAIN_PAGE).sendKeys(FIRST_USER_LOGIN_CSV);
    }
    public static void clickButtonNext(){
        driver.findElement(BUTTON_NEXT_MAIN_PAGE).click();
    }

    public static void fillFieldPassword(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.presenceOfElementLocated(FIELD_PASSWORD_MAIN_PAGE));
        driver.findElement(FIELD_PASSWORD_MAIN_PAGE).click();
        driver.findElement(FIELD_PASSWORD_MAIN_PAGE).clear();
        driver.findElement(FIELD_PASSWORD_MAIN_PAGE).sendKeys(FIRST_USER_PASSWORD_CSV);
    }

    public static void clickButtonInput(){
        driver.findElement(BUTTON_INPUT_MAIN_PAGE).click();
    }

}
