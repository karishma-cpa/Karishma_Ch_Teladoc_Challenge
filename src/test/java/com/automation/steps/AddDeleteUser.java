package com.automation.steps;

import com.automation.pages.AddUserPage;
import com.automation.pages.DeletePage;
import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddDeleteUser {

    HomePage homePage = new HomePage();
    AddUserPage addUser = new AddUserPage();
    DeletePage delPage = new DeletePage();

    @Given("user is on homepage")
    public void user_Is_On_Homepage() {
        homePage.verifyPage();
    }

    @When("user click on Add User link")
    public void user_Click_On_AddUser_Button() {
        homePage.clickOnAddUser();
    }

    @Then("verify user is able to see Add User page")
    public void verify_User_Is_Able_To_See_Add_User_Page() {

        addUser.verifyPage();
    }


    @When("^user enters the following (\\S+) in FirstName field$")
    public void user_Enters_The_Following_FirstName_In_First_Name_Field(String firstName) {
        addUser.enterFirstName(firstName);
    }

    @And("^user enters (\\S+) in LastName field$")
    public void user_Enters_LastName_In_last_Name_Field(String lastName) {
        addUser.enterLastName(lastName);
    }

    @And("^user enters (\\S+) in UserName field$")
    public void user_Enters_UserName_In_User_Name_Field(String userName) {
        addUser.enterUserName(userName);
    }

    @And("^user enters (\\S+) in Password field$")
    public void user_Enters_Test_Password_In_Password_Field(String password) {
        addUser.enterPassword(password);
    }

    @And("user selects <customer> in Customer checkbox")
    public void userSelectsCustomerInCustomerRadioButton() {
        addUser.radioButtonCompanyAAA();
    }

    @And("^user selects (\\S+) in Role dropdown$")
    public void userSelectsRoleInRoleDropdown(String role) {
        addUser.selectRole("Admin");
    }

    @And("^user enters (\\S+) in Email field$")
    public void user_Enters_Email_In_Email_Field(String email) {
        addUser.enterEmail(email);
    }

    @And("^user enters (\\S+) in CellPhone field$")
    public void user_Enters_Cellphone_In_Cellphone_Field(String cellNumber) {
        addUser.enterMobilePhoneNumber(cellNumber);    }

    @When("user clicks on save button")
    public void user_Clicks_On_Save_Button() {
        addUser.clickOnSaveBtn();
    }

    @Then("^verify user (\\S+) information is added to the table$")
    public void verify_User_Information_Is_Added_To_The_Table(String userName) {
        Assert.assertTrue(String.format("User %s should be available in table", userName), homePage.isUserAvailable(userName));
    }

    @When("^user click on Delete button for (\\S+) user$")
    public void userClickOnDeleteButtonForUserNameUser(String str) {
        homePage.verifyPage();
        int column = homePage.getColumnNumber("User Name");
        int row = homePage.getRowNumber(column, str);
        delPage.clickDeleteIcon(row);
    }

    @Then("confirmation pop up shows up")
    public void confirmation_PopUpShows_Up() {
        delPage.verifyPage();
    }


    @And("user clicks on ok button in the popup")
    public void user_ClicksOn_OkButton_In_The_Popup() {
        delPage.deleteUserConfirmation();
    }

    @Then("^verify user (\\S+) information is deleted from the table$")
    public void verifyUserInformationIsDeletedFromTheTable(String userName) {
        Assert.assertFalse("Added User is not visible", homePage.isUserAvailable(userName));
    }


}
