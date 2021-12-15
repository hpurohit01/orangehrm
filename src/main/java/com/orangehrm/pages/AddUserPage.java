package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement empName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;

    @CacheLookup
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement conPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    public void clickOnAdd() {
        clickOnElement(addButton);
        log.info("clicking on : " + addButton.toString());
    }

    public void setAddUserText() {
        verifyText("Add User", addUserText, "Add User");
        log.info("verify text : " + addUserText.toString());
    }

    public void setUserRole(String role) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(userRole, role);
        log.info("selecting user role : " + userRole.toString());
    }

    public void setEmpName(String name) {

        sendTextToElement(empName, name);
        log.info("Entering name : " + empName.toString());
    }

    public void setUsername() {

        randomUserName(username);
        log.info("random user name : " + username.toString());
    }

    public void setStatus(String sta) {

        selectByVisibleTextFromDropDown(status, sta);
        log.info("selecting status : " + status.toString());
    }

    public void setPassword(String pass) {

        sendTextToElement(password, pass);
        log.info("entering password : " + password.toString());
    }

    public void setConPassword(String conPass) {

        sendTextToElement(conPassword, conPass);
        log.info("entering confirm password : " + conPassword.toString());
    }

    public void setSaveButton() {

        clickOnElement(saveButton);
        log.info("clicking on : " + saveButton.toString());
    }
}

