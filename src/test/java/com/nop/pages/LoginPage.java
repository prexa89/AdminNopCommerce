package com.nop.pages;

import com.nop.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy (id = "Email")
    WebElement txtEmail;
   @FindBy (id = "Password")
    WebElement txtPassword;
   @FindBy(xpath = "//div[@class='buttons']")
   WebElement button;

    public void enterEmail(String mail){
        txtEmail.clear();
        txtEmail.sendKeys(mail);
    }public void enterPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }public void clickButton(){
        button.click();
    }
}
