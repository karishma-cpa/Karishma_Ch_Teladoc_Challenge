package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.NumberFormat;
import java.util.List;

public class AddUserPage extends BasePage {

    @FindBy(xpath = "//i[@class=' icon icon-remove']")
    private WebElement deleteUserButton;
    @FindBy(xpath = "//span[contains(text(), 'First Name')]")
    private WebElement firstNameColumn;
    @FindBy(xpath = "//span[contains(text(), 'Last Name')]")
    private WebElement lastNameColumn;
    @FindBy(xpath = "//span[contains(text(), 'User Name')]")
    private WebElement userNameColumn;
    @FindBy(xpath = "//span[contains(text(), 'Customer')]")
    private WebElement customerColumn;
    @FindBy(xpath = "//span[contains(text(), 'Role')]")
    private WebElement roleColumn;
    @FindBy(xpath = "//span[contains(text(), 'E-mail')]")
    private WebElement emailColumn;
    @FindBy(xpath = "//span[contains(text(), 'Cell Phone')]")
    private WebElement cellPhoneColumn;

    @FindBy(xpath = "//div[@class='modal ng-scope']")
    private WebElement popUpAddUser;
    @FindBy(xpath = "//td/input[@name='FirstName']")
    private WebElement firstNameAddUser;
    @FindBy(xpath = "//td/input[@name='LastName']")
    private WebElement lastNameAddUser;
    @FindBy(xpath = "//td/input[@name='UserName']")
    private WebElement userNameAddUser;
    @FindBy(xpath = "//td/input[@name='Password']")
    private WebElement passwordAddUser;
    @FindBy(xpath = "//td/input[@name='Email']")
    private WebElement emailAddUser;
    @FindBy(xpath = "//td/input[@name='Mobilephone']")
    private WebElement mobilePhoneAddUser;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement saveAddUser;
    @FindBy(xpath = "//select[@name='RoleId']")
    private WebElement roleDropDownAddUser;

    @FindBy(xpath = "//input[@name='optionsRadios'] [@value='15']")
    WebElement radioBtnCompanyAAA;
    @FindBy(xpath = "//input[@name='optionsRadios'] [@value='16']")
    WebElement radioBtnCompanyBBB;



    public boolean verifyPage()
    {
        return  popUpAddUser.isDisplayed();
    }



    public void enterFirstName(String firstName) {
        firstNameAddUser.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameAddUser.sendKeys(lastName);
    }

    public void enterUserName(String userName) {
        userNameAddUser.sendKeys(userName);
    }

    public void enterEmail(String email) {
        emailAddUser.sendKeys(email);
    }

    public void radioButtonCompanyAAA() {
        radioBtnCompanyAAA.click();

    }
    public void radioButtonCompanyBBB() {
        radioBtnCompanyBBB.click();

    }

    public void selectRole(String role) {
        Select dropDown = new Select(roleDropDownAddUser);
        dropDown.selectByVisibleText(role);

    }

    public void enterPassword(String password) {
        passwordAddUser.sendKeys(password);

    }

    public void enterMobilePhoneNumber(String mobilePhone) {
        mobilePhoneAddUser.sendKeys(mobilePhone);
    }

    public void clickOnSaveBtn() {
        saveAddUser.click();
    }



   
}
