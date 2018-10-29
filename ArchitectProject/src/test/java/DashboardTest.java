package ArchitectProject.src.test.java;import helper.CommonDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Header;
import page.HomePage;
import page.LoginPage;
import page.houses.RentPage;
import webdriver.WebDriverConfiguration;

import java.util.concurrent.TimeUnit;

public class DashboardTest {

    private HomePage homePage;
    private LoginPage loginPage;
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverConfiguration.setLocalDriver();
        homePage = new HomePage(driver);
        homePage.load();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    @Test(dataProvider = "myProvider", dataProviderClass = CommonDataProvider.class)
    public void t5(String s1, String s2, String s3) {
        loginPage = homePage.clickLogin();
        loginPage.login("pavel.jahont@gmail.com", "99775533");

        Assert.assertTrue(homePage.isUserLoggedIn());
    }
}
