package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.MainPage;
import com.trycloud.pages.TalkModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class US006_Talk_Module_Functionality_stepDef {

    TalkModulePage talkModulePage = new TalkModulePage();
    MainPage mainPage = new MainPage();



    /*@Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("user login with username as {string} and password as {string}")
    public void userLoginWithUsernameAsAndPasswordAs(String username, String password) {

        talkModulePage.usernameInput.sendKeys(username);
        talkModulePage.passwordInput.sendKeys(password);
        talkModulePage.loginButton.click();
    }


     */

    @Given("user navigate to {string} module")
    public void userNavigateToModule(String talkModule) {

        //talkModulePage.talkModuleButton.click();

        mainPage.talkIcon.click();
        BrowserUtils.waitForClickablility(mainPage.talkIcon, 10);
        BrowserUtils.sleep(3);
    }


//change
    @Given("user clicks start a new conversation button")
    public void user_clicks_start_a_new_conversation_button() {
        talkModulePage.newConversationButton.click();

    }

    @Given("user enters name for the conversation")
    public void user_enters_name_for_the_conversation() {


        talkModulePage.conversationNameInput.sendKeys("UI sprint", Keys.ENTER);

    }

    @Given("user enables Allow guests join via link")
    public void user_enables_allow_guests_join_via_link() {
        talkModulePage.allowGuestsCheckBox.click();

    }

    @Given("user clicks Add participants button")
    public void user_clicks_add_participants_button() {
        talkModulePage.addParticipantsButton.click();

    }

    @Given("user selects A person")
    public void user_selects_a_person() {
        talkModulePage.select_a_participant.click();

    }

    @Given("user clicks a create conversation button")
    public void user_clicks_a_create_conversation_button() {
        talkModulePage.create_conversation_button.click();

    }

    @When("user clicks close button")
    public void user_clicks_close_button() {
        talkModulePage.closeButton.click();


    }

    @Then("user can see newly created conversation in the list")
    public void user_can_see_newly_created_conversation_in_the_list() {
        String newConversation = "UI sprint";
        Assert.assertTrue(talkModulePage.newConversation.isDisplayed());

    }


    @Given("User clicks three dots icon next any conversation")
    public void userClicksThreeDotsIconNextAnyConversation() {
        talkModulePage.threeDotButtonToDelete.click();
    }

    @And("User clicks delete conversation button")
    public void userClicksDeleteConversationButton() {
        talkModulePage.deleteConversationButton.click();
    }

    @And("User clicks yes button")
    public void userClicksYesButton() {
        talkModulePage.yes_to_delete.click();
    }

    @Then("conversation should be deleted")
    public void conversationShouldBeDeleted() {

    }



}


