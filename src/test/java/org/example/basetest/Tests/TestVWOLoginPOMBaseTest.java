package org.example.basetest.Tests;

import org.assertj.core.api.Assertions;
import org.example.Pages.PageObjectModel.DashboardPage_POM;
import org.example.Pages.PageObjectModel.LoginPage_POM;
import org.example.basetest.CommonToAllTest;
import org.example.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {


    @Test(groups = {"Smoke"}, priority = 1)
    public void testloginNegative(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds();

        //TestNG Assertions
        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");

        // AssertJ Assertions
        Assertions.assertThat(error_msg_text)
                .isNotNull()
                .isEqualTo("Your email, password, IP address or location did not match")
                .contains(PropertyReader.readyKey(error_msg_text));
            }

            @Test(groups = {"positive"}, priority = 2)
    public void testloginPositive(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        loginPagePom.afterLoginValidCreds();
                DashboardPage_POM dashboardPagePom = new DashboardPage_POM();
                String expected_username = dashboardPagePom.loggedInUsername();

                //TestNG Assertions
                Assert.assertEquals(expected_username,PropertyReader.readyKey(expected_username));

                //AssertJ Assertions
                Assertions.assertThat(expected_username)
                        .isNotNull()
                        .contains(PropertyReader.readyKey(expected_username))
                        .isEqualTo("Aman")
                        .isNotNull();
            }
}
