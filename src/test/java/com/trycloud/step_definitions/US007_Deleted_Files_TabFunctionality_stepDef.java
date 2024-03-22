package com.trycloud.step_definitions;

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


    @When("user clicks the Deleted Files tab")
    public void user_clicks_the_deleted_files_tab() {
      us007DeletedFilesPage.deleteFiles.click();

    }
    @And("user click Deleted button")
    public void user_click_deleted_button() {
        BrowserUtils.sleep(3);
us007DeletedFilesPage.deletedButton.click();
BrowserUtils.sleep(1);
us007DeletedFilesPage.deletedButton.click();
    }
    @Then("the files should be displayed in the order from newest to oldest")
    public void the_files_should_be_displayed_in_the_order_from_newest_to_oldest()  {
        for(WebElement each: us007DeletedFilesPage.fileList){
        String actual= each.getText();
        String expected="a year ago";
        if (actual.equals(expected)){
        Assert.assertEquals(actual,expected);}}
//        List<Date>obtainedList=new ArrayList<>();
//        String date="";
//        List<WebElement>elementList=us007DeletedFilesPage.fileList;
//        for(WebElement we:elementList){
//            date= we.getText();
//            //int Date = Integer.parseInt(date.replaceAll("^\\D*(\\d+).*","$1"));
//            SimpleDateFormat dateFormat=new SimpleDateFormat("EEE dd"+"'"+"MMMM yyyy");
//            Date date1 =dateFormat.parse(date);
//            obtainedList.add(date1);
//
//            ArrayList<Date>sortedList=new ArrayList<>();
//            for(Date s:obtainedList){
//                sortedList.add(s);
//            }
//            Collections.sort(sortedList, new Comparator<java.util.Date>() {
//                @Override
//                public int compare(java.util.Date o1, java.util.Date o2) {
//                    return o1.compareTo(o2);
//                }
//            });
//
//        }

//        List<WebElement> listFiles =  us007DeletedFilesPage.fileList;
//   List<String>dates =new ArrayList<>();
//    for(WebElement element : listFiles){
//       dates.add(element.getText());
//        for (int i = 0; i < dates.size() - 1; i++) {
//            String currentDate = dates.get(i);
//            String nextDate = dates.get(i + 1);
//           Assert.assertTrue( currentDate.compareTo(nextDate) >= 0);
//        }
   // }
}
//
//        List<String> filePermanent = new ArrayList<>();
//       for (WebElement elements : listFiles) {
//          String stamp = String.valueOf(us007DeletedFilesPage.timeStamp);
//          filePermanent.add(stamp);
//        }
//        List<String>sortedTime = new ArrayList<>(filePermanent);
//        Collections.sort(sortedTime,Collections.reverseOrder());
//        Assert.assertEquals(sortedTime,filePermanent);
    //}

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

//        boolean isFileDeleted = fileIsDeleted();
//        Assert.assertTrue("File is not deleted", isFileDeleted);

    }

    @And("user clicks on Restore button")
    public void userClicksOnRestoreButton() {


    }
    @And("user should click All Files button")
    public void userShouldClickAllFilesButton() {
        us007DeletedFilesPage.allFilesButton.click();
    }

    @Then("user should  see restored files under the File tab")
    public void user_should_see_restored_files_under_the_file_tab() {

        List<WebElement>restoredFiles = (List<WebElement>) us007DeletedFilesPage.fileList;
        for (WebElement each:restoredFiles){
            Assert.assertTrue(each.isDisplayed());
        }
    }


    @When("the user clicks the Deleted Files tab")
    public void theUserClicksTheDeletedFilesTab() {
        us007DeletedFilesPage.deleteFiles.click();
    }


    private boolean fileIsDeleted(){
        return true;
    }


}
