package com.oktay.ozansuperapp.page.constants.androidConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class AndroidLoginPageConstants extends BasePageUtil {

    public AndroidLoginPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By EMAIL_TEXTBOX = By.id("trendyol.com:id/tyValidationTextEmail");
    protected final By PASSWORD_TEXTBOX = By.id("trendyol.com:id/tyValidationTextPassword");
    protected final By LOGINACTIONBUTTON = By.id("trendyol.com:id/btnTYLogin");
    protected final By COMPANYNAMETOOLBAR = By.id("trendyol.com:id/activity_authentication_toolbar");
    protected final By LOGOUTBUTTON = By.id("trendyol.com:id/tvLogout");
    protected final By ERRORMESSAGE = By.id("trendyol.com:id/snackbar_text");
}
