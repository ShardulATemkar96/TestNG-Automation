package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert_Demo {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	
	@Test
	void testAlert() throws Exception {
	
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert al= driver.switchTo().alert();
		
		Thread.sleep(2000);
		//To press ok button
		al.accept();
		
		//different Webelement
		//to press cancel button
		al.dismiss();
		
		//different Webelement		
		//To enter text in alert box
		al.sendKeys("Hello");
		
		//different Webelement
		//To get text from alert box
		al.getText();
	}
	

}
