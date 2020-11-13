package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigateTo (String module){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        WebElement moduleElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+module+"')]//..")));
        wait.until(ExpectedConditions.elementToBeClickable(moduleElement)).click();
    }


}
