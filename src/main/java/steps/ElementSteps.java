package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CartPage;
import pageobjects.HomePage;
import pageobjects.ProductPage;
import tests.ProductName;

import java.util.ArrayList;
import java.util.List;

public class ElementSteps extends BaseSteps{
    public ElementSteps(WebDriver webDriver) {super(webDriver);}
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);

    public List<String> getCategoriesChildren() {
//        waitForElement(homePage.getCategoriesList());
        List<String> actualCategories = new ArrayList<>();
        List<WebElement> children = homePage.getCategoriesList().findElements(By.xpath("./child::*"));
        for (WebElement child : children) {
            actualCategories.add(child.getText());
            System.out.println(child.getText());
        }
        return actualCategories;
    }

    public void clickProduct(ProductName product) {
        try {
            switch (product) {
                case SAMSUNG_GALAXY_S6:
                    homePage.getSamsungS6Title().click();
                    break;
                case NOKIA_LUMIA_1520:
                    homePage.getNokiaLumia1520Title().click();
                    break;
                case NEXUS_6:
                    homePage.getNexus6Title().click();
                    break;
                case SAMSUNG_GALAXY_S7:
                    homePage.getSamsungS7Title().click();
                    break;
                case IPHONE_6_32GB:
                    homePage.getIphone6Title().click();
                    break;
                case SONY_XPERIA_Z5:
                    homePage.getSonyXperiaZ5Title().click();
                    break;
                case HTC_ONE_M9:
                    homePage.getHtcOneM9Title().click();
                    break;
                case SONY_VAIO_I5:
                    homePage.getSonyVaioI5Title().click();
                    break;
                case SONY_VAIO_I7:
                    homePage.getSonyVaioI7Title().click();
                    break;
                case APPLE_MONITOR_24:
                    homePage.getAppleMonitor24Title().click();
                    break;
                case MACBOOK_AIR:
                    homePage.getMacbookAirTitle().click();
                    break;
                case DELL_I7_8GB:
                    homePage.getDellI78GBTitle().click();
                    break;
                case DELL_15_6_INCH:
                    homePage.getDell15_6InchTitle().click();
                    break;
                case ASUS_FULL_HD:
                    homePage.getAsusFullHDTitle().click();
                    break;
                case MACBOOK_PRO:
                    homePage.getMacbookProTitle().click();
                    break;
                default:
                    System.out.println("Product not existing");
                    break;
            }
        } catch (NoSuchElementException e) {
//            throw new RuntimeException(e);
            System.out.println("Product not visible in screen");
        }
//        waitForElement(productPage.getProductContent());
    }

    public String getProductName() {
        String productName = productPage.getProductName().getText();
        return productName;
    }

    public String getProductIMG() {
        String productIMG = productPage.getProductIMG().getAttribute("src");
        return productIMG;
    }

    public String getProductPriceStr() {
        String[] productPrice = productPage.getProductPrice().getText().split(" ");
        return productPrice[0];
    }

    public int getProductPriceInt() {
        String strPrice = productPage.getProductPrice().getText().replaceAll("[^0-9]", "");
        int price = Integer.parseInt(strPrice);
        return price;
    }

    public String getProductDescription() {
        String[] productDescription = productPage.getProductDescription().getText().split("\n");
        return productDescription[1];
    }

    public String getAddToCartBTN() {
        String btnText = productPage.getAddToCartBtn().getText();
        return btnText;
    }

    public void clickAddToCartBTN() throws InterruptedException {
        productPage.getAddToCartBtn().click();
        Thread.sleep(3000);
    }

    public String getAlertText() {
        Alert alert = webDriver.switchTo().alert();
        return alert.getText();
    }
    public void handleAlert(String alertHandling) {
        Alert alert = webDriver.switchTo().alert();
        if (alertHandling == "accept"){
            alert.accept();
        }
        else {
            alert.dismiss();
        }
    }

    public List<String> getAddedProducts() {
        List<String> addedProducts= new ArrayList<>();
        List<WebElement> cartList = cartPage.getAddedElements().findElements(By.xpath("./child::*"));

        for (WebElement product : cartList) {
            addedProducts.add(product.getText());
        }
        return addedProducts;
    }

    public void navigateToCart() {
        homePage.getNavigationCart().click();
        waitForElement(cartPage.getCartTable(), 1);
    }

    public int getTotalCartPrice() {
        int total = Integer.parseInt(cartPage.getTotalPriceField().getText());
        return total;
    }

}
