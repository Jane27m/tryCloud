@UED_file
Feature: Users should be able to upload, edit and delete file

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User13" and password as "Userpass123"
    Given the user clicked on file icon

  @UED_file
  Scenario: File upload verification
    Given user is on a file page and sees "Files" in the title
    When user clicks on add button
    And uploads file
    Then verify your file was uploaded

  Scenario: User should be able to delete the file
    Given user is on a file page and sees "Files" in the title
    When user clicks on three dots
    And press on delete button
    Then file which we uploaded before should be deleted

  Scenario: User can create a new folder
    Given user is on a file page and sees "Files" in the title
    When user clicks on add button
    And select new folder line
    And type a new name "newFolder123"
    And press confirm button
    Then our file "newFolder123" should be displayed in the list
    Then delete this folder

    Scenario: User can see the total number of files and folders under the files list table
      Given user is on a file page and sees "Files" in the title
      And user can see a number of uploaded folders
      And user can see a number of uploaded files

