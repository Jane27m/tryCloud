Feature: User should be able to manage my works by creating a new board/list/card and modifying
them under Deck Module

  Background:
  Background:
    Given the user logged in with username as "User1" and password as "Userpass123"


@newBoard
  Scenario:  Create a new board
    When click on the deck link
    Then  user enter board name "Vlera"
    And user click on the submit button
    Then user  should see the confirmation text



  Scenario Outline: User creates a new list of cards/tasks under a board
    Given create a new list named "To Do" under the board "Burim"
    Then  the card/task should be added successfully

    Examples:
      | boardName | listName |
      | Burim     | Test     |
      | Burim     | Ideas    |
      #|           |          |


  Scenario Outline: User can add a new card/task on any list on the current board
    Given the user is on the current board "Burim"
    When the user adds a new card/task titled "Task 1" to any list
    Then the card/task titled "Task 1" should be added successfully

    Examples:
      | ListName | CardName |
      | Test     | Task1    |
      | Ideas    | Task2    |

  Scenario: User can assign any card/task to himself/herself using the three dots menu
    Given the user opens the three dots menu for the task "Task1"
    Then the task "Task1 " should be assigned to me