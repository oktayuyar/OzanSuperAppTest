package com.oktay.ozansuperapp.page.android;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.constants.androidConstants.AndroidSendMoneyPageConstants;
import com.oktay.ozansuperapp.page.contracts.ISendMoneyPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 18.04.2022
 */
public class AndroidSendMoneyPage extends AndroidSendMoneyPageConstants implements ISendMoneyPage {

    public AndroidSendMoneyPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public ISendMoneyPage checkSendMoneyWithPhoneNumberPage() {
        Assert.assertTrue(isElementDisplayed(buttonClose), "close button could not be displayed!");
        Assert.assertTrue(isElementDisplayed(buttonBack), "back button could not be displayed!");
        Assert.assertTrue(getText(textTitleSendMoney).equals(titleSendMoney), "title not match!");
        return PageFactory.getInstance().createPage(ISendMoneyPage.class);
    }

}
