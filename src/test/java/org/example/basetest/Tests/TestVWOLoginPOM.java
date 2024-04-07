package org.example.basetest.Tests;

import org.example.Pages.PageObjectModel.LoginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOM {

    @Test
    public void testLoginNegative(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
    }

}
