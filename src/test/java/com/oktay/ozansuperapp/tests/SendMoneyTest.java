package com.oktay.ozansuperapp.tests;

import com.oktay.ozansuperapp.base.PageFactory;
import com.oktay.ozansuperapp.page.contracts.IHomePage;
import com.oktay.ozansuperapp.page.contracts.ISendMoneyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/*
 *  Created by oktayuyar on 15.04.2022
 */

public class SendMoneyTest {

    @When("Select send money with phone number")
    public void selectSendMoneyWithPhoneNumber() {
        createPage(IHomePage.class).openSendMoneyWithPhoneNumberPage();
    }

    @Then("Check send money with phone number page")
    public void checkSendMoneyWithPhoneNumberPage() {
        createPage(ISendMoneyPage.class).checkSendMoneyWithPhoneNumberPage();
    }

    @Then("Check send money with missing phone number")
    public void checkSendMoneyWithMissingPhoneNumber() {
        createPage(ISendMoneyPage.class).sendMoneyWithMissingPhoneNumber();
    }

    @Then("Check send money with invalid phone number")
    public void checkSendMoneyWithInvalidPhoneNumber() {
        createPage(ISendMoneyPage.class).sendMoneyWithInvalidPhoneNumber();
    }

    private <T> T createPage(Class<T> pageType) {
        return PageFactory.getInstance().createPage(pageType);
    }



}
