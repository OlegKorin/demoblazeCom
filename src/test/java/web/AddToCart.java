package web;

import config.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class AddToCart extends ApplicationManager {
    SoftAssert softAssert= new SoftAssert();
@Test

// 3.Добавить в корзину по одному любому гаджету из каждой категории
//4.Сравнить цену из общего списка и с карточки товара
   public void  addToCartTest(){

    HomePage homePage= new HomePage(getDriver());
       homePage.clickLoginLink().fillLogInPage();
    int a =  homePage.goToCategoriaPhones().returnPrice();
    homePage.clickGadjet();
    int b=homePage.returnprice1Regex();
    homePage.BtnAddToCart();
    softAssert.assertTrue(a==b);
  //  Assert.assertTrue(a==b);

      a =  homePage.goToCategoriaLaptops().returnPrice();
      homePage.clickGadjet();
      b=homePage.returnprice1Regex();
      homePage.BtnAddToCart();

      softAssert.assertTrue(a==b);


        a =  homePage.goToCategoriaMonitors().returnPrice();
        homePage.clickGadjet();
        b=homePage.returnprice1Regex();
         homePage.BtnAddToCart();
    softAssert.assertTrue(a==b);
        //Assert.assertTrue(a==b);

    softAssert.assertAll();
   }

}
