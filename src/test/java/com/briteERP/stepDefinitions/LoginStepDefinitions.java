package com.briteERP.stepDefinitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user in the login page")
    public void userInTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("user logs in as a {string}")
    public void userLogsInAsA(String arg0) {
        loginPage.login(arg0);
    }

    @Then("user should be see home page")
    public void userShouldBeSeeHomePage() {
    }


}

// Hello from VA