package com.syntax.pages;

import com.syntax.utility.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends commonMethods {

    //finding the webElements
    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement password;

    @FindBy(css="input#btnLogin")
    public WebElement loginBtn;

    //initalizing all elemetns
    public  loginPageWithPageFactory(){

        PageFactory.initElements(driver,this);
    }

}
