package com.ozdilekteyim.odev.selector;

import org.openqa.selenium.By;

public class Selector {

    public static By CHECK_APPLICATION_WORK = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingMarket");
    public static By CLICK_START_SHOPPING = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static By CHECK_MAIN_PAGE = By.id("com.ozdilek.ozdilekteyim:id/tvMarketName");
    public static By OPEN_CATEGORY_PAGE = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static By CHECK_CATEGORY_PAGE = By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']/android.widget.TextView");
    public static By CLICK_KADIN = By.xpath("//android.widget.RelativeLayout[@index='1']");
    public static By CLICK_PANTS = By.xpath("//android.widget.RelativeLayout[@index='3']");
    public static By RANDOM_PRODUCT_SELECT = By.id("com.ozdilek.ozdilekteyim:id/recyclerView");
    public static By CHECK_PRODUCT_DETAILS = By.id("com.ozdilek.ozdilekteyim:id/tvColorDesc");
    public static By ADD_FAV= By.id("com.ozdilek.ozdilekteyim:id/relLayFav");
    public static By CHECK_LOGIN_PAGE = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");
    public static By EMAIL_BOX = By.id("com.ozdilek.ozdilekteyim:id/etEposta");
    public static By PASSWORD_BOX = By.id("com.ozdilek.ozdilekteyim:id/etPassword");
    public static String EMAIL = "sabihagokcenn@mail.com.tr";
    public static String PASSWORD = "Sabihagokcen123";
    public static By BACK_TO_PAGE = By.id("com.ozdilek.ozdilekteyim:id/ivBack");

}
