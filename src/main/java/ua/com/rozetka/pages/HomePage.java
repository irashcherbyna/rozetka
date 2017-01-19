package ua.com.rozetka.pages;

import org.openqa.selenium.WebDriver;
import static ua.com.rozetka.locators.Locators.*;

public class HomePage extends AbstractBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage visit(){
        open(URL);
        return new HomePage(driver);
    }

    public HomePage goToPhonesTVElectronics(){
        hover(PHONES_TV_ELECTRONICS_LINK);
        return new HomePage(driver);
    }

    public HomePage goToSmartphones(){
        findElement(SMARTPHONES_LINK).click();
        return new HomePage(driver);
    }
}
