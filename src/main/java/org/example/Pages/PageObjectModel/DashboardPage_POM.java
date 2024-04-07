package org.example.Pages.PageObjectModel;

import org.example.Base.CommonToAll;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAll {
    public DashboardPage_POM() {
    }

    //PageLocators

    By userNameonDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    //Page Actions
    public String loggedInUsername(){
        presenseOfElement(userNameonDashboard);
        return getElement(userNameonDashboard).getText();

    }
}
