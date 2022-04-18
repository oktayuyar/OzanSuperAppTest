package com.oktay.ozansuperapp.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class BasePageUtil {

    public AppiumDriver<MobileElement> driver;

    public BasePageUtil(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void clickElement(By selector) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(selector)).click();
        } catch (Exception e) {
            Assert.fail(selector + " elementi bulunamadı!");
        }
    }

    public void setText(By selector, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(selector)).sendKeys(text);
        } catch (Exception e) {
            Assert.fail(selector + " elementi bulunamadı!");
        }
    }

    public String getText(By selector) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText();
        } catch (Exception e) {
            Assert.fail(selector + " elementi bulunamadı!");
        }
        return driver.findElement(selector).getText();
    }

    public boolean isElementDisplayed(By selector) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).isDisplayed();
        } catch (Exception e) {
            Assert.fail(selector + " elementi bulunamadı!");
        }
        return true;

    }

    public void closeKeyboard() {
        driver.navigate().back();
    }

}

