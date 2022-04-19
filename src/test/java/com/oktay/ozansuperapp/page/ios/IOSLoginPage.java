package com.oktay.ozansuperapp.page.ios;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.constants.iosConstants.IOSLoginPageConstants;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class IOSLoginPage extends IOSLoginPageConstants implements ILoginPage {

    public IOSLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @Override
    public ILoginPage login() {
        return null;
    }

    @Override
    public IHomePage checkSuccessfulLogin() {
        return null;
    }
}
