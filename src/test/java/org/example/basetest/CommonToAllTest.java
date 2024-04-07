package org.example.basetest;

import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {

    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start

    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }
}
