package com.briteERP.pages;

import com.briteERP.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy (id = "login")
    private WebElement userMail;

    @FindBy (id = "password")
    private WebElement userPassword;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    private WebElement loginButton;

public void login (){
    userMail.sendKeys(ConfigurationReader.getProperty("userName"));
    userPassword.sendKeys(ConfigurationReader.getProperty("userpassword"));
    loginButton.click();
}

public void login(String role){
    if (role.equalsIgnoreCase("posmanager")){
        userMail.sendKeys(ConfigurationReader.getProperty("userNamePosmanager"));
        userPassword.sendKeys(ConfigurationReader.getProperty("userPasswordPosmanager"));
        loginButton.click();


    }else if(role.equalsIgnoreCase("salesmanager")){
        userMail.sendKeys(ConfigurationReader.getProperty("userNameSalesmanager"));
        userPassword.sendKeys(ConfigurationReader.getProperty("userPasswordSalesmanager"));
        loginButton.click();
    }

}


// Hello Tahsin AND Andrei

}

