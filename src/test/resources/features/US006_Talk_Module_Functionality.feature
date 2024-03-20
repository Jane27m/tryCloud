@mohammed
Feature: User should be able to create a new conversation, add participant under the Talk module

  User Story: As a user, I should be able to create a new conversation, add participant under the Talk module

  Background:
    Given User is on the login page
    And User navigate to "Talk" module

  Scenario: User can create a new conversation by adding any selected participant
    Given user clicks start a new conversation button
    And user enters name for the conversation
    And user enables Allow guests join via link
    And user clicks Add participants button
    And user selects A person
    And user clicks a create conversation button
    When user clicks close button
    Then user can see newly created conversation in the list

  Scenario: User can delete a conversation
    Given User clicks three dots icon next any conversation
    And User clicks delete conversation button
    And User clicks yes button
    Then conversation should be deleted


