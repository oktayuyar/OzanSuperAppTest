package com.oktay.ozansuperapp.page.android;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.constants.androidConstants.AndroidHomePageConstants;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class AndroidHomePage extends AndroidHomePageConstants implements IHomePage {

    public AndroidHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage callLoginPage() {
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
