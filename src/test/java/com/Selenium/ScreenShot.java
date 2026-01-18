package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenShot {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

	}
	
	@Test
	void testScreenshot() throws IOException {
		TakesScreenshot tks = (TakesScreenshot)driver; // type casting is done here 
		File source = tks.getScreenshotAs(OutputType.FILE); // storing in a file as a file
		
		File target = new File("C:\\Users\\SAM\\TestingWorkspace\\TestNG\\ScreenShot");
		
		FileHandler.copy(source, target);
	}

}
