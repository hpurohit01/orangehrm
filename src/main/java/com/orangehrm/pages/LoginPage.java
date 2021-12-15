package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;

    @CacheLookup
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Welcome Paul')]")
    WebElement verifyWelcome;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement verifyLogo;

    @CacheLookup
    @FindBy(id = "welcome")
    WebElement clickOnWelcome;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement clickOnLogout;


    public void setUsername(String name) {
        sendTextToElement(username, name);
        log.info("entering user name : " + username.toString());
    }

    public void setPassword(String psw) {
        sendTextToElement(password, psw);
        log.info("entering password : " +password.toString());
    }

    public void setLoginButton() {
        clickOnElement(loginButton);
        log.info("clicking on  : " + loginButton.toString());
    }

    public void setVerifyPanel() {
        verifyText("Welcome Paul", verifyWelcome, "Welcome sra not displayed");
        log.info("verify : " + verifyWelcome.toString());

    }

    public void setVerifyLogo() {

        Boolean logoPresent = verifyLogo.isDisplayed();
        Assert.assertTrue(logoPresent, "Logo Present");
        log.info("verify logo : " +verifyLogo.toString());

    }

    public void setClickWelcome() {
        clickOnElement(clickOnWelcome);
        log.info("clicking on  : " + clickOnWelcome.toString());
    }

    public void setClickLogout() {
        mouseHoverToElementAndClick(clickOnLogout);
        log.info("clicking on : " + clickOnLogout.toString());
    }


}
