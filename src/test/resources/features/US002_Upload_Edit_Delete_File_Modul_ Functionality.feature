@UED_file
Feature: Users should be able to upload, edit and delete file

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User1" and password as "Userpass123"
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

