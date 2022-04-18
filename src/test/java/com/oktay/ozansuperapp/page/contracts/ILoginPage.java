package com.oktay.ozansuperapp.page.contracts;

/*
 *  Created by oktayuyar on 15.04.2022
 */
public interface ILoginPage {

    ILoginPage login(String email, String password);

    IHomePage checkSuccessfulLogin();

    ILoginPage checkUnsuccessfulLogin();
}
