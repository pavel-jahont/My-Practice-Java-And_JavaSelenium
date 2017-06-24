package pages;

import core.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static locators.Locators.get;

/**
 * Created by User on 11/13/2016.
 */
public class BookATripPage extends BaseData {
    private static final By RETURN_TO_TOP_IN_THE_BOTTOM_OF_THE_PAGE_BOOK_A_TRIP_PAGE = get("BookATripPage.ReturnToTopInTheBottomOfThePageBookATripPage");
    private static final By BUTTON_CONTINUE_PAGE_BOOK_A_TRIP_PAGE = get("BookATripPage.ButtonContinuePageBookATripPage");
    private static final By TICKET_BOOK_A_TRIP_PAGE = get("BookATripPage.TicketBookATripPagePageBookATripPage");
    private static final By FIELD_FIRST_NAME_BOOK_A_TRIP_PAGE= get("BookATripPage.FieldFirstNamePageBookATripPage");
    private static final By FIELD_LAST_NAME_BOOK_A_TRIP_PAGE= get("BookATripPage.FieldLastNamePageBookATripPage");
    private static final By DROPDOWN_GENDER_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownGenderPageBookATripPage");
    private static final By DROPDOWN_GENDER_POSITION_MALE_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownGenderPositionMaleBookATripPage");
    private static final By FIELD_PHONE_NUMBER_BOOK_A_TRIP_PAGE = get("BookATripPage.FieldPhoneNumberPageBookATripPage");
    private static final By FIELD_EMAIL_BOOK_A_TRIP_PAGE = get("BookATripPage.FieldEmailPageBookATripPage");
    private static final By FIELD_CONFIRM_EMAIL_ADDRESS_BOOK_A_TRIP_PAGE = get("BookATripPage.FieldConfirmEmailAddressPageBookATripPage");
    private static final By DROPDOWN_MONTH_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownMonthBookATripPage");
    private static final By DROPDOWN_MONTH_SEPTEMBER_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownMonthSeptemberBookATripPage");
    private static final By DROPDOWN_DAY_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownDayBookATripPage");
    private static final By DROPDOWN_DAY_THIRTY_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownDayThirtyBookATripPage");
    private static final By DROPDOWN_YEAR_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownYearBookATripPage");
    private static final By DROPDOWN_YEAR_NINTEEN_EIGHTY_TWO_BOOK_A_TRIP_PAGE = get("BookATripPage.DropdownYearNinteenEightyTwoBookATripPage");
    private static final By BUTTON_NO_EMERGENCY_CONTACT_INFORMATION_BOOK_A_TRIP_PAGE = get ("BookATripPage.ButtonNoEmergencyContactInformationBookATripPage");
    private static final By BUTTON_COMPLETE_PURCHASE_BOOK_A_TRIP_PAGE = get ("BookATripPage.ButtonCompletePurchaseBookATripPage");


    private static final String FIRST_NAME = "Vasiliy";
    private static final String LAST_NAME = "Alibabaevich";
    private static final String PHONE_NUMBER = "+375290000000";
    private static final String EMAIL = "john.smith@gmail.com";


