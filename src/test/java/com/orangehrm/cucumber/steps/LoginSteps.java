package com.orangehrm.cucumber.steps;

import com.orangehrm.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginSteps {


    @When("^I enter username$")
    public void iEnterUsername() {
        new LoginPage().setUsername("Admin");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().setPassword("admin123");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().setLoginButton();
    }
    @And("^I can see panel$")
    public void iCanSeePanel() {
        new LoginPage().setVerifyPanel();
    }

    @And("^I can see logo$")
    public void iCanSeeLogo() {
        new LoginPage().setVerifyLogo();
    }

    @And("^I click on welcome$")
    public void iClickOnWelcome() {
        new LoginPage().setClickWelcome();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().setClickLogout();
    }
}
