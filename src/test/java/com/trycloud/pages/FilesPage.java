package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[normalize-space()='Upload file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//span[@class='displayname'][normalize-space()='New folder']")
    public WebElement newFolderButton;

    @FindBy(xpath = "//tr[@class='ui-droppable highlighted']//span[@class='icon icon-more']")
    public WebElement moreIcon;

    @FindBy(xpath = "(//span[@class='icon icon-delete'])[2]")
    public WebElement deleteButton;


}
