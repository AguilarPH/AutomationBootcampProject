package pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver webDriver;

    public BasePage(WebDriver driver) {
        BasePage.webDriver = driver;
    }
}
