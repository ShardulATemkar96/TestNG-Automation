package com.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Waits_Demo {

	WebDriver driver;
	WebElement WebElement;
	WebDriverWait wait;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
	//	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.get("https://flipkart.com/");
	
	}
	
	@Test
	void testaits() {
//		driver.findElement(By.id("btn1")).click();
//	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  implicit wait
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1"))).sendKeys("Welcome");
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1"))).sendKeys("Welcome");
//		
//		wait.until(ExpectedConditions.and(
//				ExpectedConditions.visibilityOfElementLocated(By.id("txt1")),
//				ExpectedConditions.presenceOfElementLocated(By.id("txt1"))
//				));
//		
//		wait.until(ExpectedConditions.or(
//				ExpectedConditions.visibilityOfElementLocated(By.id("txt1")),
//				ExpectedConditions.presenceOfElementLocated(By.id("txt1"))
//				));
//		
//		driver.findElement(By.id("txt1")).sendKeys("Selenium Waits Demo");
		
		//Flipkart
	//	driver.findElement(By.className("iyMZqb")).click();
//		driver.findElement(By.xpath("//a[@title='Login']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlToBe("https://www.flipkart.com/account/login?ret=/"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
				            
	}
}
