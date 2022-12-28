package steps;

import org.openqa.selenium.WebDriver;

public class NavigationSteps extends BaseSteps{

    public NavigationSteps(WebDriver webDriver){
        super(webDriver);
    }
    public void navigateToURL(String url) {
        webDriver.get(url);
    }

    public String getURL() {
        return webDriver.getCurrentUrl();
    }

}
