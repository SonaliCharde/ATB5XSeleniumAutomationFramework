package org.example.Pages.PageObjectModel;

import org.example.Base.CommonToAll;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAll  {
    WebDriver driver;


    public LoginPage_POM() {
        super();
    }

    //Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");

    //page Actions
    public String loginToVWOInvalidCreds(){
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password,"admin");
        clickElement(signButton);
        presenseOfElement(error_message);
        visibilityofElement(error_message);
        return getElement(error_message).getText();
    }
    public void loginToVWOValidCreds(){
        enterInput(username,PropertyReader.readyKey("username"));
        enterInput(password,PropertyReader.readyKey("password"));
        clickElement(signButton);
        //Page will move to dashboard
    }
    public DashboardPage_POM afterLoginValidCreds(){
    return new DashboardPage_POM();
    }



}
