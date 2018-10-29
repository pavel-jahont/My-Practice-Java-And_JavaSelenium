package Selenide.src.test.java;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by student on 15.09.2016.
 */
public class MailRuTest {

    private static final By MAILBOX_CONTAINER = By.id("mailbox");
    private static final By USERNAME_INPUT = By.id("mailbox__login");
    private static final By PASSWORD_INPUT = By.id("mailbox__password");
    private static final By LOGIN_BUTTON = By.id("mailbox__auth__button");
    private static final By SIGNOUT_BUTTON = By.id("PH_logoutLink");

    private static final By ENTER_BUTTON = By.cssSelector("a.enter");

    @Test
    public void loginTest() {
        FirefoxProfile p = new FirefoxProfile();
        p.setPreference("example", "hello world");
        WebDriver driver = new FirefoxDriver(p);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
//        Configuration.browser = "chrome";
        open("/");
        $$(By.cssSelector("a.x-ph__link")).findBy(Condition.text("Pavel"));
//        $(By.cssSelector("select#countries")).selectOption("USA");
        $(MAILBOX_CONTAINER).$(USERNAME_INPUT).val("pavel.jahont");
        $(PASSWORD_INPUT).val("javascript202099775533");
//        $(PASSWORD_INPUT).should(Condition.appear);
//        $(PASSWORD_INPUT).waitUntil(Condition.text("1"), 20000);
        $(PASSWORD_INPUT).shouldBe(Condition.visible);
//        Assert.assertTrue($(PASSWORD_INPUT).is(Condition.visible));
//        WebDriver driver = WebDriverRunner.getWebDriver();
//        driver.findElement(LOGIN_BUTTON).click();
//        Assert.assertTrue(driver.findElement(SIGNOUT_BUTTON).isDisplayed(), "Sign out link is not visible!");
    }
}
