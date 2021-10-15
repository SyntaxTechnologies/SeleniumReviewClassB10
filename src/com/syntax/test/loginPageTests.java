package com.syntax.test;

import com.syntax.pages.dashBoardPage;
import com.syntax.pages.loginPage;
import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.baseClass;

public class loginPageTests {

    public static void main(String[] args){
        //launch the browser
        baseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //access the webelements and send the username and password
        loginPageWithPageFactory LoginPage=new  loginPageWithPageFactory();
        LoginPage.userName.sendKeys("Admin");
        LoginPage.password.sendKeys("Hum@nhrm123");
        LoginPage.loginBtn.click();

        dashBoardPage dashBoard =new dashBoardPage();
        String welcomeMessage=dashBoard.welcomeMessage.getText();
        System.out.println(welcomeMessage);
    }


}
