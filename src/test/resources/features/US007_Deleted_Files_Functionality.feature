@wiki
Feature: Managing Deleted Files

  US:
  Deleted Files Tab Functionality  under Files Module

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario:
    Given user is on the Files module
    When the user navigates to the Deleted Files tab
    And the user click Deleted button to order files by newest to oldest
    Then the files should be displayed in the order from newest to oldest


  Scenario:

    When the user navigates to the Deleted Files tab
    And the user clicks on the three dots icon next to a deleted file
    And the user clicks the option to delete the file permanently
    Then the file should be deleted permanently


  Scenario:
    Given the user is on the "Deleted Files" tab
    When the user restores a deleted file
    Then the file should be restored