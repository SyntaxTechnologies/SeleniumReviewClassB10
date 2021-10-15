package com.syntax.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class baseClass {


    public  static WebDriver driver;

    /**
     * this method will navigate to a particular website
     * @param url
     */
    public static void openWithSpecificURL(String url){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * this method will close down the browser
     */

    public static void tearDown(){
        if(driver!=null) {
            driver.quit();
        }
    }

}
