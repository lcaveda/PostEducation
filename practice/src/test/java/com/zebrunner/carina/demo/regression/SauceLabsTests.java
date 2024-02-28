package com.zebrunner.carina.demo.regression;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.sauceLabs.HomePage;
import com.zebrunner.carina.demo.sauceLabs.LoginPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabsTests implements IAbstractTest, IMobileUtils {


    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(),"The page is not open");

        HomePage homePage = loginPage.loginStandarUser();
        Assert.assertTrue(homePage.isPageOpened(),"The page is not open");

    }

    @Test
    public void failLoginTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        Assert.assertTrue(loginPage.isPageOpened(),"The page is not open");

        HomePage homePage = loginPage.loginStandarUser();
        Assert.assertFalse(homePage.isPageOpened(),"The page is open");

    }


    @Test
    public void addSmt2cart(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        Assert.assertTrue(loginPage.isPageOpened(),"The page is not open");

        HomePage homePage = loginPage.loginStandarUser();
        homePage.clickFirstItem();

        Assert.assertEquals(homePage.firstItemText(),"Remove");

    }

    @Test
    public void searchItem(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        Assert.assertTrue(loginPage.isPageOpened(),"The page is not open");

        HomePage homePage = loginPage.loginStandarUser();
    }

}
