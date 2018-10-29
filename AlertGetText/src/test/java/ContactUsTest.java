package AlertGetText.src.test.java;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ContactUsPage;

public class ContactUsTest {

    private WebDriver driver;

    @Test
    public void contactTest() {
        driver = new FirefoxDriver();
        //maximize window and set implicit waiter
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        //fill all fields expect of message area
        //click send button
        Assert.assertEquals(contactUsPage.getErrorMessageText(), "The message cannot be blank.");
    }

    @Test
    public void contact2Test() {
        driver = new FirefoxDriver();
        //maximize window and set implicit waiter
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        //fill all fields
        //click send button
        Assert.assertEquals(contactUsPage.getSuccessMessageText(), "Your message has been successfully sent to our team.");
    }
}
