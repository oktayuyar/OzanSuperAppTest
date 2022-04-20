package com.oktay.ozansuperapp.page.constants.androidConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 18.04.2022
 */
public class AndroidSendMoneyPageConstants extends BasePageUtil {

    public AndroidSendMoneyPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final String titleSendMoney  = "Para Gönder";
    protected final String pageHeader  = "Telefon Numarası";
    protected final String missingPhoneNumber  = "53422";
    protected final String invalidPhoneNumber  = "1372987120";
    protected final By buttonClose = By.id("com.ozan.android:id/imageViewActionButton");
    protected final By buttonBack = By.id("com.ozan.android:id/imageViewBackButton");
    protected final By textTitleSendMoney = By.id("com.ozan.android:id/textViewTitle");
    protected final By textPageHeader = By.id("com.ozan.android:id/textViewHeader");
    protected final By inputCountryCode = By.id("com.ozan.android:id/inputLayoutCountry");
    protected final By inputPhoneNumber = By.id("com.ozan.android:id/editTextPhoneNumber");
    protected final By buttonContacts = By.id("com.ozan.android:id/imageViewContacts");
    protected final By buttonContinue = By.id("com.ozan.android:id/buttonContinue");

}
