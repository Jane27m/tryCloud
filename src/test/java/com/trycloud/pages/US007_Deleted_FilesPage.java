package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US007_Deleted_FilesPage {

    public US007_Deleted_FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//a[contains(@class, 'nav-icon-trashbin')]")
   public WebElement deleteFiles;

    @FindBy(xpath = "//div[13]/table[1]/thead[1]/tr[1]/th[3]/a[1]/span[1]")
    public WebElement deletedButton;

    @FindBy(xpath = "//a[contains(@class, 'action action-menu permanent')]")
    public WebElement threeDots;

    @FindBy(xpath = "//span[text()='Delete permanently']")
    public WebElement deleteFilePermanently;

    @FindBy(xpath = "//a[contains(@class, 'action action-restore permanent')]")
    public WebElement restoreButton;

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement allFilesButton;
}

