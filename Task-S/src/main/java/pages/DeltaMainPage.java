package pages;

import core.BaseData;
import helperClass.DateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static locators.Locators.get;

/**
 * Created by User on 11/12/2016.
 */
public class DeltaMainPage extends BaseData {

    private static final By TAB_CHECK_IN_DELTA_MAIN_PAGE = get("DeltaMainPage.TabCheckInDeltaMainPage");
    private static final By TAB_BOOK_A_TRIP_DELTA_MAIN_PAGE = get("DeltaMainPage.TabBookATripDeltaMainPage");
    private static final By ELEMENT_IN_BOTTOM_OF_THE_DELTA_MAIN_PAGE = get("DeltaMainPage.ElementInBottomOfTheDeltaMainPage");
    private static final By TAB_FLIGHT_DELTA_MAIN_PAGE = get("DeltaMainPage.TabFlightDeltaMainPage");
    private static final By FIELD_FROM_LOCATION_DELTA_MAIN_PAGE = get("DeltaMainPage.FieldFromLocationDeltaMainPage");
    private static final By FIELD_TO_LOCATION_DELTA_MAIN_PAGE = get("DeltaMainPage.FieldToLocationDeltaMainPage");
    private static final By FIELD_DEPARTURE_DATE_DELTA_MAIN_PAGE = get("DeltaMainPage.FieldDepatureDateDeltaMainPage");
    private static final By FIELD_RETURN_DATE_DELTA_MAIN_PAGE = get("DeltaMainPage.FieldReturnDateDeltaMainPage");
    private static final By BUTTON_MONEY_DELTA_MAIN_PAGE = get("DeltaMainPage.ButtonMoneyDeltaMainPage");
    private static final By BUTTON_FIND_FLIGHTS_DELTA_MAIN_PAGE = get("DeltaMainPage.ButtonFindFlightsDeltaMainPage");
    private static final By LINK_CITY_BARCELONA_TAB_TO_LOCATION_DELTA_MAIN_PAGE = get("DeltaMainPage.LinkCityBarcelonaTabToLocationDeltaMainPage");
    private static final By LINK_CITY_BOSTON_TAB_TO_LOCATION_DELTA_MAIN_PAGE = get("DeltaMainPage.LinkCityBostonTabFromLocationDeltaMainPage");

    private static final String BARCELONA = "BAR";
    private static final String BOSTON = "BOS";
    private static final int THE_NUMBER_OF_TODAYS_DATE = DateHelper.getMy_value_day();
    private static final int THE_NUMBER_OF_TODAYS_DATE_PLUS_FIVE = (THE_NUMBER_OF_TODAYS_DATE + 5);

    public static void clickTabCheckIn() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT_IN_BOTTOM_OF_THE_DELTA_MAIN_PAGE));
        driver.findElement(TAB_CHECK_IN_DELTA_MAIN_PAGE).click();
    }

    public static void clickTabBookATrip(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(ELEMENT_IN_BOTTOM_OF_THE_DELTA_MAIN_PAGE));
        driver.findElement(TAB_BOOK_A_TRIP_DELTA_MAIN_PAGE).click();
    }

    public static void clickTabFlight(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(TAB_FLIGHT_DELTA_MAIN_PAGE));
        driver.findElement(TAB_FLIGHT_DELTA_MAIN_PAGE).click();
    }

    public static void fillFieldFrom(){
        WebDriverWait wait60 = new WebDriverWait(driver, 60);
        wait60.until(ExpectedConditions.elementToBeClickable(FIELD_FROM_LOCATION_DELTA_MAIN_PAGE));
        driver.findElement(FIELD_FROM_LOCATION_DELTA_MAIN_PAGE).click();
        driver.findElement(FIELD_FROM_LOCATION_DELTA_MAIN_PAGE).sendKeys(BOSTON);
        wait60.until(ExpectedConditions.elementToBeClickable(LINK_CITY_BOSTON_TAB_TO_LOCATION_DELTA_MAIN_PAGE));
        driver.findElement(LINK_CITY_BOSTON_TAB_TO_LOCATION_DELTA_MAIN_PAGE).click();
    }

    public static void fillFieldTo(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(FIELD_TO_LOCATION_DELTA_MAIN_PAGE));
        driver.findElement(FIELD_TO_LOCATION_DELTA_MAIN_PAGE).click();
        driver.findElement(FIELD_TO_LOCATION_DELTA_MAIN_PAGE).clear();
        driver.findElement(FIELD_TO_LOCATION_DELTA_MAIN_PAGE).sendKeys(BARCELONA);
        wait30.until(ExpectedConditions.elementToBeClickable(LINK_CITY_BARCELONA_TAB_TO_LOCATION_DELTA_MAIN_PAGE));
        driver.findElement(LINK_CITY_BARCELONA_TAB_TO_LOCATION_DELTA_MAIN_PAGE).click();
    }

    public static void fillFieldDepartureDate(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(FIELD_DEPARTURE_DATE_DELTA_MAIN_PAGE));
        driver.findElement(FIELD_DEPARTURE_DATE_DELTA_MAIN_PAGE).click();
        System.out.println(THE_NUMBER_OF_TODAYS_DATE);
        driver.findElement(By.xpath("//div[contains(@class,'first')]//*[contains(text(),'" + THE_NUMBER_OF_TODAYS_DATE + "')]")).click();
    }

    public static void fillFieldReturnDate(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(FIELD_RETURN_DATE_DELTA_MAIN_PAGE));
        driver.findElement(FIELD_RETURN_DATE_DELTA_MAIN_PAGE).click();
        System.out.println(THE_NUMBER_OF_TODAYS_DATE_PLUS_FIVE);
        driver.findElement(By.xpath("//div[contains(@class,'first')]//*[contains(text(),'" + THE_NUMBER_OF_TODAYS_DATE_PLUS_FIVE + "')]")).click();
    }

    public static void clickButtonMoney(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(BUTTON_MONEY_DELTA_MAIN_PAGE));
        driver.findElement(BUTTON_MONEY_DELTA_MAIN_PAGE).click();
    }

    public static void clickButtonFindFlights(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(BUTTON_FIND_FLIGHTS_DELTA_MAIN_PAGE));
        driver.findElement(BUTTON_FIND_FLIGHTS_DELTA_MAIN_PAGE).click();
    }

}
