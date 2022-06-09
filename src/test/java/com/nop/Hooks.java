package com.nop;

import com.nop.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.myBrowser();
        driverManager.maxBrowser();
    }@After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
