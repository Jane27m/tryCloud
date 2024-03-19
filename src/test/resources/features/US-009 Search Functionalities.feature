Feature: Search functionality and dashboard icons
  User Story :
  As a user, I should be able to search file or contact from the Dashboard

Scenario:
User can search file typing its name through the magnifying glass icon inside any Module and see the details side page of the file when clicked on it.
  Given the user is on the login page
  When user clicks on search button
  And user enters "mom"  word in search input and clicks enter button
  And user should see available matched options
  And user clicks on first matched option
  And user should be redirected into files page
Then side bar of the file should be visible
  Scenario:
  User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page.
