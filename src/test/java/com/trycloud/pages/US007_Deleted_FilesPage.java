package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US007_Deleted_FilesPage {

    public US007_Deleted_FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[contains(@class, 'nav-icon-trashbin')]")
    public WebElement deleteFiles;

    @FindBy(xpath = "//span[normalize-space()='Deleted']")
    public WebElement deletedButton;

    @FindBy(xpath= "(//tbody/tr[1]/td[2]//span[@class='icon icon-more'])[2]")
    public WebElement threeDots;

    @FindBy(xpath = "//a[.='Deleted']/../../../..//tbody//span[.='Delete permanently']")
    public WebElement deleteFilePermanently;

      @FindBy(xpath = "//span[text()='Cybertruck']")
      public WebElement folderName;

    @FindBy(xpath = "//tbody/tr[1]/td[2]//span[@class='fileactions']//span[.=' Restore']")
    public WebElement restoreButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]//span[@class='fileactions']//span[.=' Restore']")
    public WebElement deletedFirstLineRestore;
    @FindBy(xpath = "//div[@id=\"app-content-trashbin\"]/table/tbody/tr[1]/td[2]//span[@class='nametext extra-data']//span[@class='innernametext']")
    public WebElement deletedFirstLineName;


    @FindBy(xpath = "//a[.='All files']")
    public WebElement allFilesButton;
    @FindBy(xpath = "//div[@id='app-content-trashbin']/table/tbody/tr")
    public List<WebElement> allDeletedFiles;
    @FindBy(xpath = "//tbody/tr[1]/td[2]//span[@class='innernametext']")
    public WebElement firstLineName;

    @FindBy(id="fileList")
    public List<WebElement> fileList;

    public List<String> getAllFileName(){
        List<String> allFilesName = new ArrayList<>();
        List<WebElement> allFiles = Driver.getDriver().findElements(By.xpath("//tbody/tr//span[@class='innernametext']"));
        for (WebElement element:allFiles) {
            allFilesName.add(element.getText());
        }
        return allFilesName;
    }
}

