package com.oktay.ozansuperapp.tests;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.cucumber.java.en.And;


/*
 *  Created by oktayuyar on 15.04.2022
 */
public class LoginTest {

    @And("^Uygulamanın alt menüsünden hesap seçeneğine tıklanır$")
    public void uygulamanınAltMenüsündenHesapSeçeneğineTıklanır() throws Throwable {
        createPage(IHomePage.class).callLoginPage();
    }

    @And("^Uygulamaya başarılı giriş için ([^\"]*) ve ([^\"]*) yazılır$")
    public void uygulamayaBaşarılıGirişIçinEmailVePasswordYazılır(String email, String password) throws Throwable {
        createPage(ILoginPage.class).login(email, password);
    }

    @And("^Uygulamaya başarısız giriş için \"([^\"]*)\" ve \"([^\"]*)\" yazılır$")
    public void uygulamayaBaşarısızGirişIçinVeYazılır(String email, String password) throws Throwable {
        createPage(ILoginPage.class).login(email, password);
    }

    @And("^Başarılı şekilde uygulamaya giriş yapıldığı kontrol edilir$")
    public void başarılıŞekildeUygulmaayaGirişYapıldığıKontrolEdilir() throws Throwable {
        createPage(ILoginPage.class).checkSuccessfulLogin();
    }

    @And("^Uygulamaya giriş yapılamadığı kontrol edilir$")
    public void uygulmaayaGirişYapılamadığıKontrolEdilir() throws Throwable {
        createPage(ILoginPage.class).checkUnsuccessfulLogin();
    }

    private <T> T createPage(Class<T> pageType) {
        return PageFactory.getInstance().createPage(pageType);
    }

}
