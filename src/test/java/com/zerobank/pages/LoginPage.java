package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(xpath = "//button[@class='signin btn btn-info']")
    private WebElement signInBtn;


    @FindBy(xpath = "//input[@name='user_login']")
    private WebElement userInputBox;

    @FindBy(xpath = "//input[@name='user_password']")
    private WebElement passwordInputBox;

    @FindBy(xpath="//input[@name='submit']")
    private  WebElement submitSignInBtn;


    public void login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("zerobank_url"));

        BrowserUtils.clickOnElement(signInBtn);

        BrowserUtils.enterText(userInputBox,ConfigurationReader.getProperty("username"));
        BrowserUtils.enterText(passwordInputBox,ConfigurationReader.getProperty("password"));

        BrowserUtils.clickOnElement(submitSignInBtn);

    }



    public void login(String username, String password){

        Driver.getDriver().get(ConfigurationReader.getProperty("browser"));

        BrowserUtils.clickOnElement(signInBtn);

        BrowserUtils.enterText(userInputBox,ConfigurationReader.getProperty("username"));
        BrowserUtils.enterText(passwordInputBox,ConfigurationReader.getProperty("password"));

        BrowserUtils.clickOnElement(submitSignInBtn);

    }

}
