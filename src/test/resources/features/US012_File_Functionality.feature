@US012
Feature: Users should be able to to add a file to favorites, rename any file and give some comments on
  any file

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User1" and password as "Userpass123"
    Given the user clicked on file icon

  @US012_1
  Scenario: File upload verification
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  user add file to favorite
    Then verify file add to favorites

  @US012_2
  Scenario: User should be able to rename the file
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  press on rename button
    And  rename file
    Then verify the file is renamed

  @US012_3
  Scenario: User should be able to put comments on file
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  press on details button
    And  press on comments button
    And  put some comment
    And  press on post button
    Then verify the file has comment

