package ArchitectProject.src.main.java.page;

import base.PageBase;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    private static final String URL = "https://www.onliner.by";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
    }

    public void load() {
        driver.get(URL);
    }
}
