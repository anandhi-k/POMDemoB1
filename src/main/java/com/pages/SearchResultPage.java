package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SearchResultPage extends TestBase{
	
	@FindBy(xpath="//h1[contains(text(),'Search - Desktops')]")
	WebElement searchHeader;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public boolean validateElementPresent() {
		System.out.println("Search Header : " + searchHeader.getText());
		return searchHeader.isDisplayed();
	}

}
