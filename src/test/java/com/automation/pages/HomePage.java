package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    private WebElement addUserBtn;
    @FindBy(xpath = "//table[@class='smart-table table table-striped']")
    private WebElement table;
    @FindBy(xpath = "//th[@class='smart-table-header-cell']")
    private List<WebElement> tableColumns;
    @FindBy(xpath = "//tr[@class='smart-table-data-row ng-scope']")
    private List<WebElement> tableRows;

    public boolean verifyPage() {
        return  addUserBtn.isDisplayed();
    }

    public void clickOnAddUser() {
        addUserBtn.click();
    }

    public int getColumnNumber(String str) {
        int columnNumber = -1;
        for (int i = 0; i < tableColumns.size(); i++) {
            if (str.equals(tableColumns.get(i).getText())) {
                columnNumber = i;
                break;
            }
        }

        return columnNumber;
    }

    public int getRowNumber(int i, String str) {
        int rowNumber = -1;
        for (int j = 0; j < tableRows.size(); j++) {
            WebElement row = tableRows.get(j);
            List<WebElement> cells = row.findElements(By.className("smart-table-data-cell"));
            if (cells.get(i).getText().equalsIgnoreCase(str)) {
                rowNumber = j;
                break;
            }
        }
        return rowNumber;
    }

    public boolean isUserAvailable(String userName) {
        int colNumber = getColumnNumber("User Name");
        return getRowNumber(colNumber, userName) != -1;
    }
}
