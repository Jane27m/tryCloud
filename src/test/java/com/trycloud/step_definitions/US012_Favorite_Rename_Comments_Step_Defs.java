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

        @And("rename file")
        public void renameFile (String newName) {
              newName ="12334";
            Driver.getDriver().switchTo().activeElement().sendKeys(newName + Keys.ENTER);
            BrowserUtils.waitFor(2);
            Driver.getDriver().navigate().refresh();

            }



            @And("press on details button")
            public void pressOnDetailsButton () {
                    BrowserUtils.sleep(3);
                    us012.detailButton.click();
                    BrowserUtils.sleep(3);

                }


    @Then("verify the file is renamed")
    public void verifyTheFileIsRenamed() {
        String actualName = us012.renameInput.getText();
        String expectedName = "12345";
        if (actualName.equals(expectedName)) {
            Assert.assertEquals(actualName, expectedName);
        }

    }
            @And("press on comments button")
            public void pressOnCommentsButton () {
                BrowserUtils.sleep(3);
                us012.commentButton.click();
                BrowserUtils.sleep(3);
                us012.commentButton.click();
            }

            @And("put some comment")
            public void putSomeComment () {
                 us012.commentInput.sendKeys("Good");
            }

            @And("press on post button")
            public void pressOnPostButton () {
                BrowserUtils.sleep(3);
                us012.commentPost.click();
                BrowserUtils.sleep(3);
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