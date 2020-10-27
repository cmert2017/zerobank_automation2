package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommonStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        loginPage.navigateToLoginPage();


    }

}
