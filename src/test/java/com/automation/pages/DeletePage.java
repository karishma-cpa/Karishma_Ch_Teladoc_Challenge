package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeletePage extends BasePage{

    @FindBy(xpath = "//div[@class='modal ng-scope']")
    private WebElement deleteConfirmationDialog;
    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    private WebElement okBtnDelUser;
    @FindBy(xpath = "//button[@class='btn btn-link']/i[@class='icon icon-remove']")
    private List<WebElement> deleteIcons;

    @Override
    public boolean verifyPage() {
      return deleteConfirmationDialog.isDisplayed();
    }

    public void clickDeleteIcon(int rowNumber) {
        deleteIcons.get(rowNumber).click();
    }

    public void deleteUserConfirmation() {
        okBtnDelUser.click();
    }
}

