@UED_file
Feature: Users should be able to upload, edit and delete file

  Background: User is logged in application and clicked on file icon
    Given the user logged in with username as "User1" and password as "Userpass123"
    Given the user clicked on file icon

Scenario: File upload verification
  Given user is on a file page
  When user clicks on add button
  And click on upload file button

