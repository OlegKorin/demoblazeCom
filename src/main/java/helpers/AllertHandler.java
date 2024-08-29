package helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AllertHandler {
    private WebDriver driver;

    public AllertHandler(WebDriver driver) {
        this.driver = driver;
    }

    public static void handleAlert(Alert alert, String expectedText) {

        if (alert != null) {
        //    String alertText = alert.getText();
        //    System.out.println("Alert text : " + alertText);
            alert.accept();


        } else {
            System.out.println("There is no alert window....");

        }
    }
}