package com.nop.step_defination;

import com.nop.driver.DriverManager;
import com.nop.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverManager {
    DriverManager driverManager =new DriverManager();
    LoginPage loginPage=new LoginPage();
    @Given("^User open URL \"([^\"]*)\"$")
    public void user_open_URL(String currentURL) throws Throwable {
        driverManager.goToUrl(currentURL);

    }@When("^User enter Email as\"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_Email_as_and_password_as(String currentEmail, String currentPassword) throws Throwable {
        loginPage.enterEmail(currentEmail);
        loginPage.enterPassword(currentPassword);
        Thread.sleep(3000);
    }
    @And("^User click on login Button$")
    public void userClickOnLoginButton() throws InterruptedException {
        loginPage.clickButton();
        Thread.sleep(3000);

    }@Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {

    }
}
