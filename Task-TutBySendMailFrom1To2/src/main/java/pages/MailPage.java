package pages;

import core.BaseData;
import helperClass.Waiters;
import locators.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static locators.Locators.get;

public class MailPage extends BaseData {

    private static final By MAIL_LOGO_TUT_BY = get("MailPage.LogoTutBy");
    private static final By CREATE_MAIL = get("MailPage.WriteMail");
    private static final By RECIPIENT_OF_EMAIL_FIELD = get("MailPage.RecipientOfEmailField");
    private static final By TOPIC_OF_EMAIL_FIELD = get("MailPage.TopicOfEmailField");
    private static final By TEXT_OF_EMAIL_FIELD = get("MailPage.TextOfEmailField");
    private static final By SEND_MAIL_BUTTON = get("MailPage.SendMailButton");
    private static final By POPAP_MESSAGE = get("MailPage.PopapMessage");
    private static final By SENT_LETTERS_LINK = get("MailPage.SentLettersLink");
    private static final By MESSAGE_TOPIC_SENT_MAIL = get("MailPage.MessageTopicSentMail");
    private static final By TITLE_NAME_USER = get("MailPage.TitleNameUser");
    private static final By EXIT_BUTTON = get("MailPage.ExitButton");
    private static final By TOPIC_OF_EMAIL_SENDER = get("MailPage.TopicOfEmailSender");



    public static boolean isDisplayedLogo() {
        return driver.findElement(MAIL_LOGO_TUT_BY).isDisplayed();
    }

    public static void sendMail(String email, String textFromTextBody, String textFromTopic) {
        driver.findElement(CREATE_MAIL).click();
        driver.findElement(TOPIC_OF_EMAIL_FIELD).sendKeys(textFromTopic);
        driver.findElement(RECIPIENT_OF_EMAIL_FIELD).sendKeys(email);
        driver.findElement(TEXT_OF_EMAIL_FIELD).sendKeys(textFromTextBody);
        driver.findElement(SEND_MAIL_BUTTON).click();
        Waiters.waitForPageLoaded();
    }

    public static boolean popapMessageIsDisplayed() {
        return driver.findElement(POPAP_MESSAGE).isDisplayed();
    }

    public static boolean verifyEmailIsSent(String textFromTopic) {
        driver.findElement(SENT_LETTERS_LINK).click();
        return driver.findElements(MESSAGE_TOPIC_SENT_MAIL).get(0)
                .getAttribute("title").contains(textFromTopic);
    }

    public static void logOutUser() {
        driver.findElement(TITLE_NAME_USER).click();
      WebDriverWait wait30 = new WebDriverWait(driver, 30);
        WebElement element1 = wait30.until(ExpectedConditions.visibilityOfElementLocated(EXIT_BUTTON));

        try {
            driver.findElement(EXIT_BUTTON).click();
        } catch (NoSuchElementException e) {
            driver.get("http://www.tut.by/");
        }
        Waiters.waitForPageLoaded();
    }


    public static boolean checkMessage() {
        return driver.findElements(TOPIC_OF_EMAIL_SENDER).get(0)
                .getAttribute("title").contains("Letter from Paul");
    }
}








