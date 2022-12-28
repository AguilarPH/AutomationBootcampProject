package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage{

    public CartPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(how = How.ID, using = "tbodyid")
    private WebElement addedElements;
    public WebElement getAddedElements() {
        return addedElements;
    }

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover table-striped']")
    private WebElement cartTable;

    public WebElement getCartTable() {
        return cartTable;
    }

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover table-striped']//th[contains(text(), 'Pic')]")
    private WebElement picField;

    public WebElement getPicField(){return picField;}

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover table-striped']//th[contains(text(), 'Title')]")
    private WebElement titleField;

    public WebElement getTitleField(){return titleField;}

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover table-striped']//th[contains(text(), 'Price')]")
    private WebElement priceField;

    public WebElement getPriceField(){return priceField;}

    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered table-hover table-striped']//th[contains(text(), 'x')]")
    private WebElement deleteField;

    public WebElement getDeleteField(){return deleteField;}

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalPriceField;

    public WebElement getTotalPriceField(){return totalPriceField;}

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Place Order')]")
    private WebElement placeOrderBTN;

    public WebElement getPlaceOrderBTN(){return placeOrderBTN;}
}
