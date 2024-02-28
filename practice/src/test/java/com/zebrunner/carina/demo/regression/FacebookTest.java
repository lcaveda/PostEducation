package com.zebrunner.carina.demo.regression;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.facebook.FbLoginPage;
import com.zebrunner.carina.demo.facebook.ForgotPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest implements IAbstractTest {

    @Test
    public void forgetPasswordTest(){

        FbLoginPage fbLoginPage = new FbLoginPage(getDriver());
        fbLoginPage.open();

        Assert.assertTrue(fbLoginPage.isPageOpened(),"The page is not open");

        ForgotPasswordPage forgotPasswordPage = fbLoginPage.clickOnForgetPassword();
        forgotPasswordPage.typeInvalidEmail("sdlgjhasd");

        Assert.assertEquals(forgotPasswordPage.noSearchResultText(), "No Search Results");
    }
}
