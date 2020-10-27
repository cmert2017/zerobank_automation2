package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
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

    @FindBy(xpath = "//div[@class='alert alert-error']")
    private WebElement errorMessage;


    @FindBy(tagName = "h3")
    private WebElement errorHeader;



    public void login(){

        BrowserUtils.enterText(userInputBox,ConfigurationReader.getProperty("username"));
        BrowserUtils.enterText(passwordInputBox,ConfigurationReader.getProperty("password"));

        BrowserUtils.clickOnElement(submitSignInBtn);

    }



    public void negativeScenarioLogin(String username, String password){

        BrowserUtils.enterText(userInputBox,username);
        BrowserUtils.enterText(passwordInputBox,password);

        BrowserUtils.clickOnElement(submitSignInBtn);

    }



    public void checkErrorMessage(){

        BrowserUtils.waitUntilVisibilityOfElement(errorMessage);
        Assert.assertTrue("Error message is not Displayed!",errorMessage.isDisplayed());
        System.out.println("Error message is displayed successfully");

    }

    public void checkErrorHeaderMessage(){

        BrowserUtils.waitUntilVisibilityOfElement(errorHeader);
        Assert.assertTrue("Error header message is not Displayed!",errorHeader.isDisplayed());
        System.out.println("Error header message is displayed successfully");

    }


    public void navigateToLoginPage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("zerobank_url"));
        BrowserUtils.clickOnElement(signInBtn);

    }


}
