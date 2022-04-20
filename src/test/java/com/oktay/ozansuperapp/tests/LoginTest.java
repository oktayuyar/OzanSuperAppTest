package com.oktay.ozansuperapp.tests;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.contracts.ILoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


/*
 *  Created by oktayuyar on 15.04.2022
 */
public class LoginTest {

    @Given("Login to ozan super app")
    public void loginToOzanSuperApp() {
        createPage(ILoginPage.class).login();
    }

    @And("Check the successful login to app")
    public void checkTheSuccessfulLoginToApp() {
        createPage(ILoginPage.class).checkSuccessfulLogin();
    }

    private <T> T createPage(Class<T> pageType) {
        return PageFactory.getInstance().createPage(pageType);
    }

}
