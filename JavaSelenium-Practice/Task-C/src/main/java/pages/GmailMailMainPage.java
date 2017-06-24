package pages;

import core.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.List;
import static locators.Locators.get;

/**
 * Created by User on 28.03.17.
 */
public class GmailMailMainPage extends BaseData {
    private static final By INBOX_FOLDER = get("GmailMainPage.InboxFolder");
    private static final By TITLE_TERMS = get("GmailMainPage.TitleTerms");
    private static final By LIST_INBOX_MAILS = get("GmailMainPage.ListInboxMails");
    private static final By MAIL_FROM_PAVEL_JAHONT = get("GmailMainPage.MailFromPavelJahont");
    private static final By MAIL_SENDER = get("GmailMainPage.MailSender");
    private static final By MAIL_TOPIC = get("GmailMainPage.MailTopic");
    private static final By MAIL_CONTENT = get("GmailMainPage.MailContent");
    private static final By ICON_SIGN_OUT = get("GmailMainPage.IconSignOut");
    private static final By BUTTON_LOG_OUT = get("GmailMainPage.ButtonLogOut");

    private static final String INBOX = "Входящие";
    private static final String GMAIL = "Gmail";

    public static void clickInboxFolder(){
        wait30.until(ExpectedConditions.elementToBeClickable(INBOX_FOLDER));
        driver.findElement(INBOX_FOLDER).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS));
        Assert.assertTrue(driver.getTitle().contains(INBOX));
    }

    public static void findLetter() {
        List<WebElement> elements = driver.findElements(LIST_INBOX_MAILS);
        System.out.println();
        System.out.println("Количество всего входящих писем: " + elements.size());
        System.out.println();
        driver.findElement(MAIL_FROM_PAVEL_JAHONT).click();
        wait30.until(ExpectedConditions.presenceOfElementLocated(TITLE_TERMS));
        String text1 = driver.findElement(MAIL_TOPIC).getText();
        System.out.println("Тема письма: " + text1);
        System.out.println();
        String text2 = driver.findElement(MAIL_SENDER).getText();
        System.out.println("Почтовый ящик отправителя: " + text2);
        System.out.println();
        List<WebElement> elements2 = driver.findElements(MAIL_CONTENT);
        System.out.println("Текст полученного письма: ");
        for (WebElement e : elements2){
            String text3 = e.getText();
            System.out.println(text3);
        }
    }

    public static void logout(){
        driver.findElement(ICON_SIGN_OUT).click();
        driver.findElement(BUTTON_LOG_OUT).click();
        wait30.until(ExpectedConditions.titleContains(GMAIL));
        Assert.assertEquals(GMAIL,driver.getTitle());
    }
}
