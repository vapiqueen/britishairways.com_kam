package com.britishways.pages;

import com.britishways.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//a[@title='British Airways home page']")
    WebElement baLogo;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='clearfix header-items']//span[@class='login'][normalize-space()='Log In']")
    WebElement loginLink;

    public String logoIsVisible(){
        String logo = getTextFromElement(baLogo);
        log.info("Logo is Visible");
        return logo;

    }
}
