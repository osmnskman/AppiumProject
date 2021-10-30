package com.ozdilekteyim.odev;

import com.ozdilekteyim.odev.pages.FirstPage;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.Wait;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import java.security.PublicKey;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.ozdilekteyim.odev.BaseTest.appiumDriver;
import static com.ozdilekteyim.odev.selector.Selector.*;
import static org.junit.Assert.assertEquals;


public class StepImplementation extends BaseTest {

    @Step("CheckApplicationWork")
    public void checkOpen() throws InterruptedException  {
        System.out.println("Uygulamanin Acildigi Kontrol Ediliyor...");
        Thread.sleep(3000);
        String checkText = appiumDriver.findElement(Selector.checkApplicationWork).getText();
        Assert.assertEquals("TESLİMAT BÖLGESİ SEÇ", checkText);
    }

    @Step("StarShopping")
    public void clickStartShopping() throws InterruptedException {
        System.out.println("Alisverise Basla Butonuna Tiklaniyor...");
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.clickStartShopping).click();
    }

    @Step("CheckMainPageText")
    public void checkMainPageText() throws InterruptedException {
        System.out.println("Alisveris Sayfasinin Acildigi Kontrol Ediliyor ...");
        Thread.sleep(2000);
        String checkText = appiumDriver.findElement(Selector.checkMainPageText).getText();
        Assert.assertEquals("Market", checkText);
    }

    @Step("OpenCategoryPage")
    public void openCategoryPage() throws InterruptedException {
        System.out.println("Kategoriler Sayfasinina Tiklaniyor...");
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.openCategoryPage).click();
    }

    @Step("CheckCategoryPage")
    public void checkCategoryPage() throws InterruptedException {
        System.out.println("Kategoriler Sayfasinin Acildigi Dogrulaniyor...");
        Thread.sleep(2000);
        String checkText = appiumDriver.findElement(Selector.checkCategoryPage).getText();
        Assert.assertEquals("Kategoriler", checkText);
    }

    @Step("ClickKadin")
    public void clickKadin() throws InterruptedException {
        System.out.println("Kategorilerden 'Kadin' Seciliyor...");
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.clickKadin).click();
    }

    @Step("ClickPantolon")
    public void clickPantolon() throws InterruptedException {
        System.out.println("Pantolon Kategorisi Seciliyor...");
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.clickPantolon).click();
    }

    @Step("ScrollDown")
    public void scrollDown() throws InterruptedException {
        System.out.println("Sayfayi Asagi Kaydiriliyor...");
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        Thread.sleep(1000);
    }

    @Step("SecondScrollDown")
    public void secondScrollDown() {
        System.out.println("Sayfayi Asagi Kaydiriliyor...");
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }


//Burada Random Seçim Değil Tıklama ile ürüne gidip akışı devam ettireceğim.

    public static By selectPants = By.id("com.ozdilek.ozdilekteyim:id/textView");

    @Step("RandomProductSelect")
    public void randomProductSelect() {
        System.out.println("Ürün Seciliyor...");
        randomSelect(RANDOM_PRODUCT_SELECT).click();
        Loger.info("Rasgele Bir Ürün Seçildi");
    }


    @Step("CheckProductDetail")
    public void checkProductDetail() throws InterruptedException {
        System.out.println("Urun Detay SZayfasi Kontrolü...");
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(Selector.checkProductDetail).getText();
        Assert.assertEquals("Renk:", checkText);
    }

    @Step("AddFav")
    public void addFav() throws InterruptedException {
        System.out.println("Kategorilerden 'Kadin' Seciliyor...");
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.addFav).click();
    }

    @Step("CheckLoginPage")
    public void checkLoginPage() throws InterruptedException {
        System.out.println("Giris Yap Sayfasi Kontrol Ediliyor...");
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(Selector.checkLoginPage).getText();
        Assert.assertEquals("Giriş Yap", checkText);
    }

    @Step("WriteLoginBoxes")
    public void writeLoginBoxes() {
        System.out.println("Mail ve Sifre Giriliyor...");
        appiumDriver.findElement(Email_Box).sendKeys(EMAIL);
        appiumDriver.findElement(Password_Box).sendKeys(PASSWORD);
    }

    @Step("BackToPage")
    public void backToPage() {
        System.out.println("Bir önceki sayfaya gidliyor...");
        appiumDriver.findElement(BACK_TO_PAGE).click();
    }



}

