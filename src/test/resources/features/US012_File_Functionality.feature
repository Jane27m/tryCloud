@US012
Feature: Users should be able to to add a file to favorites, rename any file and give some comments on
  any file

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User2" and password as "Userpass123"
    Given the user clicked on file icon

  @US012_1
  Scenario: File upload verification
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  user add file to favorite
    Then verify file add to favorites

  @US012_2
  Scenario Outline: User should be able to rename the file
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  press on rename button
    And  rename file "<newName>"
    Then verify the file is renamed into "<newName>"

    Examples:
    |newName|
    |12345  |
    |34567  |

  @US012_3
  Scenario Outline: User should be able to put comments on file
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots button
    And  press on details button
    And  press on comments button
    And  put "<newWord>" comment
    And  press on post button
    Then verify the file has comment

    Examples:
      |newWord|
      |Good  |
