package com.britishways.testsuite;

import com.britishways.customlisteners.CustomListeners;
import com.britishways.pages.HomePage;
import com.britishways.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
    }
    @Test
    public void verifyUserCanSeeTheBaLogo(){
        homePage.logoIsVisible();
        Assert.assertEquals(homePage.logoIsVisible(),"BA logo is visible");
    }
}
