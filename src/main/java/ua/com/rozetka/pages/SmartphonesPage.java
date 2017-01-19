package ua.com.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.com.rozetka.locators.Locators;

import java.util.List;

import static ua.com.rozetka.locators.Locators.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfElementsToBe;

public class SmartphonesPage extends AbstractBasePage {

    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public SmartphonesPage pagesToLoad(int count){
        for(int pageNumber = 2; pageNumber <= count; pageNumber++) {
            assertThat(elementToBeClickable(PRELOADER_BUTTON)).click();
            assertThat(numberOfElementsToBe(ACTIVE_PAGES, pageNumber));
        }
        return new SmartphonesPage(driver);
    }

    public List<WebElement> getPopularitySmartphoneNames(){
        return findElements(Locators.POPULARITY_SMARTPHONES_NAMES);
    }

    public List<WebElement> getPopularitySmartphonePrices(){
        return findElements(Locators.POPULARITY_SMARTHONES_PRICES);
    }
}
