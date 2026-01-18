package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTables {

	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

	}
	
	@Test
	void testcolumns() {
//		WebElement  first_Name = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/thead/tr/th[1]")); 
//		System.out.println("First Column Name: " + first_Name.getText());
		
		for (int i = 1; i<=7; i++) {
			String AllColumns = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/thead/tr/th["+i+"]")).getText();
					System.out.println("Column " + i + ": " + AllColumns);
		}
	}
}