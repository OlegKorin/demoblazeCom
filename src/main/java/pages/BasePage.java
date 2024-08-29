package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver wd) {
        driver = wd;
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void WaitElement(WebElement element, int timeout){
        try{
            new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }
    public void clickWait(WebElement element, int time) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time))
                    .until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static boolean textTobePresentElement(WebElement element, String text, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            return wait.until(ExpectedConditions.textToBePresentInElement(element, text));

        } catch (TimeoutException e) {
            return false;
        }
    }
    @FindBy(xpath = "//div[@id='tbodyid']/div[2]//h5")
     WebElement price;
    public  int returnPrice(){
        pause(3);
        String pri = price.getText().trim();
        int pr= Integer.parseInt(pri.replaceAll("[$]",""));
        System.out.println(pr);
        return pr;
    }
    @FindBy(xpath = "//div[@id='tbodyid']//h3[@class='price-container']")
    WebElement price1;
    public int returnprice1Regex(){
        String pr1 = price1.getText();
        int pr2 = Integer.parseInt(pr1.replaceAll("[a-zA-Z,*$]", "").trim());
        System.out.println(pr2);
        pause(3);
//        if (pr.equalsIgnoreCase(pr1))
//            System.out.println("price is aqual");
//        else {
//            System.out.println("price is  not aqual");
        return pr2;
    }

}
