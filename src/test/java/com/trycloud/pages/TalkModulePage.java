package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {

    public TalkModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;


    @FindBy(id = "submit-form")
    public WebElement loginButton;

     */



    @FindBy (xpath = "(//a[@aria-label='Talk'][1])[1]")
    public WebElement talkModuleButton;



    @FindBy (xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement newConversationButton;

    @FindBy (xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationNameInput;

    @FindBy (id = "checkbox")
    public WebElement allowGuestsCheckBox;

    @FindBy (xpath = "//button[contains(.,'Add participants')]")
    public WebElement addParticipantsButton;

    @FindBy(xpath = "//li[@class='participant-row isSearched'][3]")
    public WebElement select_a_participant;

    @FindBy(xpath = "//button[contains(.,'Create conversation')]")
    public WebElement create_conversation_button;

    @FindBy (className = "navigation__button navigation__button-right primary")
    public WebElement closeButton;

    @FindBy(className = "(//div[contains(.,'UI sprint')])[2]")
    public WebElement newConversation;

    @FindBy (xpath = "(//button[@aria-label='Conversation settings'])[1]")
    public WebElement threeDotButtonToDelete;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleteConversationButton;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yes_to_delete;

}
