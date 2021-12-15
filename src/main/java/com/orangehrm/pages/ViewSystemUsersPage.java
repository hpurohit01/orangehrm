package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='head']//h1")
    WebElement systemUserText;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(id = "successBodyEdit")
    WebElement saveNotification;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoll;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchBtn;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteBtn;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popupOK;
    @FindBy(xpath = "//div[@id='successBodyDelete']")
    WebElement deleteMsg;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecord;


    public void setSystemUserText() {
        verifyText("System Users", systemUserText, "System Users not displayed");
        log.info("verifying : " + systemUserText.toString());
    }

    public void savedNotification() {
        Assert.assertEquals("Successfully Saved", saveNotification, "Successfully Saved not displayed");
        log.info("verifying : " + saveNotification.toString());

    }

    public void setUsername(String usname) {
        sendTextToElement(username, usname);
        log.info("entering username : " + username.toString());
    }

    public void setUserRoll(String ESS) {
        selectByVisibleTextFromDropDown(userRoll, ESS);
        log.info("selecting user role: " + userRoll.toString());
    }

    public void setStatus(String stus) {
        selectByVisibleTextFromDropDown(status, stus);
        log.info("selecting status : " + status.toString());
    }

    public void setSearchBtn() {
        clickOnElement(searchBtn);
        log.info("clicking on : " + searchBtn.toString());
    }

    public void setCheckBox() {
        clickOnElement(checkBox);
        log.info("clicking on : " + checkBox.toString());
    }

    public void setDeleteBtn() {
        clickOnElement(deleteBtn);
        log.info("clicking on : " +deleteBtn.toString());
    }

    public void clickOnPopUPOk() {
        clickOnElement(popupOK);
        log.info("clicking on : " + popupOK.toString());
    }

    public void verifyDeleteMsg() {
        verifyText("Successfully Deleted", deleteMsg, "Successfully Deleted");
        log.info("verifying text: " + deleteBtn.toString());
    }

    public void verifyNoRecordFound() {
        verifyText("No Records Found", noRecord, "No Records Found not found");
        log.info("clicking on : " + noRecord.toString());
    }



}
