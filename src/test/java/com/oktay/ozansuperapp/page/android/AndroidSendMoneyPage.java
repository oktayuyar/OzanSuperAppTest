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
        Assert.assertTrue(getText(textPageHeader).equals(pageHeader), "page header not match!");
        Assert.assertTrue(isElementDisplayed(inputCountryCode), "input country code could not be displayed!");
        Assert.assertTrue(isElementDisplayed(inputPhoneNumber), "input phone number could not be displayed!");
        Assert.assertTrue(isElementDisplayed(buttonContacts), "contacts button could not be displayed!");
        Assert.assertTrue(isElementDisplayed(buttonContinue), "continue button could not be displayed!");
        return PageFactory.getInstance().createPage(ISendMoneyPage.class);
    }

    @Override
    public ISendMoneyPage sendMoneyWithMissingPhoneNumber() {
        setText(inputPhoneNumber, missingPhoneNumber);
        Assert.assertFalse(isElementEnabled(buttonContinue), "continue button enabled!");
        return PageFactory.getInstance().createPage(ISendMoneyPage.class);
    }

    @Override
    public ISendMoneyPage sendMoneyWithInvalidPhoneNumber() {
        setText(inputPhoneNumber, invalidPhoneNumber);
        Assert.assertFalse(isElementEnabled(buttonContinue), "continue button enabled!");
        return PageFactory.getInstance().createPage(ISendMoneyPage.class);
    }


}
