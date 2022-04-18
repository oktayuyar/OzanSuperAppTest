package com.oktay.ozansuperapp.page.constants.iosConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class IOSHomePageConstants extends BasePageUtil {

    public IOSHomePageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By HOMEPAGETAB= By.id("Anasayfa");
    protected final By ACCOUNTBUTTON= By.id("Hesabım");
    protected final By LOGINBUTTON = By.id("Giriş Yap");


}
