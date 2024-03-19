@wiki
Feature: Managing Deleted Files

  US:
  Deleted Files Tab Functionality  under Files Module

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario:
    Given the user logged in with username as "User1" and password as "UserUser123"
    When user click File tab
    Then the user clicks the Deleted Files tab
    And  user click Deleted button
    Then the files should be displayed in the order from newest to oldest


    Scenario:
      Given the user logged in with username as "User1" and password as "UserUser123"
      When user click File tab
     And the user clicks the Deleted Files tab
      And the user clicks on the three dots icon
      And the user click the option to Delete permanently
      Then the file should be deleted permanently


      Scenario:
        Given the user logged in with username as "User1" and password as "UserUser123"
        When user click File tab
       And the user clicks the Deleted Files tab
        And user clicks on Restore button
        Then user should click All Files button
        Then user should  see restored files under the File tab


