package org.example.driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void init(){
        if (driver==null){
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--start-maximized");
            //options.addArguments("--guest");
           //options.addArguments("--user-data-dir=\"C:\\Pramod Dutta\\ATB5XSeleniumAutomationFramework\\");
            //edgeOptions.addArguments("--headless");

            driver=new ChromeDriver(options);

        }
    }
    public static void down(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
