package com.testsite.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPages {
	
	@FindBy(xpath = "//div[@class ='x3q9HG']/div/a") List<WebElement> allLinks;
	
	public LinksPages(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String clickLinks() {
		String linkText = null;
		for(WebElement link: allLinks) {
			linkText = link.getText();
		}
		return linkText;
	}
}
