package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.CartPage;
import steps.ElementSteps;
import steps.NavigationSteps;

import java.util.ArrayList;
import java.util.List;

public class CartTests extends BaseTest{
    ElementSteps elementSteps = new ElementSteps(driver);
    NavigationSteps navigationSteps = new NavigationSteps(driver);

    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

    @Test(description = "verify details on cart list of added items", groups = "Demoblaze", priority = 1)
    public void checkCartList() throws InterruptedException {
//        navigationSteps.navigateToURL("https://www.demoblaze.com");
        navigationSteps.waitForTitle("STORE");

        ProductName product = ProductName.NOKIA_LUMIA_1520;

        List<String> expectedCartNames = new ArrayList<>();
        List<Integer> expectedCartPrices = new ArrayList<>();
        int items = 0;
        int expectedTotalPrice = 0;

        elementSteps.clickProduct(product);

        expectedCartNames.add(product.getName());
        expectedCartPrices.add(product.getPrice());
        expectedTotalPrice += product.getPrice();

        elementSteps.clickAddToCartBTN();

        elementSteps.handleAlert("accept");
        items += 1;

        elementSteps.navigateToCart();

        List<String> actualCartList = elementSteps.getAddedProducts();
        List<String> actualCartNames = new ArrayList<>();
        List<String> actualCartPrices = new ArrayList<>();
        for (String item : actualCartList) {
            String[] productRow = item.split(" ");
            String name = null;
            int price = Integer.parseInt(productRow[(productRow.length - 1)]);
            for (int i=0; i<(productRow.length - 2);i++) {
                if (name == null){
                    name = productRow[i];
                }
                else {
                    name = name + " " +  productRow[i];
                }
            }
            actualCartNames.add(name);
            actualCartPrices.add(String.valueOf(price));
            actualCartPrices.add(productRow[(productRow.length - 2)]);

        }
        System.out.println("items: " + items + ", cart: " + actualCartNames.size());
        System.out.println(actualCartNames.get(items - 1));
        CustomAssertions.isListEqual(expectedCartNames, actualCartNames);
        CustomAssertions.isNumberEqual(expectedTotalPrice, elementSteps.getTotalCartPrice(), "Price");
    }

    @Test(groups = "Demoblaze", priority = 2, enabled = false)
    public void checkTotalPrice() {
    }

    @Test(groups = "Demoblaze", priority = 2)
    public void checkPlaceOrderBtn(){
        String url = navigationSteps.getURL();
        String view = "Cart";
        CustomAssertions.isElementDisplayed(cartPage.getPlaceOrderBTN(), view, url);
    }
}
