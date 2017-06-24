import core.BaseData;
import helperClass.Listener;
import helperClass.NewParser;
import org.testng.Assert;
import pages.MailPage;
import pages.MainPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import static org.testng.Assert.assertTrue;

@Listeners(Listener.class)

public class TestTutBySendMail extends BaseData {
    private final String[] USER_DATA_CSV = NewParser.getDataFrom(NewParser.Parsers.csv);
    private final String[] USER_DATA_XML = NewParser.getDataFrom(NewParser.Parsers.xml);
    private final String FIRST_USER_LOGIN_CSV = USER_DATA_CSV[0];
    private final String FIRST_USER_PASSWORD_CSV = USER_DATA_CSV[1];
    private final String SECOND_USER_LOGIN_CSV = USER_DATA_CSV[2];
    private final String SECOND_USER_PASSWORD_CSV = USER_DATA_CSV[3];
    private final String THIRD_USER_LOGIN_CSV = USER_DATA_CSV[4];
    private final String THIRD_USER_PASSWORD_CSV = USER_DATA_CSV[5];
    private final String FOURTH_USER_LOGIN_CSV = USER_DATA_CSV[6];
    private final String FOURTH_USER_PASSWORD_CSV = USER_DATA_CSV[7];
    private final String FIFTH_USER_LOGIN_XML = USER_DATA_XML[0];
    private final String FIFTH_USER_PASSWORD_XML = USER_DATA_XML[1];
    private final String SIXTH_USER_LOGIN_XML = USER_DATA_XML[2];
    private final String SIXTH_USER_PASSWORD_XML = USER_DATA_XML[3];

    private String textFromTextBody = "Hello, my dear friend!";
    private String textFromTopicFirst = "Letter from Paul_1";
    private String textFromTopicThird = "Letter from Paul_3";
    private String textFromTopicFifth = "Letter from Paul_5";


    @TestCaseId("ID-0001")
    @Features("SendMail")
    @Stories("Send letter from first to second email, account takes from File CSV")
    @Test
    public void sendLetterFromFirstToSecondEmailFileCSV() {
        MainPage.enterToFormSignIn(FIRST_USER_LOGIN_CSV,FIRST_USER_PASSWORD_CSV);
        Assert.assertTrue(MailPage.isDisplayedLogo(),"Logo Tut.by isn't dispalayed");
        MailPage.sendMail(SECOND_USER_LOGIN_CSV,textFromTextBody, textFromTopicFirst);
        Assert.assertTrue(MailPage.popapMessageIsDisplayed(),"Message isn't displayed!");
        Assert.assertTrue(MailPage.verifyEmailIsSent(textFromTopicFirst),"Mail isn't sent");
        MailPage.logOutUser();

        MainPage.enterToFormSignIn(SECOND_USER_LOGIN_CSV, SECOND_USER_PASSWORD_CSV);
        Assert.assertTrue(MailPage.isDisplayedLogo(), "Logo Tut.by isn't dispalayed");
        MailPage.checkMessage();
    }

    @TestCaseId("ID-0002")
    @Features("SendMail")
    @Stories("Send letter from third to fourth email, account takes from File CSV")
    @Test
    public void sendLetterFromThirdToFourthEmailFileCSV(){
        MainPage.enterToFormSignIn(THIRD_USER_LOGIN_CSV,THIRD_USER_PASSWORD_CSV);
        Assert.assertTrue(MailPage.isDisplayedLogo(),"Logo Tut.by isn't dispalayed");
        MailPage.sendMail(FOURTH_USER_LOGIN_CSV,textFromTextBody, textFromTopicThird);
        Assert.assertTrue(MailPage.popapMessageIsDisplayed(),"Message isn't displayed!");
        Assert.assertTrue(MailPage.verifyEmailIsSent(textFromTopicThird),"Mail isn't sent");
        MailPage.logOutUser();

        MainPage.enterToFormSignIn(FOURTH_USER_LOGIN_CSV, FOURTH_USER_PASSWORD_CSV);
        Assert.assertTrue(MailPage.isDisplayedLogo(), "Logo Tut.by isn't dispalayed");
        MailPage.checkMessage();
    }

    @TestCaseId("ID-0003")
    @Features("SendMail")
    @Stories("Send letter from fifth to sixth email, account takes from File XML")
    @Test
    public void sendLetterFromFirstToSecondEmailFileXML() {
        MainPage.enterToFormSignIn(FIFTH_USER_LOGIN_XML,FIFTH_USER_PASSWORD_XML);
        Assert.assertTrue(MailPage.isDisplayedLogo(),"Logo Tut.by isn't dispalayed");
        MailPage.sendMail(SIXTH_USER_LOGIN_XML,textFromTextBody, textFromTopicFifth);
        Assert.assertTrue(MailPage.popapMessageIsDisplayed(),"Message isn't displayed!");
        Assert.assertTrue(MailPage.verifyEmailIsSent(textFromTopicFirst),"Mail isn't sent");
        MailPage.logOutUser();

        MainPage.enterToFormSignIn(SIXTH_USER_LOGIN_XML, SIXTH_USER_PASSWORD_XML);
        Assert.assertTrue(MailPage.isDisplayedLogo(), "Logo Tut.by isn't dispalayed");
        MailPage.checkMessage();
    }
}



