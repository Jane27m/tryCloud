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

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addButton;


    //@FindBy(xpath = "//label[@data-action='upload']")
    @FindBy(css = "input[type='file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//span[@class='displayname'][normalize-space()='New folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//tr[@class='ui-droppable highlighted']//span[@class='icon icon-more']")
    public WebElement moreIcon;

    @FindBy(xpath = " //span[@class='innernametext']")
    public List<WebElement> uploadedFiles;

    @FindBy(xpath = "//span[text()='Screen']/../../span/a[2]")
    public WebElement threeDotsMenu;
    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deleteButton;
}
