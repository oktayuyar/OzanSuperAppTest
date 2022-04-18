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

    public ILoginPage login(String email, String password) {
        Assert.assertTrue(isElementDisplayed(TRENDYOLOGO),
                "Trendyol logosu görüntülenemedi!");
        setText(EMAIL_TEXTBOX, email);
        setText(PASSWORD_TEXTBOX, password);
        clickElement(LOGINACTIONBUTTON);
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }

    public IHomePage checkSuccessfulLogin() {
        Assert.assertTrue(isElementDisplayed(LOGOUTBUTTON),
                "Çıkış yap butonu görüntülenemedi!");
        clickElement(LOGOUTBUTTON);
        return PageFactory.getInstance().createPage(IHomePage.class);
    }

    public ILoginPage checkUnsuccessfulLogin() {
        Assert.assertTrue(isElementDisplayed(ERRORMESSAGE),
                "Hata uyarısı görüntülenemedi!");
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
