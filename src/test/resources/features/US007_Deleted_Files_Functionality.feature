@wiki
Feature: Managing Deleted Files

  US:
  Deleted Files Tab Functionality  under Files Module

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User13" and password as "Userpass123"
    Given the user clicked on file icon
  @wik
  Scenario:
    Given user is on a file page and sees "Files" in the title
    When user clicks the Deleted Files tab
    And  user click Deleted button
    Then the files should be displayed in the order from newest to oldest

@abc
  Scenario:
    Given user is on a file page and sees "Files" in the title
    When the user clicks the Deleted Files tab
    And the user clicks on the three dots icon
    And the user click the option to Delete permanently
    Then the file should be deleted permanently

@jbk
  Scenario:
    Given user is on a file page and sees "Files" in the title
    When the user clicks the Deleted Files tab
    And user clicks on Restore button
    And user should click All Files button
    Then user should  see restored files under the File tab


