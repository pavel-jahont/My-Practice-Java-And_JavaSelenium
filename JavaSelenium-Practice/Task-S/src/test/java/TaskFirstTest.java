import core.BaseData;
import org.testng.annotations.Test;
import pages.TutByMainPage;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.awt.*;

/**
 * Created by User on 11/11/2016.
 */
public class TaskFirstTest extends BaseData {

    @Test
    @TestCaseId(" ID 0001 ")          @Stories(" tut.by ")
    public void openBrowserOpenTutBySearchAutomatedTestingLengthFindPositionDoAssert(){
        BaseData.driverGetUrlTutBy();
        TutByMainPage.clickFieldSearchAndTypeValue();
        TutByMainPage.clickButtonSearch();
        TutByMainPage.findPosition();
    }
}
