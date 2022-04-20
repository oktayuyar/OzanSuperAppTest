package com.oktay.ozansuperapp.page.constants.androidConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 18.04.2022
 */
public class AndroidSendMoneyPageConstants extends BasePageUtil {


    protected final String titleSendMoney  = "Para Gönder";
    protected final By buttonClose = By.id("com.ozan.android:id/imageViewActionButton");
    protected final By buttonBack = By.id("com.ozan.android:id/imageViewBackButton");
    protected final By textTitleSendMoney = By.id("com.ozan.android:id/textViewTitle");

    public AndroidSendMoneyPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
