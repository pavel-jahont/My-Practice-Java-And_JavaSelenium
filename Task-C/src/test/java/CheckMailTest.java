import core.BaseData;
import helperClass.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GmailMailMainPage;
import pages.GmailMainPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

@Listeners(Listener.class)

public class CheckMailTest extends BaseData {

    @Test
    @TestCaseId(" ID 0001 ")
    @Stories(" 1) Открыть страницу почтового сервера; \n" +
            "  2) Залогиниться под заранее подготовленным пользователем;\n" +
            "  3) Найти и открыть заранее подготовленное письмо из списка Входящих;\n" +
            "  4) Проверить отправителя, тему и содержание письма;\n" +
            "  5) Разлогиниться. ")
    public void openBrowserOpenGoogleMailCheckInInboxSenderTopicContent(){
        GmailMainPage.fillFieldMail();
        GmailMainPage.clickButtonNext();
        GmailMainPage.fillFieldPassword();
        GmailMainPage.clickButtonInput();
        GmailMailMainPage.clickInboxFolder();
        GmailMailMainPage.findLetter();
        GmailMailMainPage.logout();
    }
}
