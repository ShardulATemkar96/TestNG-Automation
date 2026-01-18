package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actions_Demo {

	WebDriver driver;
	WebElement WebElement;
	Actions ac;
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
	
	}
	
	@Test
	void testActions() {
	
	Actions ac = new Actions(driver);
	
	//ac.click(driver.findElement(By.id("Register"))).perform(); //click action
//		ac.doubleClick().perform(); //double click action
//		ac.contextClick().perform(); //right click action
//		ac.clickAndHold(driver.findElement(By.className("btn_checkavail"))).perform(); //click and hold action
//		ac.release().perform(); //release action
	
	}
	
	@Test
	void testdragAndDrop() {
		WebElement source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		ac.dragAndDrop(source, target).perform(); //drag and drop action
		
	}
	
	@Test
	void testKeyboardActions() {
		driver.findElement(By.name("q")).sendKeys("selenium.dev", Keys.ENTER); //keyboard action
	}
}
