package web;

import config.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTests extends ApplicationManager {

    @Test
    public void loginPositiveTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickLoginLink().fillLogInPage();
    }
}
