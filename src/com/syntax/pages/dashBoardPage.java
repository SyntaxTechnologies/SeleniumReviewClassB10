package com.syntax.pages;

import com.syntax.utility.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoardPage extends commonMethods {

    @FindBy(id="welcome")
    public WebElement welcomeMessage;

   @FindBy(id="menu_pim_viewEmployeeList")
   public WebElement pimOption;


    //initalizing the elements
    public dashBoardPage () {

        PageFactory.initElements(driver,this);
    }

}
