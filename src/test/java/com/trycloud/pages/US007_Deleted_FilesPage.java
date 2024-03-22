package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US007_Deleted_FilesPage {

    public US007_Deleted_FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[contains(@class, 'nav-icon-trashbin')]")
    public WebElement deleteFiles;

    @FindBy(xpath = "//span[normalize-space()='Deleted']")
    public WebElement deletedButton;

    @FindBy(xpath= "/html/body/div[3]/div[2]/div[15]/table/tbody/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement threeDots;

    @FindBy(css = "/html/body/div[3]/div[2]/div[13]/table/tbody/tr[1]/td[2]/div/ul/li[1]/a/span[2]")
    public WebElement deleteFilePermanently;

    @FindBy(xpath = "//a[@class='action action-restore permanent']")
    public long restoreButton;

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement allFilesButton;


    @FindBy(id="fileList")
    public List<WebElement> fileList;

    @FindBy(id = "fileList")
    public WebElement deletedFileList;

    @FindBy(xpath = "//span[contains(@class, 'modified live-relative-timestamp')]")
    public WebElement timeStamp;

    @FindBy(xpath = "select-trashbin-28513")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id='select_all_trash']")
 public WebElement allCheckBoxes;
}

