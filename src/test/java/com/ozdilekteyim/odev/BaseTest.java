package com.ozdilekteyim.odev;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class BaseTest {
    public static AppiumDriver<MobileElement> appiumDriver;
    protected boolean localAndroid = true;

    public Logger logger = LogManager.getLogger(getClass().getName());

    public MobileElement randomSelect(By by){
        List<MobileElement> x = appiumDriver.findElements(by);
        int size = x.size();
        Random random = new Random();
        int randomProduct = random.nextInt(size);
        return x.get(randomProduct);
    }

    @BeforeScenario
    public void Education() throws MalformedURLException {
        if (localAndroid) {
            logger.info("Özdilekteyim Android Testi Başlatılıyor...");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities
                    .setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ozdilek.ozdilekteyim");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ozdilek.ozdilekteyim.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            appiumDriver = new AndroidDriver(url, desiredCapabilities);
        } else {
            System.out.println("IOS Cihazı Mevcut Degil");
        }

    }

    @AfterScenario
    public void afterScenario() {
        if (appiumDriver != null)
            appiumDriver.quit();
            logger.info("Test Bitiriliyor...");
    }



}
