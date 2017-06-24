import core.BaseData;
import helperClass.DateHelper;
import org.testng.annotations.Test;
import pages.BookATripPage;
import pages.DeltaMainPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.awt.*;

/**
 * Created by User on 11/12/2016.
 */
public class TaskThirdTest   extends BaseData {

    @Test
    @TestCaseId(" ID 0003 ")          @Stories(" delta.com ")
    public void TestTheFlightBookingEngineForFlightCombinations(){

        BaseData.driverGetDeltaCom();
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
    }
}
