package com.testsite.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.testsite.pages.LinksPages;

public class FindElements_Demo {
	WebDriver driver;
	LinksPages lps;
	
	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.get("https:/www.flipkart.com/");	
		driver.manage().window().maximize();
		lps = new LinksPages(driver);
	}
	
	void testLinks() {
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class ='x3q9HG']/div/a"));
		// when there a re alot of elements we have to use looplike this 
		// to get and print each one particularly
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
	}
	
	void ClickLink() {
		lps.clickLinks();
	}
	
}
