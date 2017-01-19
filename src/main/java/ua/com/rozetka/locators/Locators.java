package ua.com.rozetka.locators;

import org.openqa.selenium.By;

public final class Locators {

    public static final String URL = "http://rozetka.com.ua";

    public static final By PHONES_TV_ELECTRONICS_LINK = By.linkText("Телефоны, ТВ и электроника");

    public static final By SMARTPHONES_LINK = By.xpath("//li[@class='f-menu-sub-l-i']/a[contains(text(), 'Смартфоны')]");

    public static final By PRELOADER_BUTTON = By.className("preloader-animation");

    public static final By ACTIVE_PAGES = By.cssSelector(".paginator-catalog-l-i.active span");

    public static final By POPULARITY_SMARTPHONES_NAMES = By.xpath("//i[@class='g-tag g-tag-icon-middle-popularity sprite']/../../../..//div[@class='g-i-tile-i-title clearfix']/a");

    public static final By POPULARITY_SMARTHONES_PRICES = By.xpath("//i[@class='g-tag g-tag-icon-middle-popularity sprite']/../../../..//div[@class='g-price-uah']");

}
