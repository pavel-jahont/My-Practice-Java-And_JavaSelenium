import core.BaseData;
import org.testng.annotations.Test;
import pages.GmailMailMainPage;
import pages.GmailMainPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by User on 11/11/2016.
 */
public class TaskSecondTest  extends BaseData {

    @Test
    @TestCaseId(" ID 0002 ")          @Stories(" gmail.com ")
    public void openBrowserOpenGoogleMailCheckAllBoxesSearchPositionSendMailAssert(){
        BaseData.driverGetUrlGmailCom();
        GmailMainPage.fillFieldMail();
        GmailMainPage.clickButtonNext();
        GmailMainPage.fillFieldPassword();
        GmailMainPage.clickButtonInput();
        GmailMailMainPage.clickSendMessageFolder();
        GmailMailMainPage.clickTitleElse();
        GmailMailMainPage.clickSpamFolder();
        GmailMailMainPage.clickInboxFolder();
        GmailMailMainPage.searchMails();
        GmailMailMainPage.clickButtonSearch();
        GmailMailMainPage.findAmountOfMailsRecipient();
        GmailMailMainPage.clickButtonWrite();
        GmailMailMainPage.sendNewMessage();
        GmailMailMainPage.Logout();
    }
}
