package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarStepDef {

    CalendarPage calendarPage = new CalendarPage();

    @Given("User is loged in")
    public void user_is_loged_in() {

    }
    @Given("User navigate to {string} module")
    public void user_navigate_to_module(String string) {

    }

    @Given("User is on the calendar page")
    public void userIsOnCalendarPage() {


    }

    @When("User selects the daily view")
    public void userSelectsDailyView() {


    }

    @Then("Daily calendar view is displayed")
    public void dailyCalendarViewIsDisplayed() {

    }

    @When("User selects the weekly view")
    public void userSelectsWeeklyView() {

    }

    @Then("Weekly calendar view is displayed")
    public void weeklyCalendarViewIsDisplayed() {

    }

    @When("User selects the monthly view")
    public void userSelectsMonthlyView() {

    }

    @Then("Monthly calendar view is displayed")
    public void monthlyCalendarViewIsDisplayed() {

    }

    @When("User creates a new event")
    public void userCreatesNewEvent() {

    }

    @Then("Event is displayed on the monthly calendar view")
    public void eventIsDisplayedOnMonthlyView() {

    }

}
