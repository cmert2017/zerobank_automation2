package com.zerobank.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    static WebDriverWait wait =  new WebDriverWait(Driver.getDriver(),20);



    public static void wait(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    public static void clickOnElement(WebElement element){

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


    public static void waitUntilVisibilityOfElement(WebElement element){

        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

        wait.until(ExpectedConditions.visibilityOf(element));

    }





    public static void clickWithJS(WebElement element){

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

        wait.until(ExpectedConditions.elementToBeClickable(element));

        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].click()", element);

    }


    public static void enterText(WebElement element, String text){

        //WebDriverWait wait =  new WebDriverWait(Driver.getDriver(),20);

        element.clear();
        element.sendKeys(text);

        //wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering text: "+text);
    }





}
