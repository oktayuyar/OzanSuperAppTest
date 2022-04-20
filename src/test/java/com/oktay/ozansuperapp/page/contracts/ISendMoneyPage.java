package com.oktay.ozansuperapp.page.contracts;

/*
 *  Created by oktayuyar on 18.04.2022
 */
public interface ISendMoneyPage {

    ISendMoneyPage checkSendMoneyWithPhoneNumberPage();

    ISendMoneyPage sendMoneyWithMissingPhoneNumber();

    ISendMoneyPage sendMoneyWithInvalidPhoneNumber();
}
