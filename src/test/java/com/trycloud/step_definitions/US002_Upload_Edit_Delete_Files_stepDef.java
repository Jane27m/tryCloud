package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.MainPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.browser.Browser;

public class US002_Upload_Edit_Delete_Files_stepDef {
    FilesPage filesPage = new FilesPage();
    MainPage mainPage = new MainPage();

    @Given("the user clicked on file icon")
    public void the_user_clicked_on_file_icon() {
        mainPage.filesIcon.click();
        BrowserUtils.sleep(2);

    }

    @Given("user is on a file page and sees {string} in the title")
    public void userIsOnAFilePageAndSeesInTheTitle(String expectedInTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        filesPage.addButton.click();

    }

    @When("uploads file")
    public void uploads_file() {
        String path = "/Users/Lisa/Desktop/Screen.png";
        filesPage.uploadFileButton.sendKeys(path);
        BrowserUtils.sleep(5);

    }


    @Then("verify your file was uploaded")
    public void verifyYourFileWasUploaded() {
        for (WebElement each : filesPage.uploadedFiles) {
            String actualName = each.getText();
            String expectedName = "Screen";
            if (actualName.equals(expectedName)) {
                Assert.assertEquals(actualName, expectedName);
            }
        }
    }

    @When("user clicks on three dots")
    public void userClicksOnThreeDots() {

        filesPage.threeDotsMenuForUploadedFile.click();
        BrowserUtils.sleep(2);
    }

    @And("press on delete button")
    public void pressOnDeleteButton() {
        BrowserUtils.sleep(3);
        filesPage.deleteButton.click();

    }

    @Then("file which we uploaded before should be deleted")
    public void fileWhichWeUploadedBeforeShouldBeDeleted() {
        for (WebElement each : filesPage.uploadedFiles) {
            String actualName = each.getText();
            String expectedName = "Screen";
            if (actualName.equals(expectedName)) {
                Assert.assertNotEquals(actualName, expectedName);
            }
        }
    }

    @And("select new folder line")
    public void selectNewFolderLine() {
        filesPage.newFolderButton.click();

        filesPage.folderConfirm.click();
    }

    @And("type a new name {string}")
    public void typeANewName(String folderName) {
        filesPage.folderNameInput.clear();
        filesPage.folderNameInput.sendKeys(folderName);
        BrowserUtils.sleep(3);
    }

    @And("press confirm button")
    public void pressConfirmButton() {
        filesPage.folderConfirm.click();
        BrowserUtils.sleep(2);
    }

    @Then("our file {string} should be displayed in the list")
    public void ourFileShouldBeDisplayedInTheList(String expectedName) {
        for (WebElement each : filesPage.uploadedFiles) {
            if (each.getText().equals(expectedName)) {
                Assert.assertEquals(expectedName, each.getText());
            }
        }
        BrowserUtils.sleep(3);
    }

    @Then("delete this folder")
    public void deleteThisFolder() {
        filesPage.threeDotsMenuForNewFolder.click();
        filesPage.deleteButton.click();
        BrowserUtils.sleep(3);

    }

    @And("user can see a number of uploaded folders")
    public void userCanSeeANumberOfUploadedFolders() {
        Assert.assertTrue(filesPage.foldersCount.isDisplayed());
        char char1 = filesPage.foldersCount.getText().charAt(0);
        Assert.assertTrue(Character.isDigit(char1));
    }

    @And("user can see a number of uploaded files")
    public void userCanSeeANumberOfUploadedFiles() {
        Assert.assertTrue(filesPage.filesCount.isDisplayed());
        char char2 = filesPage.filesCount.getText().charAt(0);
        Assert.assertTrue(Character.isDigit(char2));
    }
}
