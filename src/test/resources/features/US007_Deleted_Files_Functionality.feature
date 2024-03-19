@wiki
Feature: Managing Deleted Files

  US:
  Deleted Files Tab Functionality  under Files Module

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario:
    Given user is on the Files module
    When user click to the Deleted files tab
    And  user click Deleted button to order files by newest to oldest
    Then the files should be displayed in the order from newest to oldest


  Scenario:

    When  user clicks to the Deleted files tab
    Then  user clicks on the three dots icon next
    And  user clicks the option to delete the file permanently
    Then the file should be deleted permanently


  Scenario:
    Given user clicks to the Deleted files tab
    When  user restores a deleted file
    Then file should be restored