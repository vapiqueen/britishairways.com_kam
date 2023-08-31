package com.britishways.testsuite;

import com.britishways.customlisteners.CustomListeners;
import com.britishways.pages.HomePage;
import com.britishways.testbase.BaseTest;
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

//    @Test
//    public void acceptCookies() throws InterruptedException{
//        homePage.setAcceptCookies();
//    }


    @Test
    public void verifyUserCanSeeTheBaLogo() throws InterruptedException {
        homePage.setAcceptCookies();
        Thread.sleep(2000);
        homePage.logoIsVisible();
    }
}
