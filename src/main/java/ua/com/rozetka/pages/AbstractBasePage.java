package ua.com.rozetka.pages;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class AbstractBasePage {

    protected WebDriver driver;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void open(String url){
        driver.get(url);
    }

    protected void hover(By locator){
        Actions action = new Actions(driver);
        action.moveToElement(findElement(locator));
        action.perform();
    }

    protected <V> V assertThat(Function<? super WebDriver, V> condition){
        return (new WebDriverWait(driver, 10)).until(condition);
    }

    protected WebElement findElement(By locator){
        assertThat(visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    protected List<WebElement> findElements(By locator){
        assertThat(visibilityOfElementLocated(locator));
        return driver.findElements(locator);
    }
}
