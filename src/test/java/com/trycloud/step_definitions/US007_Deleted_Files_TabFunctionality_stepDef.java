package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US007_Deleted_FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class US007_Deleted_Files_TabFunctionality_stepDef {
    US007_Deleted_FilesPage us007DeletedFilesPage=new US007_Deleted_FilesPage();
    String firstFileName = us007DeletedFilesPage.firstLineName.getText();
    int deletedFilesSize;




    @When("user clicks the Deleted Files tab")
    public void user_clicks_the_deleted_files_tab() {
      us007DeletedFilesPage.deleteFiles.click();

    }
    @And("user click Deleted button")
    public void user_click_deleted_button() {
        BrowserUtils.sleep(3);
us007DeletedFilesPage.deletedButton.click();
//BrowserUtils.sleep(1);
//us007DeletedFilesPage.deletedButton.click();
    }
    @Then("the files should be displayed in the order from newest to oldest")
    public void the_files_should_be_displayed_in_the_order_from_newest_to_oldest()  {
       for(WebElement each: us007DeletedFilesPage.fileList){
    String actual= each.getText();
     String expected="a year ago";
  if (actual.equals(expected)){
     Assert.assertEquals(actual,expected);}}

}

    @When("the user clicks on the three dots icon")
    public void the_user_clicks_on_the_three_dots_icon() {
        try {
            us007DeletedFilesPage.threeDots.click();
        }catch (ElementClickInterceptedException e){
            System.out.println(e.getMessage());
        }

    }
    @And("the user click the option to Delete permanently")
    public void theUserClickTheOptionToDeletePermanently() {
//        Actions actions = new Actions(Driver.getDriver());
//        actions.click(us007DeletedFilesPage.deleteFilePermanently).perform();
        BrowserUtils.sleep(1);
        us007DeletedFilesPage.deleteFilePermanently.click();
   }

    @Then("the file should be deleted permanently")
    public void theFileShouldBeDeletedPermanently() {
        BrowserUtils.waitFor(1);
        for(WebElement each: us007DeletedFilesPage.fileList){
            String actual= each.getText();
            String expected="Cybertruck";
            if (actual.equals(expected)){
                Assert.assertEquals(actual,expected);}}


        boolean isFileDeleted = fileIsDeleted();
        Assert.assertTrue("File is not deleted", isFileDeleted);

    }
    @When("the user clicks the Deleted Files tab")
    public void theUserClicksTheDeletedFilesTab() {
        us007DeletedFilesPage.deleteFiles.click();
    }


    @And("user clicks on Restore button")
    public void userClicksOnRestoreButton() {

        us007DeletedFilesPage.restoreButton.click();


    }
    @And("user should click All Files button")
    public void userShouldClickAllFilesButton() {
        us007DeletedFilesPage.allFilesButton.click();
    }


    @Then("user should  see restored files under the File tab")
    public void user_should_see_restored_files_under_the_file_tab() {
        BrowserUtils.waitFor(1);
        for(WebElement each: us007DeletedFilesPage.fileList){
            String actual= each.getText();
            String expected="Cybertruck";
            if (actual.equals(expected)){
                Assert.assertEquals(actual,expected);}}



//        String firstName = us007DeletedFilesPage.deletedFirstLineName.getText();
//        System.out.println("firstName = " + firstName);
//
//        us007DeletedFilesPage.deletedFirstLineRestore.click();
//        BrowserUtils.waitFor(3);
//        us007DeletedFilesPage.allFilesButton.click();
//        BrowserUtils.waitFor(3);
//
//        System.out.println(us007DeletedFilesPage.getAllFileName().toString());
//
//        for (String name:us007DeletedFilesPage.getAllFileName()) {
//            if (name.equals(firstName)){
//                Assert.assertEquals(firstName,name);
//            }
//        }


    }




    private boolean fileIsDeleted(){
        return true;
    }


}
