package com.britishways.browserfactory;


import com.britishways.propertyreader.PropertyReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/**
 * Created by KAM
 */

public class ManageBrowser {
    private static final Logger log = LogManager.getLogger( ManageBrowser.class);
    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    public ManageBrowser(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile/log4j2.properties");
    }
    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            log.info("Chrome Browser Launch.....");
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new InternetExplorerDriver();
            log.info("Edge Browser Launch");
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver!= null){
            driver.quit();
        }
    }
}
