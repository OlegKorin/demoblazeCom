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

public class AddToCart1Page extends BasePage {
    String email="jhghgfggfjg";
    @FindBy(xpath = "//div[@id='tbodyid']//h3[@class='price-container']")
    WebElement price1;
    @FindBy(xpath = "//a[.='Add to cart']")
    WebElement btnAddToCart;

    public AddToCart1Page(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }


//    public HomePage addToCart1(WebDriver driver) {
//
//        String pr1 = price1.getText();
//        pr1 = pr1.replaceAll("[a-zA-Z,*]", "").trim();
//        System.out.println(pr1);
//        pause(3);
//        if (pr.equalsIgnoreCase(pr1))
//            System.out.println("price is aqual");
//        else {
//            System.out.println("price is  not aqual");
//            btnAddToCart.click();
//            Alert alert=new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
//            alert.accept();
//
//        }
//
//        return new HomePage(driver);
//    }
}