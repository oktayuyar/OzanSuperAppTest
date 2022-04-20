package com.oktay.ozansuperapp.page.constants.androidConstants;

import com.oktay.ozansuperapp.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public class AndroidHomePageConstants extends BasePageUtil {

    public AndroidHomePageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By buttonSendMoneyQuickAction = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
    protected final By titleSelectTypeOfSendMoney = By.xpath("//*[@text='Gönderi Aracı Seçin']");
    protected final By buttonSendMoneyWithPhoneNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    protected final By buttonSendMoneyNext = By.id("com.ozan.android:id/buttonNext");

}
