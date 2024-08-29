package web;

import config.ApplicationManager;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

public class RegistrationTest extends ApplicationManager {

    @Test
    public void registrationPositive() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSignUpLink()
                .fillRegistrationPage();
        BasePage.pause(3);

    }

}