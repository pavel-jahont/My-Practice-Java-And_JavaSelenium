package pages;

import core.BaseData;
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
public class TutByMainPage extends BaseData {

    private static final String value = "automated_testing";
    private static final String position = "Minsk Automated Testing Community";
    private static final By FIELD_SEARCH_MAIN_PAGE = get("TutByMainPage.FieldSearchMainPage");
    private static final By BUTTON_SEARCH_MAIN_PAGE = get("TutByMainPage.ButtonSearchMainPage");
    private static final By LIST_WEBELEMENT_MAIN_PAGE = get("TutByMainPage.ListWebElementMainPage");
    private static final By COPYRIGHT_SIGN_MAIN_PAGE = get("TutByMainPage.CopyrightSignMainPage");




    public static void clickFieldSearchAndTypeValue(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.presenceOfElementLocated(FIELD_SEARCH_MAIN_PAGE));
        driver.findElement(FIELD_SEARCH_MAIN_PAGE).click();
        driver.findElement(FIELD_SEARCH_MAIN_PAGE).sendKeys(value);
    }

    public static void clickButtonSearch(){
        driver.findElement(BUTTON_SEARCH_MAIN_PAGE).click();
    }

    public static void findPosition(){
        Assert.assertFalse(verifyListContainsValue(position));
    }


    public static boolean verifyListContainsValue(String name){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.presenceOfElementLocated(COPYRIGHT_SIGN_MAIN_PAGE));
        java.util.List<WebElement> elements = driver.findElements(LIST_WEBELEMENT_MAIN_PAGE);
        for (WebElement e : elements) {
            String account = e.getText();
            if(account.contains(name)) {
                e.click();
                return true;
            }
        }
        System.out.println();
        System.out.println("Количество ссылок на странице, содержащих \"" + position + "\" равно: " + elements.size());
        return false;
    }


}
