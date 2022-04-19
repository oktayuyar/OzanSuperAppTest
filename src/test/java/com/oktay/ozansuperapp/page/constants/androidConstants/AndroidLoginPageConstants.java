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

    protected final String password = "123456";
    protected final By buttonForgetMe = By.id("com.ozan.android:id/textViewForgetMe");
    protected final By textViewHeader = By.id("com.ozan.android:id/textViewHeader");
    protected final By inputPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
    protected final By buttonForgotPassword = By.id("com.ozan.android:id/textViewForgotPassword");
    protected final By buttonHomePage = By.id("com.ozan.android:id/bottomNavMain");

}
