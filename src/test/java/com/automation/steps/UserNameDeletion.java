package com.automation.steps;

import com.automation.pages.AddUserPage;
import com.automation.pages.DeletePage;
import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UserNameDeletion {

    DeletePage delPage = new DeletePage();
    HomePage homePage = new HomePage();

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
