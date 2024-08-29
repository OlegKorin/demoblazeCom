
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

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
    @FindBy(id = "sign-username")
    WebElement userName;

    @FindBy(id = "sign-password")
    WebElement password;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signUpButton;
    public HomePage fillRegistrationPage() {
        pause(3);
        userName.sendKeys("qwerty12345678901");
        password.sendKeys("qwerty12345678901");
        signUpButton.click();

        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
        return new HomePage(driver);
    }
}