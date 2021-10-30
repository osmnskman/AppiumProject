package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import static com.ozdilekteyim.odev.selector.Selector.*;
import static com.ozdilekteyim.odev.selector.Selector.PASSWORD;

public class LoginPage extends BaseTest {
    @Step("CheckLoginPage")
    public void checkLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(Selector.checkLoginPage).getText();
        Assert.assertEquals("Giriş Yap", checkText);
        logger.info("Giriş Yap Sayfası Kontrol Ediliyor...");
    }

    @Step("WriteLoginBoxes")
    public void writeLoginBoxes() {
        appiumDriver.findElement(Email_Box).sendKeys(EMAIL);
        appiumDriver.findElement(Password_Box).sendKeys(PASSWORD);
        logger.info("Mail ve Şifre Giriliyor...");
    }
    @Step("BackToPage")
    public void backToPage() {
        appiumDriver.findElement(BACK_TO_PAGE).click();
        logger.info("Bir Önceki Sayfaya Gidiliyor");
    }
}
