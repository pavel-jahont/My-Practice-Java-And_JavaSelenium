package Cucumber.src.test.java;import cucumber.annotation.en.Then;
import org.junit.Assert;
import page.HomePage;

public class HomeStepdefs {

    private HomePage homePage = new HomePage();

    @Then("^Home page of Mail.ru inbox appears$")
    public void Home_page_of_Mail_ru_inbox_appears() {
        Assert.assertTrue("User is not logged in, because signout button is not visible!", homePage.isUserLoggedIn());
    }
}
