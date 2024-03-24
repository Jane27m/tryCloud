package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.MainPage;
import com.trycloud.pages.US012;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US012_Favorite_Rename_Comments_Step_Defs {

       US012 us012 = new US012();

    @And("user add file to favorite")
    public void userAddFileToFavorite() {
        BrowserUtils.sleep(3);
      us012.addFavoriteButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("verify file add to favorites")
    public void verifyFileAddToFavorites() {
        for (WebElement each :us012.removeFromFavorite) {
            String actualName = each.getText();
            String expectedName = "Favorited";
            if (actualName.equals(expectedName)) {
                Assert.assertEquals(actualName, expectedName);
            }
        }
    }
        @And("press on rename button")
        public void pressOnRenameButton () {
            BrowserUtils.sleep(3);
            us012.renameNameButton.click();
            BrowserUtils.sleep(3);

        }




    @And("rename file {string}")
    public void renameFile(String newName) {

        Driver.getDriver().switchTo().activeElement().sendKeys(newName + Keys.ENTER);
        BrowserUtils.waitFor(2);
        Driver.getDriver().navigate().refresh();
    }

    @Then("verify the file is renamed into {string}")
    public void verifyTheFileIsRenamedInto(String expectedName) {
        String actualName =  Driver.getDriver().switchTo().activeElement().getText();
        if (actualName.equals(expectedName)) {
            Assert.assertEquals(actualName, expectedName);
        }
    }

            @And("press on details button")
            public void pressOnDetailsButton () {
                    BrowserUtils.sleep(3);
                    us012.detailButton.click();
                    BrowserUtils.sleep(3);

                }



            @And("press on comments button")
            public void pressOnCommentsButton () {
                BrowserUtils.sleep(3);
                us012.commentButton.click();
                BrowserUtils.sleep(3);
                us012.commentButton.click();
            }


    @And("put {string} comment")
    public void putComment(String newWord) {
        us012.commentInput.sendKeys(newWord);
    }
            @And("press on post button")
            public void pressOnPostButton () {
                us012.commentPost.click();
            }

            @Then("verify the file has comment")
            public void verifyTheFileHasComment () {
               String actualResult = us012.commentPostVerify.getText();
               if(!actualResult.isEmpty()){
               Assert.assertTrue(actualResult,true);
            }
        }

    @When("user clicks on three dots button")
    public void userClicksOnThreeDotsButton() {
        us012.threeDotsMenu.click();
    }



}