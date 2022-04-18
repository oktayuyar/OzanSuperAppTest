package com.oktay.ozansuperapp.tests;

import com.oktay.ozansuperapp.base.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class BaseTest {

    public AppiumDriver<MobileElement> driver;

    public AppiumDriver getDriver() {
        return driver;
    }

    private boolean localAndroid = true;

    @Before
    public void setUp() {
        String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
        try {
            // 1. Create a AppiumDriver
            // 1.1 Set the capabilities of the driver
            DesiredCapabilities capabilities = new DesiredCapabilities();

            if (localAndroid) {

                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android SDK built for x86");
                capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.messaging");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.messaging.ui.ConversationListActivity");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                driver = new AndroidDriver<MobileElement>(new URL(APPIUM_SERVER_URL), capabilities);
                System.out.println("Android Driver Created");

            } else {

                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability("sendKeyStrategy", "setValue");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "testinium’s iPhone");
                capabilities.setCapability(MobileCapabilityType.UDID, "ec8fa4d8464e1bdf69f877bf66953167417e1ccb");
                capabilities.setCapability("useNewWDA", false);
                capabilities.setCapability("bundleId", "trendyol.com.trendyol");
                driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                System.out.println("IOS Driver Created");

            }
            PageFactory.getInstance().setDriver(driver);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException("Error in creating Appium Driver");
        }
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File screenShotName = new File("src/test/resources/screenshots/" + scenario.getName() +"_"+ timeStamp + ".png");
            try {
                FileUtils.copyFile(scrFile, screenShotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
