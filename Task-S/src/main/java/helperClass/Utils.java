package helperClass;


import core.BaseData;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import java.text.DateFormat;
import java.util.Date;

import java.io.File;
import java.io.IOException;

public class Utils extends BaseData {
    @Attachment(value = "(0)", type = "image/pmg")

    public static byte[] makeScreenshot(String name) {
        return ((TakesScreenshot) BaseData.driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void makeScreenShotInFolder(String name) throws IOException {
        Date now = new Date();
        File screenshot = ((TakesScreenshot) BaseData.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("Screenshot\\"+name+DateFormat.getInstance().format(now)+
                System.currentTimeMillis()+".png"));
    }
}
