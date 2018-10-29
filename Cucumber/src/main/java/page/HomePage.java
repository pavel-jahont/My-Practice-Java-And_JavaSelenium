package Cucumber.src.main.java.page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final By SIGNOUT_BUTTON = By.id("PH_logoutLink");

    public boolean isUserLoggedIn() {
        return $(SIGNOUT_BUTTON).is(Condition.visible);
    }
}
