package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US004_Deck_iconPage {

    public US004_Deck_iconPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   @FindBy(xpath = "//a[@aria-label='Deck'][1][1]")
   public WebElement deck;


    @FindBy(xpath = "//input[@type='text']")
    public WebElement AddBoard;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement BoardName;


    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement ConfirmText;


    @FindBy(xpath = "//div[@class='app-navigation-entry__title']")
    public WebElement BurimBoard;

@FindBy(xpath = "//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip']")
   public WebElement  newAddListInput;




@FindBy(xpath = "//div[@aria-describedby='popover_wh8aqbr481']")
    public WebElement threeDots;

@FindBy(xpath = "(//span[@class='action-button__text']")
    public WebElement assignedToMe;






}
