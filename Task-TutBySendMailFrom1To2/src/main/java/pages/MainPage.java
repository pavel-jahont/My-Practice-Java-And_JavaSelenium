package pages;


import core.BaseData;
import org.openqa.selenium.By;
import static locators.Locators.get;

public class MainPage extends BaseData {
    private static final By ENTER = get("MainPage.Enter");
    private static final By LOGIN_FIELD = get("MainPage.LoginField");
    private static final By PASSWORD_FIELD = get("MainPage.PasswordField");
    private static final By BUTTON_SUBMIT = get("MainPage.ButtonSubmit");
    private static final By BUTTON_MAIL_MAIN_TAB = get("MainPage.ButtonMailMainTab");
    private static final By EXIT_BUTTON_RESERVE = get("MailPage.ExitButtonReserve");
    private static final By TITLE_NAME_USER = get("MailPage.TitleNameUser");


    public static void enterToFormSignIn(String userLogin, String userPassword){
        driver.findElement(ENTER).click();
        driver.findElement(LOGIN_FIELD).sendKeys(userLogin);
        driver.findElement(PASSWORD_FIELD).sendKeys(userPassword);
        driver.findElement(BUTTON_SUBMIT).click();
        driver.findElement(BUTTON_MAIL_MAIN_TAB).click();
    }

    public static void logOutUserReserve(){
        driver.findElement(TITLE_NAME_USER).click();
        driver.findElement(EXIT_BUTTON_RESERVE).click();
    }

}

