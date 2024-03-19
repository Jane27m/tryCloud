
Feature: Calendar Module Functionality
  Background:
    Given User is loged in
    And User navigate to "Calender" module


  Scenario: Display Daily Calendar View
    Given User is on the calendar page
    When User selects the daily view
    Then Daily calendar view is displayed

  Scenario: Display Weekly Calendar View
    Given User is on the calendar page
    When User selects the weekly view
    Then Weekly calendar view is displayed

  Scenario: Display Monthly Calendar View
    Given User is on the calendar page
    When User selects the monthly view
    Then Monthly calendar view is displayed

  Scenario: Create New Event
    Given User is on the calendar page
    When User creates a new event
    Then Event is displayed on the monthly calendar view

