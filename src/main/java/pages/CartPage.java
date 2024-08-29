package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.List;

public class CartPage extends BasePage {


    @FindBy(xpath = "//div[@class='table-responsive']//td")
    WebElement price;

    @FindBy(xpath = "//tbody[@id='tbodyid']//tr[1]")
    WebElement tovar1;


    public CartPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);

    }

    @FindBy(xpath = "//button[.='Place Order']")
    WebElement clickOnBtnPlaceOrder;
    public PlaceOrderPage clickBtnPlaceOrder() {
        clickOnBtnPlaceOrder.click();
        return new PlaceOrderPage(driver);
    }
    public static boolean comparePriceFromCart() {
        int p;
        int sum = 0;
        int summa = Integer.parseInt(driver.findElement(By.xpath("//h3")).getText());

        List<WebElement> tovarov = driver.findElements(By.xpath("//tbody[@id='tbodyid']"));
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='table-responsive']//td[3]"));
        for (WebElement x : prices) {
            System.out.println(x.getText());
            p = Integer.parseInt(x.getText());
            sum = sum + p;
        }
        System.out.println(sum);
        if (summa == sum) {
            System.out.println("Summi ravni");
            return true;
        } else {
            return false;
        }

    }
}