    public static void clickFirstTicket() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(RETURN_TO_TOP_IN_THE_BOTTOM_OF_THE_PAGE_BOOK_A_TRIP_PAGE));
        driver.findElement(TICKET_BOOK_A_TRIP_PAGE).click();
    }

    public static void clickSecondTicket() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(RETURN_TO_TOP_IN_THE_BOTTOM_OF_THE_PAGE_BOOK_A_TRIP_PAGE));
        driver.findElement(TICKET_BOOK_A_TRIP_PAGE).click();
    }

    public static void clickButtonContinue(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_CONTINUE_PAGE_BOOK_A_TRIP_PAGE));
        driver.findElement(BUTTON_CONTINUE_PAGE_BOOK_A_TRIP_PAGE).click();
    }

    public static void clickButtonNoEmergencyContactInformation(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_NO_EMERGENCY_CONTACT_INFORMATION_BOOK_A_TRIP_PAGE));
        driver.findElement(BUTTON_NO_EMERGENCY_CONTACT_INFORMATION_BOOK_A_TRIP_PAGE).click();
    }

    public static void fillFieldFirstName() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_FIRST_NAME_BOOK_A_TRIP_PAGE));
        driver.findElement(FIELD_FIRST_NAME_BOOK_A_TRIP_PAGE).click();
        driver.findElement(FIELD_FIRST_NAME_BOOK_A_TRIP_PAGE).clear();
        driver.findElement(FIELD_FIRST_NAME_BOOK_A_TRIP_PAGE).sendKeys(FIRST_NAME);
    }

    public static void fillFieldLastName() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_LAST_NAME_BOOK_A_TRIP_PAGE));
        driver.findElement(FIELD_LAST_NAME_BOOK_A_TRIP_PAGE).click();
        driver.findElement(FIELD_LAST_NAME_BOOK_A_TRIP_PAGE).clear();
        driver.findElement(FIELD_LAST_NAME_BOOK_A_TRIP_PAGE).sendKeys(LAST_NAME);
    }

    public static void fillFieldPhoneNumber() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_PHONE_NUMBER_BOOK_A_TRIP_PAGE));
        driver.findElement(FIELD_PHONE_NUMBER_BOOK_A_TRIP_PAGE).click();
        driver.findElement(FIELD_PHONE_NUMBER_BOOK_A_TRIP_PAGE).clear();
        driver.findElement(FIELD_PHONE_NUMBER_BOOK_A_TRIP_PAGE).sendKeys(PHONE_NUMBER);
    }

    public static void fillFieldEmail() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_EMAIL_BOOK_A_TRIP_PAGE));
        driver.findElement(FIELD_EMAIL_BOOK_A_TRIP_PAGE).click();
        driver.findElement(FIELD_EMAIL_BOOK_A_TRIP_PAGE).clear();
        driver.findElement(FIELD_EMAIL_BOOK_A_TRIP_PAGE).sendKeys(EMAIL);
    }

    public static void fillFieldConfirmEmailAddress() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_CONFIRM_EMAIL_ADDRESS_BOOK_A_TRIP_PAGE));
        driver.findElement(FIELD_CONFIRM_EMAIL_ADDRESS_BOOK_A_TRIP_PAGE).click();
        driver.findElement(FIELD_CONFIRM_EMAIL_ADDRESS_BOOK_A_TRIP_PAGE).clear();
        driver.findElement(FIELD_CONFIRM_EMAIL_ADDRESS_BOOK_A_TRIP_PAGE).sendKeys(EMAIL);
    }

    public static void fillDropboxGender() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(DROPDOWN_GENDER_BOOK_A_TRIP_PAGE));
        driver.findElement(DROPDOWN_GENDER_BOOK_A_TRIP_PAGE).click();
        driver.findElement(DROPDOWN_GENDER_POSITION_MALE_BOOK_A_TRIP_PAGE).click();
    }

    public static void fillDropboxDateOfBirth() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(DROPDOWN_MONTH_BOOK_A_TRIP_PAGE));
        driver.findElement(DROPDOWN_MONTH_BOOK_A_TRIP_PAGE).click();
        wait30.until(ExpectedConditions.visibilityOfElementLocated(DROPDOWN_MONTH_SEPTEMBER_BOOK_A_TRIP_PAGE));
        driver.findElement(DROPDOWN_MONTH_SEPTEMBER_BOOK_A_TRIP_PAGE).click();
        driver.findElement(DROPDOWN_DAY_BOOK_A_TRIP_PAGE).click();
        wait30.until(ExpectedConditions.visibilityOfElementLocated(DROPDOWN_DAY_THIRTY_BOOK_A_TRIP_PAGE));
        driver.findElement(DROPDOWN_DAY_THIRTY_BOOK_A_TRIP_PAGE).click();
        driver.findElement(DROPDOWN_YEAR_BOOK_A_TRIP_PAGE).click();
        wait30.until(ExpectedConditions.visibilityOfElementLocated(DROPDOWN_YEAR_NINTEEN_EIGHTY_TWO_BOOK_A_TRIP_PAGE));
        driver.findElement(DROPDOWN_YEAR_NINTEEN_EIGHTY_TWO_BOOK_A_TRIP_PAGE).click();
    }

    public static void checkButtonCompletePurchase(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_COMPLETE_PURCHASE_BOOK_A_TRIP_PAGE));
        Assert.assertTrue(driver.findElement(BUTTON_COMPLETE_PURCHASE_BOOK_A_TRIP_PAGE).isEnabled());
    }
}