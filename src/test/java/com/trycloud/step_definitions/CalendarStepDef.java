package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.MainPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarStepDef {

    CalendarPage calendarPage = new CalendarPage();
    MainPage mainPage = new MainPage();

    @Given("User is loged in")
    public void user_is_loged_in() {
        String expectedUrl = "http://qa2.trycloud.net/index.php/apps/dashboard/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not Loged in", expectedUrl, actualUrl);
        BrowserUtils.sleep(2);

    }
    @Given("User navigate to {string} module")
    public void user_navigate_to_module(String string)  {

        BrowserUtils.sleep(3);
        mainPage.calendarIcon.click();
        BrowserUtils.sleep(3);

    }
    @Given("User is on the calendar page")
    public void userIsOnCalendarPage() {
        String expectedUrl = "https://qa.trycloud.net/index.php/apps/calendar/timeGridDay/now";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("User is not on the calendar page", expectedUrl, actualUrl);
        BrowserUtils.sleep(3);

    }
    @And("User clicks on the six dots")
    public void userClicksOnTheSixDots() {
        calendarPage.sixDotsButton.click();
        BrowserUtils.sleep(3);
    }

    @When("User selects the daily view")
    public void userSelectsDailyView() {
        calendarPage.dailyViewButton.click();


    }
    @Then("Daily calendar view is displayed")
    public void dailyCalendarViewIsDisplayed() {
       Assert.assertTrue( calendarPage.dailyViewButton.getText().contains("Day"));

    }

    @When("User selects the weekly view")
    public void userSelectsWeeklyView() {

        BrowserUtils.sleep(5);
        calendarPage.weeklyViewButton.click();

    }

    @Then("Weekly calendar view is displayed")
    public void weeklyCalendarViewIsDisplayed() {
        Assert.assertTrue( calendarPage.weeklyViewButton.getText().contains("Week"));

    }

    @When("User selects the monthly view")
    public void userSelectsMonthlyView() {
        calendarPage.monthlyViewButton.click();
        BrowserUtils.sleep(3);

    }

    @Then("Monthly calendar view is displayed")
    public void monthlyCalendarViewIsDisplayed() {
        Assert.assertTrue( calendarPage.monthlyViewButton.getText().contains("Month"));

    }

    @When("User creates a new event")
    public void userCreatesNewEvent() {


        BrowserUtils.sleep(3);
        calendarPage.newEventButton.click();
        BrowserUtils.sleep(3);

        calendarPage.eventTitle.click();
        calendarPage.eventTitle.sendKeys("Birthday Party");


        BrowserUtils.sleep(3);
        calendarPage.saveButton.click();


    }

    @Then("Event is displayed on the monthly calendar view")
    public void eventIsDisplayedOnMonthlyView() {
        Assert.assertTrue( calendarPage.displayedEvent.getText().contains("Birthday Party"));
        BrowserUtils.sleep(5);


      }

    }

