package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US012 {
    public US012(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement threeDotsMenu;
    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement addFavoriteButton;

    @FindBy(xpath = "//span[text()='Favorited']")
    public List<WebElement> removeFromFavorite;

    @FindBy(xpath = "//span[@class='icon icon-rename']")
    public WebElement renameNameButton;

    @FindBy(xpath = "//tr[@data-id='131347']//span[@class='innernametext']")
    public WebElement renameInput;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement detailButton;

    @FindBy(id = "(//a[@aria-controls='tab-commentsTabView']")
    public WebElement commentButton;
    @FindBy(xpath = "//div[@data-placeholder='New comment …']")
    public WebElement commentInput;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement commentPost;


    @FindBy(xpath = "(//div[@class='newCommentRow comment'])//div[@class='message']")
    public WebElement commentPostVerify;


}
