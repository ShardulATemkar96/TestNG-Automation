package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Navigation_Demo {
	
	WebDriver driver;
	@BeforeClass
	void setIp() {
		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
		
	@Test
	void testNavigate() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='_1TOQfO']")).click();
		Navigation navigate = driver.navigate();
		
		Thread.sleep(2000);
		navigate.back();
		
		Thread.sleep(2000);
		navigate.forward();
		
		Thread.sleep(2000);
		navigate.refresh();
		
	}
	
	
}
