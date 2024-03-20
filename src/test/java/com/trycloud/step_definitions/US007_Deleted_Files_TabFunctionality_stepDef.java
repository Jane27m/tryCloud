package com.trycloud.step_definitions;

import com.trycloud.pages.US007_Deleted_FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US007_Deleted_Files_TabFunctionality_stepDef {
    US007_Deleted_FilesPage us007DeletedFilesPage=new US007_Deleted_FilesPage();

    @When("user clicks the Deleted Files tab")
    public void user_clicks_the_deleted_files_tab() {
      us007DeletedFilesPage.deleteFiles.click();

    }
    @When("user click Deleted button")
    public void user_click_deleted_button() {
        BrowserUtils.sleep(3);
us007DeletedFilesPage.deletedButton.click();
    }
    @Then("the files should be displayed in the order from newest to oldest")
    public void the_files_should_be_displayed_in_the_order_from_newest_to_oldest() {

    }

    @When("the user clicks on the three dots icon")
    public void the_user_clicks_on_the_three_dots_icon() {
us007DeletedFilesPage.threeDots.click();
    }
    @When("the user click the option to Delete permanently")
    public void the_user_click_the_option_to_delete_permanently() {
        BrowserUtils.sleep(3);
us007DeletedFilesPage.deleteFilePermanently.click();
    }
    @Then("the file should be deleted permanently")
    public void the_file_should_be_deleted_permanently() {

    }


    @When("user clicks on Restore button")
    public void user_clicks_on_restore_button() {
       us007DeletedFilesPage.restoreButton.click();
    }
    @When("user should click All Files button")
    public void user_should_click_all_files_button() {
us007DeletedFilesPage.allFilesButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("user should  see restored files under the File tab")
    public void user_should_see_restored_files_under_the_file_tab() {

        List<WebElement>restoredFiles = (List<WebElement>) us007DeletedFilesPage.fileList;
        Assert.assertFalse(restoredFiles.isEmpty());
        for (WebElement each:restoredFiles){
            Assert.assertTrue(each.isDisplayed());
        }
    }


    @When("the user clicks the Deleted Files tab")
    public void theUserClicksTheDeletedFilesTab() {
        us007DeletedFilesPage.deleteFiles.click();
    }
}
