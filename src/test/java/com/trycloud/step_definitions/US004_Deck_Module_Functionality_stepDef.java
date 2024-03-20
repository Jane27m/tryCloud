package com.trycloud.step_definitions;


import com.trycloud.pages.US004_Deck_iconPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.Assert;

public class US004_Deck_Module_Functionality_stepDef {

    US004_Deck_iconPage deckIconPage = new US004_Deck_iconPage();

    @When("click on the deck link")
    public void click_on_the_deck_link() {
       deckIconPage.deck.click();
    }
    @Then("user enter board name {string}")
    public void userEnterBoardName(String Vlera) {
        addBoard.sendKeys(Vlera);
    }
    @Then("user click on the submit button")
    public void user_click_on_the_submit_button() {
        boardName.click();
    }
    @Then("user  should see the confirmation text")
    public void user_should_see_the_confirmation_text() {
        Assert.assertTrue(US004_Deck_iconPage.ConfirmText.isEnabled());
    }
////////////////////////////////////////////////

    @Given("create a new list named {string} under the board {string}")
    public void createANewListNamedUnderTheBoard(String Idea, String Test) {

            newAddListInput.sendKeys(Idea);
            newAddListInput.sendKeys(Test);
            newAddListInput.submit();

    }

    @Then("the card/task should be added successfully")// senario3 
    public void theCardTaskShouldBeAddedSuccessfully() {

    }

//////////////////////////////////////

    @Given("the user is on the current board {string}")
    public void theUserIsOnTheCurrentBoard(String Burim) {
    }
   
    @When("the user adds a new card/task titled {string} to any list")
    public void theUserAddsANewCardTaskTitledToAnyList(String Task1) {
    }


    @Then("the card/task titled {string} should be added successfully")
    public void theCardTaskTitledShouldBeAddedSuccessfully(String Task1) {
        //Assert.assertTrue();
    }




    /////////////////////////////////////////

    @Given("the user opens the three dots menu for the task {string}")
    public void theUserOpensTheThreeDotsMenuForTheTask(String Task1 ) {



    }


    @Then("the task {string} should be assigned to me")
    public void theTaskShouldBeAssignedToMe(String Task1) {
       Assert.assertTrue("Task1 is not assigned to me", is Task1 Assigned ToMe(Task1));
    }

    }






