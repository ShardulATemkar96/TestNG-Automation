package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frame_Demo {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
	}
	
//	@AfterClass
//	void tearDown() {
//		driver.quit();
//	}
	
	@Test
	void testFrame() {
		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input"))
		.sendKeys("Single Frame");
		
		//To get title of the page
		System.out.println(driver.getTitle());
		
		//to come out of all the frames
		driver.switchTo().defaultContent();
		
		//to come out of one frame
		driver.switchTo().parentFrame();
		
		//Handling nested frames
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	}
	

}
