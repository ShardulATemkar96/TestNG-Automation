package com.sam.TestNG.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Day3 {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	void setUp() {
		System.out.println("Open Browser and url");
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
//	@AfterMethod
//	void tearDown() {
//		driver.quit();
//	}
//	
	@Test
	void valid() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		WebElement text = driver.findElement(By.xpath("//h1[text() ='Loggedd In Successfully']"));	
		String actualResult = text.getText();
		String expectedResult = "Logged In Successfully";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	void invalidUsername() {
	    driver.findElement(By.id("username")).sendKeys("Student");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.id("submit")).click();
	    
	    WebElement text = driver.findElement(By.xpath("//p[@id='error']"));
	    String actualResult = text.getText();
	    String expectedResult = "Your username is invalid!";
	    
	    Assert.assertEquals(actualResult, expectedResult);
	}


		@Test
		void register() {
			System.out.println("Register Page");
		}

}
