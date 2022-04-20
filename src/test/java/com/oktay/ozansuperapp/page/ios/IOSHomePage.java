package com.oktay.ozansuperapp.page.ios;

import com.oktay.ozansuperapp.page.constants.iosConstants.IOSHomePageConstants;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ISendMoneyPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class IOSHomePage extends IOSHomePageConstants implements IHomePage {

    public IOSHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public ISendMoneyPage openSendMoneyWithPhoneNumberPage() {
        return null;
    }


}
