package web;

import config.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class FillPlaceOrderFormTest extends ApplicationManager {

    //6.Оформить заказ
//7.Убедиться что дата в конце заказа совпадает с датой в системе
    @Test
    public  void testFillPlaceOrder(){
        HomePage homePage= new HomePage(getDriver());
        homePage.clickLoginLink().fillLogInPage();
        int a =  homePage.goToCategoriaPhones().returnPrice();
        homePage.clickGadjet();
        int b=homePage.returnprice1Regex();
        homePage.BtnAddToCart();
        homePage .clickBtnCartPage().clickBtnPlaceOrder().fillFormPlaceOrder().getAlertInscription();

    }
}