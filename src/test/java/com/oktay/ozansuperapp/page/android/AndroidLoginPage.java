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

    public ILoginPage login(String email, String password) {
        Assert.assertTrue(isElementDisplayed(COMPANYNAMETOOLBAR),
                "Trendyol yazısı görüntülenemedi!");
        setText(EMAIL_TEXTBOX,email);
        setText(PASSWORD_TEXTBOX,password);
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
        Assert.assertTrue(getText(ERRORMESSAGE).contains("Hatalı e-posta adresi ya da şifre"),
                "Hatalı e-posta adresi ya da şifre uyarısı görüntülenemedi!");
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
