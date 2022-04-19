package com.oktay.ozansuperapp.page.android;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.constants.androidConstants.AndroidLoginPageConstants;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class AndroidLoginPage extends AndroidLoginPageConstants implements ILoginPage {

    public AndroidLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public ILoginPage login() {
        Assert.assertTrue(isElementDisplayed(buttonForgetMe), "Forget me button could not be displayed!");
        Assert.assertTrue(getText(textViewHeader).equals("Selam Oktay"), "Texts didn't match!");
        Assert.assertTrue(isElementDisplayed(buttonForgotPassword), "Forgot password button could not be displayed!");
        setText(inputPassword, password);
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }

    public IHomePage checkSuccessfulLogin() {
        Assert.assertTrue(isElementDisplayed(buttonHomePage), "Çıkış yap butonu görüntülenemedi!");
        return PageFactory.getInstance().createPage(IHomePage.class);
    }
}
