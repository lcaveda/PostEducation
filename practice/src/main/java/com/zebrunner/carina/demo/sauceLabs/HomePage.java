package com.zebrunner.carina.demo.sauceLabs;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]")
    private ExtendedWebElement firstElement;

    @FindBy(xpath = "//android.widget.TextView[@text='REMOVE']")
    private ExtendedWebElement removeText;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstItem(){
        firstElement.click();
    }

    public String firstItemText(){
        String text = removeText.getText();
        return text;
    }


}
