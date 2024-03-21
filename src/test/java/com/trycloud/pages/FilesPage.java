package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    private final String folderName = "newFolder123";
    private final String fileName = "Screen";

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addButton;
    @FindBy(css = "input[type='file']")
    public WebElement uploadFileButton;
    @FindBy(xpath = "//a[@data-filetype='folder']")
    public WebElement newFolderButton;
    @FindBy(xpath = " //span[@class='innernametext']")
    public List<WebElement> uploadedFiles;
    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> threeDotsMenu;
    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']")
    public WebElement actionMenu;
    @FindBy(xpath = "//*[.='" + fileName + "']/../..//a[2]")
    public WebElement threeDotsMenuForUploadedFile;
    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement folderNameInput;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement folderConfirm;
    @FindBy(xpath = "//*[.='" + folderName + "']/../..//a[2]")
    public WebElement threeDotsMenuForNewFolder;
    @FindBy(xpath = "//span[@class='dirinfo']")
    public WebElement foldersCount;
    @FindBy(xpath = "//span[@class='fileinfo']")
    public WebElement filesCount;


}
