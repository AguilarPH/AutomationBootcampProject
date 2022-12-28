package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.ProductPage;
import steps.ElementSteps;
import steps.NavigationSteps;

public class CatalogTests extends BaseTest {


    NavigationSteps navigationSteps = new NavigationSteps(driver);
    ElementSteps elementSteps = new ElementSteps(driver);

    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

    @Test(description = "Verify elements displayed in product page", groups = "Demoblaze", priority = 1)
    public void checkProductDetails() {
//        navigationSteps.navigateToURL("https://www.demoblaze.com");
        navigationSteps.waitForTitle("STORE");

        ProductName product = ProductName.SAMSUNG_GALAXY_S6;

        elementSteps.clickProduct(product);

        String expectedName = product.getName();

        String actualName = elementSteps.getProductName();
        CustomAssertions.isDetailEqual("Product name", expectedName, actualName);

        String expectedIMG = "https://www.demoblaze.com/" + product.getImg();

        String actualIMG = elementSteps.getProductIMG();
        CustomAssertions.isDetailEqual("Product img", expectedIMG, actualIMG);

        String expectedPrice = "$" + product.getPrice();

        String actualPrice = elementSteps.getProductPriceStr();
        CustomAssertions.isDetailEqual("Product price", expectedPrice, actualPrice);

        String expectedDescription = product.getDescription();

        String actualDescription = elementSteps.getProductDescription();
        CustomAssertions.isDetailEqual("Product description", expectedDescription, actualDescription);

        String url = driver.getCurrentUrl();
        String view = actualName + "Page";

        CustomAssertions.isElementDisplayed(productPage.getAddToCartBtn(), view, url);

    }

    @Test(groups = "Demoblaze", priority = 2)
    public void checkAlert() throws InterruptedException {

        elementSteps.clickAddToCartBTN();

        String expectedAlert = "Product added";
        String actualAlert = elementSteps.getAlertText();
        elementSteps.handleAlert("accept");

        CustomAssertions.isTextEqual(expectedAlert, actualAlert);
    }

}
