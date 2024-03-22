package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //LEFT UPPER CORNER ICONS
    @FindBy(xpath = "(//a[@aria-label='Dashboard'][1])[1]")
    public WebElement dashBoardIcon;
    @FindBy(xpath = "(//a[@aria-label='Files'][1])[1]")
    public WebElement filesIcon;
    @FindBy(xpath = "(//a[@aria-label='Photos'][1])[1]")
    public WebElement photosIcon;
    @FindBy(xpath = "(//a[@aria-label='Activity'][1])[1]")
    public WebElement activityIcon;
    @FindBy(xpath = "(//a[@aria-label='Talk'][1])[1]")
    public WebElement talkIcon;
    @FindBy(xpath = "(//a[@aria-label='Mail'][1])[1]")
    public WebElement mailIcon;
    @FindBy(xpath = "(//a[@aria-label='Contacts'][1])[1]")
    public WebElement contactsIcon;
    @FindBy(xpath = "(//a[@aria-label='Circles'][1])[1]")
    public WebElement circlesIcon;
    @FindBy(xpath = "(//a[@aria-label='Calendar'][1])[1]")
    public WebElement calendarIcon;
    @FindBy(xpath = "(//a[@aria-label='Deck'][1])[1]")
    public WebElement deckIcon;
    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement tryCloudIcon;


    //RIGHT UPPER CORNER ICONS (HEADER MENU)
    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notificationsButton;
    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsButton;
    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement accountButton;
    @FindBy(linkText = "href=/index.php/settings/user")
    public WebElement settingsButtonUnderAccount;




}
