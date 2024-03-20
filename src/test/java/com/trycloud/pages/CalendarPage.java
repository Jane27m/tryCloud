package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement sixDotsButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[3]")
    public WebElement dailyViewButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[4]")
    public WebElement weeklyViewButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[5]")
    public WebElement monthlyViewButton;

    @FindBy(xpath = "(//button[@class='button primary new-event'])")
    public WebElement newEventButton;

    @FindBy(xpath = "(//input[@placeholder='Event title'])")
    public WebElement eventTitle;

    @FindBy(xpath = "(//button[@class='primary'])")
    public WebElement saveButton;


}
