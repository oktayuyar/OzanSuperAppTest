package com.oktay.ozansuperapp.page.ios;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.constants.iosConstants.IOSHomePageConstants;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class IOSHomePage extends IOSHomePageConstants implements IHomePage {

    public IOSHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage callLoginPage() {
        Assert.assertTrue(isElementDisplayed(HOMEPAGETAB),
                "Anasayfa tabı görüntülenemedi!");
        clickElement(ACCOUNTBUTTON);
        Assert.assertTrue(getText(LOGINBUTTON).equalsIgnoreCase("Giriş Yap"),
                "Giriş Yap görüntülenemedi!");
        clickElement(LOGINBUTTON);
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
