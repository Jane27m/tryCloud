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
                Assert.assertEquals(actualName,expectedName);
            }
        }
    }

    @When("user clicks on three dots")
    public void userClicksOnThreeDots() {
        filesPage.threeDotsMenu.click();
    }

    @And("press on delete button")
    public void pressOnDeleteButton() {
        BrowserUtils.sleep(3);
        filesPage.deleteButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("file which we uploaded before should be deleted")
    public void fileWhichWeUploadedBeforeShouldBeDeleted() {
        for (WebElement each : filesPage.uploadedFiles) {
            String actualName = each.getText();
            String expectedName = "Screen";
            if (actualName.equals(expectedName)) {
                Assert.assertNotEquals(actualName,expectedName);
            }
        }
    }


}
