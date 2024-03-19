package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.MainPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US002_Upload_Edit_Delete_Files_stepDef {
    FilesPage filesPage = new FilesPage();
    MainPage mainPage=new MainPage();
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

    }
    @When("click on upload file button")
    public void click_on_upload_file_button() {

    }


}
