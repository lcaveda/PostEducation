package com.zebrunner.carina.demo.facebook;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FbLoginPage extends AbstractPage {

    @FindBy (xpath = "//*[text()='Forgot password?']")
    private ExtendedWebElement forgotPasswordButton;

    public FbLoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.facebook.com/");
    }

    public ForgotPasswordPage clickOnForgetPassword(){
        forgotPasswordButton.click();
        return new ForgotPasswordPage(getDriver());
    }

}
