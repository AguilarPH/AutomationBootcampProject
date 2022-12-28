package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver = getDriver();
    @BeforeClass
    private WebDriver getDriver() {
        setupDriver("chrome");
        driver.navigate().to("https://www.demoblaze.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        return driver;
    }
    private void setupDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/pa0822/Documents/Automation Bootcamp/Project1/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/pa0822/Documents/Java Training/IDE Project/Project1/geckodriver_");
                System.out.println("Driver set to: firefox");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Web Driver was not found in directory");
        }
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
