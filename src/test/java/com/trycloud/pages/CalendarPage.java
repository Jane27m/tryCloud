package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
/*
    @FindBy(xpath = "//button[@data-view='day']")
    private WebElement dailyViewButton;

    @FindBy(xpath = "//button[@data-view='week']")
    private WebElement weeklyViewButton;

    @FindBy(xpath = "//button[@data-view='month']")
    private WebElement monthlyViewButton;
*/

    @FindBy(xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement sixDotsButton;

    @FindBy(xpath = "(//span[@class='action-button__text'])[3]")
    public WebElement dailyViewButton;

    @FindBy(xpath = "//button[@ng-value='agendaWeek']")
    public WebElement weeklyViewButton;

    @FindBy(xpath = "//button[@ng-value='month']")
    public WebElement monthlyViewButton;


}
