import core.BaseData;
import helperClass.DateHelper;
import org.testng.annotations.Test;
import pages.*;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by User on 11/13/2016.
 */
public class CURRUNT_STACK_TEST_RUN extends BaseData {


    @Test
    @TestCaseId(" ID 0001 ")
    @Stories(" tut.by ")
    public void openBrowserOpenTutBySearchAutomatedTestingLengthFindPositionDoAssert() {
        try {
            BaseData.setUpInStack();
            BaseData.driverGetUrlTutBy();
            TutByMainPage.clickFieldSearchAndTypeValue();
            TutByMainPage.clickButtonSearch();
            TutByMainPage.findPosition();
        } finally {
            BaseData.tearDownInStack();
        }
    }

    @Test
    @TestCaseId(" ID 0002 ")
    @Stories(" gmail.com ")
    public void openBrowserOpenGoogleMailCheckAllBoxesSearchPositionSendMailAssert() {
        try {
            BaseData.setUpInStack();
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
        } finally {
            BaseData.tearDownInStack();
        }
    }

    @Test
    @TestCaseId(" ID 0003 ")
    @Stories(" delta.com ")
    public void TestTheFlightBookingEngineForFlightCombinations() {
        try {
            BaseData.setUpInStack();
            BaseData.driverGetUrl_3();
            DateHelper.setMy_value_day();
            DeltaMainPage.clickTabFlight();
            DeltaMainPage.fillFieldFrom();
            DeltaMainPage.fillFieldTo();
            DeltaMainPage.fillFieldDepartureDate();
            DeltaMainPage.fillFieldReturnDate();
            DeltaMainPage.clickButtonMoney();
            DeltaMainPage.clickButtonFindFlights();
            BookATripPage.clickFirstTicket();
            BookATripPage.clickSecondTicket();
            BookATripPage.clickButtonContinue();
            BookATripPage.fillFieldFirstName();
            BookATripPage.fillFieldLastName();
            BookATripPage.fillFieldPhoneNumber();
            BookATripPage.fillFieldEmail();
            BookATripPage.fillFieldConfirmEmailAddress();
            BookATripPage.fillDropboxGender();
            BookATripPage.fillDropboxDateOfBirth();
            BookATripPage.clickButtonNoEmergencyContactInformation();
            BookATripPage.clickButtonContinue();
            BookATripPage.checkButtonCompletePurchase();
        } finally {
            BaseData.tearDownInStack();
        }
    }
}
