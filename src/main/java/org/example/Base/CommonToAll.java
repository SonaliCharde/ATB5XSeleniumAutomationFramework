package org.example.Base;

import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.DriverManager.getDriver;


public class CommonToAll {
    public CommonToAll() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }
    public void openVWOLoginURL(){
        getDriver().get(PropertyReader.readyKey("key"));
    }

    //This is common to all pages
    public void clickElement(By by){
    getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }

    // Wait Explicits here

    public WebElement presenseOfElement(By elementlocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until
                (ExpectedConditions.presenceOfElementLocated(elementlocation));
    }
    public WebElement visibilityofElement(By elementlocation){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)).until
                (ExpectedConditions.visibilityOfElementLocated(elementlocation));
    }
    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }
}
