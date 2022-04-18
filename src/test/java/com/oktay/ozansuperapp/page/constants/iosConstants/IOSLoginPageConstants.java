package com.oktay.ozansuperapp.page.constants.iosConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class IOSLoginPageConstants extends BasePageUtil {

    public IOSLoginPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By EMAIL_TEXTBOX = By.className("XCUIElementTypeTextField");
    protected final By PASSWORD_TEXTBOX = By.className("XCUIElementTypeSecureTextField");
    protected final By LOGINACTIONBUTTON = By.id("Giriş Yap");
    protected final By TRENDYOLOGO = By.id("newTrendyolLogo");
    protected final By LOGOUTBUTTON = By.id("Çıkış Yap");
    protected final By ERRORMESSAGE = By.id("Hata");
}
