package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();



    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {

        loginPage.login();

    }


    @Then("system should display {string} page")
    public void system_should_display_page(String tabName) {

        loginPage.verificationOfPage(tabName);


    }


    @When("user enters not valid credentials")
    public void user_enters_not_valid_credentials(Map<String,String> dataTable) {

        for (String eachKey : dataTable.keySet()) {
                loginPage.login(eachKey,dataTable.get(eachKey));
        }
    }


    @Then("system should display the message Login and-or password are wrong.")
    public void system_should_display_the_message_login_and_or_password_are_wrong() {



    }



}
