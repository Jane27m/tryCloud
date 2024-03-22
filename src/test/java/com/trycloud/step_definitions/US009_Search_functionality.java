package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.MainPage;
import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class US009_Search_functionality {
    SearchPage searchPage = new SearchPage();
    FilesPage filesPage = new FilesPage();
    MainPage mainPage = new MainPage();
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //searchPage.searchButton.click();
        Driver.getDriver().findElement(By.xpath("//span[.='Magnify icon']")).click();
    }
    @And("user enters {string}  word in search input and clicks enter button")
    public void userEntersWordInSearchInputAndClicksEnterButton(String word) {
       // searchPage.searchInputButton.sendKeys(word);
        //Driver.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys("mom"+ Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement searchInput = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//input[@type='search']")));
        searchInput.sendKeys("test" + Keys.ENTER);
       // int sizeOfResults = 0;

        List<WebElement> numberOfElements = filesPage.listOfDynamicSearchResults;
        for (WebElement eachElement : numberOfElements) {
         if(numberOfElements.size()>0){
filesPage.firstSearchResult.click();
         }
        }

    }

    @When("user should see available matched options")
    public void user_should_see_available_matched_options() {


    }
    @When("user clicks on first matched option")
    public void user_clicks_on_first_matched_option() {

    }
    @When("user should be redirected into files page")
    public void user_should_be_redirected_into_files_page() {

    }
    @Then("side bar of the file should be visible")
    public void side_bar_of_the_file_should_be_visible() {
        WebElement sideBar = Driver.getDriver().
                findElement(By.xpath("//nav[@class='app-sidebar-tabs__nav']"));

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(sideBar.isDisplayed());
    }


    @When("user can click to trycloud from calendar page")
    public void userCanClickToTrycloudFromCalendarPage() {
        mainPage.calendarIcon.click();
        mainPage.tryCloudIcon.click();
    }

    @And("user can click to trycloud from files")
    public void userCanClickToTrycloudFromFiles() {
        mainPage.filesIcon.click();
        mainPage.tryCloudIcon.click();
    }

    @And("user can click to trycloud from settings under account button")
    public void userCanClickToTrycloudFromSettingsUnderAccountButton() {
        mainPage.accountButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        //mainPage.settingsButtonUnderAccount=
              //  wait.until(ExpectedConditions.visibilityOf(mainPage.settingsButtonUnderAccount)).click();
                mainPage.tryCloudIcon.click();
    }

}
