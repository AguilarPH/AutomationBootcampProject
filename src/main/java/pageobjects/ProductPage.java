package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(how = How.XPATH, using = "//div[@class='product-content product-wrap clearfix product-deatil']")
    private WebElement productContent;

    public WebElement getProductContent(){
        return productContent;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='product-content product-wrap clearfix product-deatil']//h2[@class='name']")
    private WebElement productName;

    public WebElement getProductName(){
        return productName;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='product-image']//img")
    private WebElement productIMG;

    public WebElement getProductIMG(){
        return productIMG;
    }

    @FindBy(how = How.XPATH, using = "//h3[@class='price-container']")
    private WebElement productPrice;

    public WebElement getProductPrice(){
        return productPrice;
    }

    @FindBy(how = How.ID, using = "more-information")
    private WebElement productDescription;

    public WebElement getProductDescription() {
        return productDescription;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='product-content product-wrap clearfix product-deatil']//a[contains(text(), 'Add to cart')]")
    private WebElement addToCartBtn;

    public WebElement getAddToCartBtn(){
        return addToCartBtn;
    }
}
