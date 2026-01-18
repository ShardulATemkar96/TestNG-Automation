package com.Selenium;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Window_Demo {
	
	WebDriver driver;
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to("https://flipkart.com");
		
	}
	
	@Test
	void testWindow() {
		driver.findElement(By.linkText("Myntra")).click();
		
		//to get the window id of current window(single window)
//		String windowId = driver.getWindowHandle();
//		System.out.println("Window ID: " + windowId);
		
		//assigning multiple window ids to a set<string>
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows ID: " + allWindowsId);
		
		//Convert Set to List
		List<String> WindowIds = new ArrayList<>(allWindowsId);
		
		//Switching to second window
		driver.switchTo().window(WindowIds.get(1));
		
		//Perform operation on second window
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"))
		.sendKeys("Selenium Books");
				
	}
	

}
