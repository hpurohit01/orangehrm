package com.orangehrm.cucumber.steps;

import com.orangehrm.pages.AddUserPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;

public class UserStep {

    @And("^I click on admin tab$")
    public void iClickOnAdminTab() {
        new HomePage().setAdmin();
    }



    @And("^I click on add button$")
    public void iClickOnAddButton() {
    }

    @And("^I select user role \"([^\"]*)\"$")
    public void iSelectUserRole(String role) {
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String name)  {
        new AddUserPage().setEmpName(name);
    }

    @And("^I enter my username$")
    public void iEnterMyUsername() {
        new AddUserPage().setUsername();
    }

    @And("^I select status \"([^\"]*)\"$")
    public void iSelectStatus(String sts) {
        new AddUserPage().setStatus(sts);
    }

    @And("^I set password \"([^\"]*)\"$")
    public void iSetPassword(String pass) {
        new AddUserPage().setPassword(pass);

    }

    @And("^I set confirm password \"([^\"]*)\"$")
    public void iSetConfirmPassword(String pass) {
        new AddUserPage().setConPassword(pass);
    }

    @And("^I click on save button$")
    public void iClickOnSaveButton() {
    }

    @And("^I enter name in search field \"([^\"]*)\"$")
    public void iEnterNameInSearchField(String name ){
        new ViewSystemUsersPage().setUsername(name);
    }

    @And("^I enter status as \"([^\"]*)\"$")
    public void iEnterStatusAs(String sts) {
        new ViewSystemUsersPage().setStatus(sts);
    }

    @And("^I click to search$")
    public void iClickToSearch() {
        new ViewSystemUsersPage().setSearchBtn();
    }

    @And("^I enter a user name \"([^\"]*)\"$")
    public void iEnterAUserName(String  name) {
        new ViewSystemUsersPage().setUsername(name);
    }

    @And("^I set his role \"([^\"]*)\"$")
    public void iSetHisRole(String  rol) {
        new ViewSystemUsersPage().setUserRoll(rol);
    }

    @And("^I set his status \"([^\"]*)\"$")
    public void iSetHisStatus(String  sts) {
        new ViewSystemUsersPage().setStatus(sts);
    }

    @And("^I marked in check box$")
    public void iMarkedInCheckBox() {
        new ViewSystemUsersPage().setCheckBox();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().setDeleteBtn();
    }

    @And("^I click on pop up$")
    public void iClickOnPopUp() {
        new ViewSystemUsersPage().clickOnPopUPOk();
    }

    @And("^I can see no record found$")
    public void iCanSeeNoRecordFound() {
        new ViewSystemUsersPage().verifyNoRecordFound();
    }
}
