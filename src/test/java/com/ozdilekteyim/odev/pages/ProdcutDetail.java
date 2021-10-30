package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ProdcutDetail extends BaseTest {
    @Step("ScrollDown")
    public void scrollDown() throws InterruptedException {
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
        logger.info("Sayfa Aşağı Kaydırılıyor");
    }

    @Step("SecondScrollDown")
    public void secondScrollDown() {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        logger.info("Sayfa Aşağı Kaydırıylıyor...");
    }

    @Step("RandomProductSelect")
    public void randomProductSelect() throws InterruptedException {
        Thread.sleep(2000);
        randomSelect(Selector.RANDOM_PRODUCT_SELECT).click();
        logger.info("Ürün Seçiliyor...");
    }

    @Step("CheckProductDetail")
    public void checkProductDetail() throws InterruptedException {
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(Selector.checkProductDetail).getText();
        Assert.assertEquals("Renk:", checkText);
        logger.info("Ürün Detay Sayfasi Kontrolü");
    }

    @Step("AddFav")
    public void addFav() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.addFav).click();
        logger.info("Kategorilerden 'Kadın' Seçiliyor...");
    }
}
