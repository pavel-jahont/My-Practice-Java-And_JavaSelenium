import core.BaseData;
import org.testng.annotations.Test;
import pages.MailPage;
import pages.MailRuMainPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class TaskSendLetterViaMailRu extends BaseData {

    @Test
    @TestCaseId(" ID 0001 ")          @Stories(" Log in mail.ru and send mail ")
    public void logInIntoMailRuSendMail() throws InterruptedException {
        MailRuMainPage.logInIntoMail();
        MailPage.clickButtonWriteLetter();
        MailPage.fillFieldsOfLetter();
    }
}
