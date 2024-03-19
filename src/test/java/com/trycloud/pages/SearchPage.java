package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
@FindBy(className = "material-design-icon__svg")
    public WebElement searchButton;

    @FindBy(className = "unified-search__form-input")
    public WebElement searchInputButton;

    @FindBy(className = "material-design-icon__svg")
    public WebElement firstSearchResult;

//    @FindBy(className = "material-design-icon__svg")
//    public WebElement searchButton;
}
