package helperClass;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        Utils.makeScreenshot("successful");
        try {
            Utils.shoot("successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestFailure(ITestResult iTestResult) {
        Utils.makeScreenshot("failed");
        try {
            Utils.shoot("failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
