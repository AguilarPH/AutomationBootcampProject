package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pageobjects.BasePage;

import java.time.Duration;

public class BaseSteps extends BasePage{
    WebDriver webDriver;
    Actions customActions;
    JavascriptExecutor js;

    public BaseSteps(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
        this.customActions = new Actions(this.webDriver);
        js = (JavascriptExecutor) this.webDriver;
    }

    public void waitForElement(WebElement webElement, int seconds) {
        Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(seconds)).pollingEvery
                (Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForTitle(String title) {
        Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(30)).pollingEvery
                (Duration.ofMillis(200)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.titleIs(title));
    }

}
