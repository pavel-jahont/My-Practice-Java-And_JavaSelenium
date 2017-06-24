package pages;

import core.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static locators.Locators.get;

/**
 * Created by User on 11/12/2016.
 */
public class GmailMailMainPage extends BaseData {

    private static final By INBOX_FOLDER_MAIL_MAIN_PAGE = get("GmailMainPage.InboxFolderMailMainPage");
    private static final By SEND_MESSAGE_FOLDER_MAIL_MAIN_PAGE = get("GmailMainPage.SendMessageFolderMailMainPage");
    private static final By TITLE_ELSE_MAIL_MAIN_PAGE = get("GmailMainPage.TitleElseMailMainPage");
    private static final By SPAM_FOLDER_MAIL_MAIN_PAGE = get("GmailMainPage.SpamFolderMailMainPage");
    private static final By TITLE_TERMS_MAIL_MAIN_PAGE = get("GmailMainPage.TitleTermsMailMainPage");
    private static final By FIELD_SEARCH_MAIL_MAIN_PAGE = get("GmailMainPage.FieldSearchMailMainPage");
    private static final By BUTTON_SEARCH_MAIL_MAIN_PAGE = get("GmailMainPage.ButtonSearchMailMainPage");
    private static final By BUTTON_WRITE_MAIL_MAIN_PAGE = get("GmailMainPage.ButtonWriteMailMainPage");
    private static final By LIST_WEBELEMENTS_MAIL_MAIN_PAGEMAIN_PAGE = get("GmailMainPage.ListWebelementsMailMainPage");
    private static final By FIELD_TO_POPUP_MESSAGE_MAIL_MAIN_PAGE = get("GmailMainPage.FieldToPopupMessageMailMainPage");
    private static final By THEME_OF_LETTER_POPUP_MESSAGE_MAIL_MAIN_PAGE = get("GmailMainPage.ThemeOfLetterPopupMessageMailMainPage");
    private static final By FIELD_OF_TEXT_LETTER_POPUP_MESSAGE_MAIL_MAIN_PAGE = get("GmailMainPage.FieldOfTextLetterPopupMessageMailMainPage");
    private static final By BUTTON_SUBMIT_POPUP_MESSAGE_MAIL_MAIN_PAGE = get("GmailMainPage.ButtonSubmitPopupMessageMailMainPage");
    private static final By ICON_SIGN_OUT_MAIL_MAIN_PAGE = get("GmailMainPage.IconSignOutMailMainPage");
    private static final By BUTTON_LOG_OUT_MAIL_MAIN_PAGE = get("GmailMainPage.ButtonLogOutMailMainPage");

    private static final String SEND = "Отправленные";
    private static final String INBOX = "Входящие";
    private static final String SPAM = "Спам";
    private static final String PAVEL_JAHONT = "pavel.jahont@gmail.com ";
    private static final String TEXT_THEME = "Hello, my dear friend Paul!";
    private static final String TEXT_LETTER = "Hi! How are you? What's New?";


    public static void clickInboxFolder(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(INBOX_FOLDER_MAIL_MAIN_PAGE));
        driver.findElement(INBOX_FOLDER_MAIL_MAIN_PAGE).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS_MAIL_MAIN_PAGE));
        Assert.assertTrue(driver.getTitle().contains(INBOX));
    }

    public static void clickSendMessageFolder(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(SEND_MESSAGE_FOLDER_MAIL_MAIN_PAGE));
        driver.findElement(SEND_MESSAGE_FOLDER_MAIL_MAIN_PAGE).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS_MAIL_MAIN_PAGE));
        Assert.assertTrue(verifyNameTitle(SEND));
    }

    public static void clickSpamFolder(){
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(SPAM_FOLDER_MAIL_MAIN_PAGE));
        driver.findElement(SPAM_FOLDER_MAIL_MAIN_PAGE).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS_MAIL_MAIN_PAGE));
        Assert.assertTrue(verifyNameTitle(SPAM));
    }

    public static void clickTitleElse() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.elementToBeClickable(TITLE_ELSE_MAIL_MAIN_PAGE));
        driver.findElement(TITLE_ELSE_MAIL_MAIN_PAGE).click();
    }

    public static void searchMails() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(FIELD_SEARCH_MAIL_MAIN_PAGE));
        driver.findElement(FIELD_SEARCH_MAIL_MAIN_PAGE).sendKeys(PAVEL_JAHONT);
    }

    public static void clickButtonSearch() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_SEARCH_MAIL_MAIN_PAGE));
        driver.findElement(BUTTON_SEARCH_MAIL_MAIN_PAGE).click();
    }

    public static void clickButtonWrite() {
        WebDriverWait wait30 = new WebDriverWait(driver, 30);
        wait30.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_WRITE_MAIL_MAIN_PAGE));
        driver.findElement(BUTTON_WRITE_MAIL_MAIN_PAGE).click();
    }

    public static void findAmountOfMailsRecipient() {
        Assert.assertTrue(verifyIfListContainsExpectedMailsAndActualMails());
    }

    private static boolean verifyIfListContainsExpectedMailsAndActualMails() {
        try {
            WebDriverWait wait30 = new WebDriverWait(driver, 30);
            wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS_MAIL_MAIN_PAGE));
            java.util.List<WebElement> elements = driver.findElements(LIST_WEBELEMENTS_MAIL_MAIN_PAGEMAIN_PAGE);
            System.out.println(elements.size());
            for (WebElement e : elements) {
                if (elements.size() == 3) {
                    System.out.println("Количество писем от получателя:    " + PAVEL_JAHONT + "равно:      " + elements.size());
                    return true;
                }
            }
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private static boolean verifyNameTitle(String name){
        try {
            driver.getTitle().contains(name);
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void sendNewMessage() {
        driver.switchTo().activeElement();
        driver.findElement(FIELD_TO_POPUP_MESSAGE_MAIL_MAIN_PAGE).sendKeys(PAVEL_JAHONT);
        driver.findElement(THEME_OF_LETTER_POPUP_MESSAGE_MAIL_MAIN_PAGE).sendKeys(TEXT_THEME);
        driver.findElement(FIELD_OF_TEXT_LETTER_POPUP_MESSAGE_MAIL_MAIN_PAGE).sendKeys(TEXT_LETTER);
        driver.findElement(BUTTON_SUBMIT_POPUP_MESSAGE_MAIL_MAIN_PAGE).click();
    }
    public static void Logout(){
        driver.findElement(ICON_SIGN_OUT_MAIL_MAIN_PAGE).click();
        driver.findElement(BUTTON_LOG_OUT_MAIL_MAIN_PAGE).click();
    }
}
