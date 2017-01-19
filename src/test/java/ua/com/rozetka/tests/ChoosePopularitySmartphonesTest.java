package ua.com.rozetka.tests;

import org.junit.Test;
import ua.com.rozetka.config.InsertToDB;
import ua.com.rozetka.pages.HomePage;
import ua.com.rozetka.pages.SmartphonesPage;

public class ChoosePopularitySmartphonesTest extends AbstractBaseTest {

    private HomePage homePage = new HomePage(driver);
    private SmartphonesPage smartphonesPage = new SmartphonesPage(driver);

    @Test
    public void testChoosePopularitySmartphones(){
        homePage.visit();

        homePage.goToPhonesTVElectronics();
        homePage.goToSmartphones();

        smartphonesPage.pagesToLoad(3);

        InsertToDB.popularitySmartphones(
                smartphonesPage.getPopularitySmartphoneNames(),
                smartphonesPage.getPopularitySmartphonePrices()
        );
    }
}
