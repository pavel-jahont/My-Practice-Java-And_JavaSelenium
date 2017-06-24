package helperClasses;

import core.BaseData;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utils extends BaseData{
    @Attachment(value = "(0)", type = "image/pmg")
    public static byte[] makeScreenshot(String name) {
        return ((TakesScreenshot) BaseData.driver).getScreenshotAs(OutputType.BYTES);
    }
    public static void shoot(String name) throws IOException {
        long curTime = System.currentTimeMillis();

        Date now = new Date(curTime);
        File screenshot = ((TakesScreenshot) BaseData.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("Screenshot\\" +name+System.currentTimeMillis()+".png"));
    }
}
