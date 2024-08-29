package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class PurchasePage extends BasePage {
    @FindBy(xpath = "//p[@class='lead text-muted ']")
    WebElement alertInscription;

    public PurchasePage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public static void getAlertInscription() {
        String z = null;
        System.out.println("Step10");
        List<WebElement> inscription= driver.findElements(By.xpath("//p[@class='lead text-muted ']"));
        for (WebElement x : inscription) {
            z= x.getText();
        }
        int d = z.lastIndexOf(':');
        String y = z.substring(d);
        String pr = y.replaceAll("[:]", "").trim();
        System.out.println("pr     "+pr);
        System.out.println("d    "+d);
        try {
            Date date = new Date();
//                LocalDate localDate = LocalDate.now();
//                System.out.println(localDate);
            SimpleDateFormat formatter = new SimpleDateFormat("d/M/YYYY");
            String message = formatter.format(date);
            System.out.println(message);
            if(message.equalsIgnoreCase(pr)){
                System.out.println("Даты одинаковы ");
            }else {
                System.out.println("Даты не равны");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



