package pages;

import core.BaseData;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static locators.Locators.get;

/**
 * Created by User on 16.03.17.
 */
public class InformatorSphereRuPage extends BaseData {
    private static final By FIELD_SEARCH = get("InformatorSphereRuPage.FieldSearch");
    private static final By FIELD_INPUT_EMPTY = get("InformatorSphereRuPage.FieldInputEmpty");
    private static final By FIELD_INPUT_DIRTY = get("InformatorSphereRuPage.FieldInputDirty");
    private static final By BOTTOM_ICON = get("InformatorSphereRuPage.BottomIcon");
    private static final By BUTTON_SEARCH = get("InformatorSphereRuPage.ButtonSearch");
    private static final By NUMBER_FIRST_PAGE_CURRENT = get("InformatorSphereRuPage.NumberFirstPageCurrent");
    private static final By LIST_NAMES_ELEMENTS = get("InformatorSphereRuPage.ListNamesElements");
    private static final By TOOLTIP = get("InformatorSphereRuPage.Tooltip");
    private static final By BUTTON_SPHERE_INFO = get("InformatorSphereRuPage.ButtonSphereInfo");

    private static final String NAME_OF_ORGANIZATION = "эдельвейс";
    private static final String SURNAME = "Андреев ";
    private static final String NAME = "Геннадий ";
    private static final String PATRONYC = "Валентинович";
    private static final String TAXPAYER_INDIFICATION_NUMBER = "7801392271";
    private static final String MAIN_STATE_REGISTER_NUMBER = "1057812752502";

    public static void clickFieldSearch() {
        wait30.until(ExpectedConditions.presenceOfElementLocated(BOTTOM_ICON));
        driver.findElement(FIELD_SEARCH).click();
    }

    public static void typeNameSurnamePatronymic() {
        wait30.until(ExpectedConditions.presenceOfElementLocated(BOTTOM_ICON));
        try{
            if(driver.findElement(FIELD_INPUT_EMPTY).isDisplayed()) {
                driver.findElement(FIELD_INPUT_EMPTY).sendKeys(SURNAME + NAME + PATRONYC);
        }
        }catch(NoSuchElementException e) {
            driver.findElement(FIELD_INPUT_DIRTY).clear();
            driver.findElement(FIELD_INPUT_DIRTY).sendKeys(SURNAME + NAME + PATRONYC);
        }
    }

    public static void typeNameOfOrganization() {
        wait30.until(ExpectedConditions.presenceOfElementLocated(BOTTOM_ICON));
        try {
            if (driver.findElement(FIELD_INPUT_EMPTY).isDisplayed()) {
                driver.findElement(FIELD_INPUT_EMPTY).sendKeys(NAME_OF_ORGANIZATION);
            }
        } catch(NoSuchElementException e) {
            driver.findElement(FIELD_INPUT_DIRTY).clear();
            driver.findElement(FIELD_INPUT_DIRTY).sendKeys(NAME_OF_ORGANIZATION);
        }
    }

    public static void typeTaxpayerIdentificationNumber(){
        wait30.until(ExpectedConditions.presenceOfElementLocated(BOTTOM_ICON));
        try{
            if(driver.findElement(FIELD_INPUT_EMPTY).isDisplayed()) {
                driver.findElement(FIELD_INPUT_EMPTY).sendKeys(TAXPAYER_INDIFICATION_NUMBER);
            }
            }catch(NoSuchElementException e) {
                driver.findElement(FIELD_INPUT_DIRTY).clear();
                driver.findElement(FIELD_INPUT_DIRTY).sendKeys(TAXPAYER_INDIFICATION_NUMBER);
            }
        }

    public static void typeMainStateRegisterNumber() {
        wait30.until(ExpectedConditions.presenceOfElementLocated(BOTTOM_ICON));
        try {
            if (driver.findElement(FIELD_INPUT_EMPTY).isDisplayed()) {
                driver.findElement(FIELD_INPUT_EMPTY).sendKeys(MAIN_STATE_REGISTER_NUMBER);
            }
        } catch (NoSuchElementException e) {
            driver.findElement(FIELD_INPUT_DIRTY).clear();
            driver.findElement(FIELD_INPUT_DIRTY).sendKeys(MAIN_STATE_REGISTER_NUMBER);
        }
    }

    public static void clickButtonSearch() {
        wait30.until(ExpectedConditions.presenceOfElementLocated(BUTTON_SEARCH));
        driver.findElement(BUTTON_SEARCH).click();
    }

    public static void checkAppearanceOfAtLeastOne(){
        try {
            wait30.until(ExpectedConditions.presenceOfElementLocated(NUMBER_FIRST_PAGE_CURRENT));
            driver.findElement(NUMBER_FIRST_PAGE_CURRENT).isDisplayed();
            System.out.println();
            System.out.println("Поиск дал результаты");
        } catch (NoSuchElementException e) {
            System.out.println();
            System.out.println("Поиск НЕ дал результов");
        }
    }

    public static boolean checkResultOfSearchByNameSurnamePatronymic() {
        List<WebElement> myElements = driver.findElements(LIST_NAMES_ELEMENTS);
        for (WebElement e : myElements) {
            String account = e.getText();
            if (account.contains(NAME) || account.contains(SURNAME) || account.contains(PATRONYC)) {
                System.out.println();
                System.out.println("Поиск по имени либо фамилии либо отчеству прошёл успешно");
                return true;
            }
        }
        return false;
    }

    public static boolean checkResultOfSearchByNameOfOrganization() {
        List<WebElement> myElements = driver.findElements(LIST_NAMES_ELEMENTS);
        for (WebElement e : myElements) {
            String account = e.getText();
            if (account.contains(NAME_OF_ORGANIZATION)) {
                System.out.println();
                System.out.println("Поиск по названию организации прошёл успешно");
                return true;
            }
        }
        return false;
    }

    public static boolean checkResultOfSearchByTaxpayerIdentificationNumber(){
        driver.findElement(By.xpath("//span[contains(text(),\"" + TAXPAYER_INDIFICATION_NUMBER + "\")]"));
        System.out.println();
        System.out.println("Поиск по ИНН организации прошёл успешно");
              return true;
    }

    public static boolean checkResultOfSearchByMainStateRegisterNumberNumber(){
        driver.findElement(By.xpath("//span[contains(text(),\"" + MAIN_STATE_REGISTER_NUMBER + "\")]"));
        System.out.println();
        System.out.println("Поиск по ОГРН организации прошёл успешно");
        return true;
    }

    public static void hoverMouseOnTheInputSearchField(){
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(FIELD_SEARCH);
        builder.moveToElement(element).build().perform();
    }

    public static boolean checkTooltipAppeareance() {
        try {
            wait30.until(ExpectedConditions.presenceOfElementLocated(TOOLTIP));
            driver.findElement(TOOLTIP).isDisplayed();
            System.out.println();
            System.out.println("Всплывающая подсказка появилась");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println();
            System.out.println("Элемент не обнаружен");
            return false;
        }
    }

    public static void clickOnTheButtonSphereInfo() throws InterruptedException {
        new WebDriverWait(driver, 180).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                return (Boolean) js.executeScript("return jQuery.active == 0");
            }
        });
        Thread.sleep(5000); // не получилось справиться с AJAX, применил запрещённый Thread.sleep
        driver.findElement(BUTTON_SPHERE_INFO).click();
    }
}



