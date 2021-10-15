package com.syntax.pages;

import com.syntax.utility.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage extends commonMethods {

   public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));

}
