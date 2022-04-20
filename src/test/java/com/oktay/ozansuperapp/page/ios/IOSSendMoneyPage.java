package com.oktay.ozansuperapp.page.ios;

import com.oktay.ozansuperapp.page.constants.androidConstants.AndroidSendMoneyPageConstants;
import com.oktay.ozansuperapp.page.constants.iosConstants.IOSSendMoneyPageConstants;
import com.oktay.ozansuperapp.page.contracts.ISendMoneyPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSSendMoneyPage extends IOSSendMoneyPageConstants implements ISendMoneyPage {

    public IOSSendMoneyPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public ISendMoneyPage checkSendMoneyWithPhoneNumberPage() {
        return null;
    }
}
