package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory
	@FindBy(name="search")
	@CacheLookup
	WebElement searchBox;
	@FindBy(className="input-group-btn")
	WebElement searchBtn;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateTitle() {
		return driver.getTitle();
	}
	public SearchResultPage searchItem(String searchText) {
		searchBox.sendKeys(searchText);
		searchBtn.click();
		return new SearchResultPage();
	}
}
