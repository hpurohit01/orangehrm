package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagementLink;

    @CacheLookup
    @FindBy(id = "menu_admin_Job")
    WebElement jobsLink;

    @CacheLookup
    @FindBy(id = "menu_admin_Organization")
    WebElement organizationLink;

    public void setUserManagementLink() {

        mouseHoverToElement(userManagementLink);
        clickOnElement(userManagementLink);
        log.info("clicking on : " + userManagementLink.toString());
    }

}
