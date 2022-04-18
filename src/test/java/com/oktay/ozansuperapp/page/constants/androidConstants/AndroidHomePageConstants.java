package com.oktay.ozansuperapp.page.constants.androidConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class AndroidHomePageConstants extends BasePageUtil {

    public AndroidHomePageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By SEARCHTEXTVIEW= By.id("trendyol.com:id/edittext_search_view");
    protected final By ACCOUNTBUTTON= By.id("trendyol.com:id/tab_account");
    protected final By LOGINBUTTON = By.id("trendyol.com:id/btnBasketGuestLogin");


}