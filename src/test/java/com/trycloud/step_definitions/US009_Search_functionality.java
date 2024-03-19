package com.trycloud.step_definitions;

import com.trycloud.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US009_Search_functionality {
    SearchPage searchPage = new SearchPage();
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
searchPage.searchButton.click();
    }
    @And("user enters {string}  word in search input and clicks enter button")
    public void userEntersWordInSearchInputAndClicksEnterButton(String word) {
        searchPage.searchInputButton.sendKeys(word);
    }
    @When("user should see available matched options")
    public void user_should_see_available_matched_options() {

    }
    @When("user clicks on first matched option")
    public void user_clicks_on_first_matched_option() {

    }
    @When("user should be redirected into files page")
    public void user_should_be_redirected_into_files_page() {

    }
    @Then("side bar of the file should be visible")
    public void side_bar_of_the_file_should_be_visible() {

    }


}
