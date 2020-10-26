package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public  void navigateTo(String tab){

        WebElement tabElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(tab)));
        wait.until(ExpectedConditions.elementToBeClickable(tabElement)).click();

    }

    public  void verificationOfPage(String tab){

        String expectedPage = tab;
        WebElement tabElement = Driver.getDriver().findElement(By.linkText(tab));

        String actualPage = wait.until(ExpectedConditions.visibilityOf(tabElement)).getText();
        Assert.assertEquals(expectedPage, actualPage);

    }






}


