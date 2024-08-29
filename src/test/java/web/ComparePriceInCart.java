package web;

import config.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class ComparePriceInCart extends ApplicationManager {
    private WebDriver driver;
    AddToCart addToCart=new AddToCart();


    @BeforeMethod
    public void setUpCompare(){
         //  addToCart.addToCartTest();   //  почему когда я делаю ссылку на сам тестовый метод он не работает?
        HomePage homePage= new HomePage(getDriver());
        homePage.clickLoginLink().fillLogInPage();
        int a =  homePage.goToCategoriaPhones().returnPrice();
        homePage.clickGadjet();
        int b=homePage.returnprice1Regex();
        homePage.BtnAddToCart();
        // Assert.assertTrue(a==b);

        a =  homePage.goToCategoriaMonitors().returnPrice();
        homePage.clickGadjet();
        b=homePage.returnprice1Regex();
        homePage.BtnAddToCart();
        //Assert.assertTrue(a==b);


        //к тесту addToCartTest() добавил кнопку перейти в корзину
        // HomePage homePage= new HomePage(getDriver());
        homePage .clickBtnCartPage();
    }
    @Test
    public void testCompare() throws InterruptedException {
        Thread.sleep(2000);
        CartPage.comparePriceFromCart();
    }
    @AfterMethod
    public void close(){
        HomePage homePage= new HomePage(getDriver());
    }
}
