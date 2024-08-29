package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PlaceOrderPage extends BasePage{

    @FindBy(xpath = "//input[@id='name']")
    WebElement fieldName;
    @FindBy(xpath = "//input[@id='country']")
    WebElement fieldCountry;
    @FindBy(xpath = "//input[@id='city']")
    WebElement fieldCity;
    @FindBy(xpath = "//input[@id='card']")
    WebElement fieldCreditCard;
    @FindBy(xpath = "//input[@id='month']")
    WebElement fieldMonthCard;
    @FindBy(xpath = "//input[@id='year']")
    WebElement fieldYearCard;
    @FindBy(xpath = "//button[.='Purchase']")
    WebElement btnPurchase;
    public PlaceOrderPage(WebDriver webDriver) {
        super();
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

   public PurchasePage fillFormPlaceOrder(){
        WaitElement(btnPurchase,10);
fieldName.sendKeys("Изя Изяславович ");
fieldCountry.sendKeys("Россия");
fieldCity.sendKeys("Белгород");
fieldCreditCard.sendKeys("123456789");
fieldMonthCard.sendKeys("01");
fieldYearCard.sendKeys("01");
pause(2);
btnPurchase.click();


       return new PurchasePage(driver);
   }

}
