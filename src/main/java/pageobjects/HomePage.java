package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

    public HomePage(WebDriver webDriver) {super(webDriver);}

    @FindBy(how = How.ID, using = "cartur")
    private WebElement navigationCart;
    public WebElement getNavigationCart() {return navigationCart;}

    @FindBy(how = How.XPATH, using = "//div[@class='list-group']")
    private WebElement categoriesList;

    public WebElement getCategoriesList() {
        return categoriesList;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='list-group']/a[contains(text(), 'Phones')]")
    private WebElement categoriesPhones;

    public WebElement getCategoriesPhones() {
        return categoriesPhones;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='list-group']/a[contains(text(), 'Laptops')]")
    private WebElement categoriesLaptops;

    public WebElement getCategoriesLaptops() {
        return categoriesLaptops;
    }

    @FindBy(how = How.XPATH, using = "//div[@class='list-group']/a[contains(text(), 'Monitors')]")
    private WebElement categoriesMonitors;

    public WebElement getCategoriesMonitors() {
        return categoriesMonitors;
    }

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement samsungS6IMG;


    public WebElement getSamsungS6IMG() {return samsungS6IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=1']")
    private WebElement samsungS6Title;

    public WebElement getSamsungS6Title() {return samsungS6Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=2']")
    private WebElement nokiaLumia1520IMG;

    public WebElement getNokiaLumia1520IMG() {return nokiaLumia1520IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Nokia lumia 1520')]")
    private WebElement nokiaLumia1520Title;

    public WebElement getNokiaLumia1520Title() {return nokiaLumia1520Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=3']")
    private WebElement nexus6IMG;

    public WebElement getNexus6IMG() {return nexus6IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Nexus 6')]")
    private WebElement nexus6Title;

    public WebElement getNexus6Title() {return nexus6Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=4']")
    private WebElement samsungS7IMG;

    public WebElement getSamsungS7IMG() {return samsungS7IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Samsung galaxy s7')]")
    private WebElement samsungS7Title;

    public WebElement getSamsungS7Title() {return samsungS7Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=5']")
    private WebElement iphone6IMG;

    public WebElement getIphone6IMG() {return iphone6IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Iphone 6 32gb')]")
    private WebElement iphone6Title;

    public WebElement getIphone6Title() {return iphone6Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=6']")
    private WebElement sonyXperiaZ5IMG;

    public WebElement getSonyXperiaZ5IMG() {return sonyXperiaZ5IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Sony xperia z5')]")
    private WebElement sonyXperiaZ5Title;

    public WebElement getSonyXperiaZ5Title() {return sonyXperiaZ5Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=7']")
    private WebElement htcOneM9IMG;

    public WebElement getHtcOneM9IMG() {return htcOneM9IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'HTC One M9')]")
    private WebElement htcOneM9Title;

    public WebElement getHtcOneM9Title() {return htcOneM9Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=8']")
    private WebElement sonyVaioI5IMG;

    public WebElement getSonyVaioI5IMG() {return sonyVaioI5IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Sony vaio i5')]")
    private WebElement sonyVaioI5Title;

    public WebElement getSonyVaioI5Title() {return sonyVaioI5Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[@href='prod.html?idp_=9']")
    private WebElement sonyVaioI7IMG;

    public WebElement getSonyVaioI7IMG() {return sonyVaioI7IMG;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Sony vaio i7')]")
    private WebElement sonyVaioI7Title;

    public WebElement getSonyVaioI7Title() {return sonyVaioI7Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Apple monitor 24')]")
    private WebElement appleMonitor24Title;

    public WebElement getAppleMonitor24Title() {return appleMonitor24Title;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'MacBook air')]")
    private WebElement macbookAirTitle;

    public WebElement getMacbookAirTitle() {return macbookAirTitle;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'Dell i7 8gb')]")
    private WebElement dellI78GBTitle;

    public WebElement getDellI78GBTitle() {return dellI78GBTitle;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), '2017 Dell 15.6 Inch')]")
    private WebElement dell15_6InchTitle;

    public WebElement getDell15_6InchTitle() {return dell15_6InchTitle;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'ASUS Full HD')]")
    private WebElement asusFullHDTitle;

    public WebElement getAsusFullHDTitle() {return asusFullHDTitle;}

    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']//a[contains(text(), 'MacBook Pro')]")
    private WebElement macbookProTitle;

    public WebElement getMacbookProTitle() {return macbookProTitle;}

    @FindBy(how = How.ID, using = "prev2")
    private WebElement previousBtn;

    public WebElement getPreviousBtn() {return previousBtn;}

    @FindBy(how = How.ID, using = "next2")
    private WebElement nextBtn;

    public WebElement getNextBtn() {return nextBtn;}
}
