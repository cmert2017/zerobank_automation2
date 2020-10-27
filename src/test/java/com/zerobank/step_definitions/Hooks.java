package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void scenarioSetup(){

        System.out.println("::: ^_^ Empty hook before scenario ^_^ :::");

    }

    @BeforeStep
    public void stepSetup(){

        System.out.println("::: ^_^ Empty hook before step ^_^ :::");

    }


    @AfterStep
    public void stepTearDown(){
        System.out.println("::: ^_^ Empty hook before step ^_^:::");
    }


    @After
    public void scenarioTearDown(){
        System.out.println("::: ^_^ Empty hook before scenario ^_^:::");
        Driver.getDriver().close();
    }
}
