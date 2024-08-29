package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        setDriver(driver);
        driver.get("https://www.demoblaze.com");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(id = "signin2")
    WebElement signUpLink;

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    WebElement welcomeUser;
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement clickToCartPage;
    @FindBy(xpath = "//a[.='Phones']")
    WebElement clickBtnPhones;

    @FindBy(xpath = "//a[.='Laptops']")
    WebElement clickBtnLaptops;

    @FindBy(xpath = "//a[.='Monitors']")
    WebElement clickBtnMonitors;

    public HomePage waitWelcome() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(welcomeUser));
        return this;
    }

    public RegistrationPage clickSignUpLink() {
        signUpLink.click();
        return new RegistrationPage(driver);
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return new LoginPage(driver);
    }

    public CartPage clickBtnCartPage() {
        clickToCartPage.click();
        return new CartPage(driver);
    }

    public PhonesPage goToCategoriaPhones() {
        pause(2);
        clickBtnPhones.click();
        return new PhonesPage(driver);
    }

    public LaptopsPage goToCategoriaLaptops() {
        pause(2);
        clickBtnLaptops.click();
        return new LaptopsPage(driver);
    }

    public MonitorsPage goToCategoriaMonitors() {
        pause(2);
        clickBtnMonitors.click();
        return new MonitorsPage(driver);
    }
    @FindBy(xpath = "//div[@id='tbodyid']/div[2]")
    WebElement gadjets;
    public  void clickGadjet() {
        gadjets.click();
        new AddToCartPage(driver); ;

    }
    @FindBy(xpath = "//a[.='Add to cart']")
    WebElement btnAddToCart;
    public HomePage BtnAddToCart() {
        btnAddToCart.click();
        Alert alert=new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
        return new HomePage(driver);
    }

    @FindBy(xpath = "//button[.='Place Order']")
    WebElement clickOnBtnPlaceOrder;
    public PlaceOrderPage clickBtnPlaceOrder() {
        clickOnBtnPlaceOrder.click();
        return new PlaceOrderPage(driver);
    }

}