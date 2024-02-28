package com.zebrunner.carina.demo.facebook;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends AbstractPage {

    @FindBy (xpath = "//*[@data-testid='royal_email']")
    private ExtendedWebElement emailField;

    @FindBy( xpath = "//*[@name='did_submit']")
    private ExtendedWebElement searchButton;

    @FindBy (xpath = "//*[text()='No Search Results']")
    private ExtendedWebElement noSearchResultField;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
    }

    public void typeInvalidEmail(String email){
        emailField.type(email);
        searchButton.click();
    }

    public String noSearchResultText(){
        String text = noSearchResultField.getText();
        return text;
    }
}
