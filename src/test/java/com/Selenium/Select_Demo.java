package com.Selenium;
import java.util.List;

//17/12/025
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Select_Demo {

	WebDriver driver;
	WebElement WebElement;
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
	}
	
	@Test
	void testSelect() {
	
		Select day = new Select(driver.findElement(By.className("Day")));
		day.selectByIndex(10); //select by index
	
		Select month = new Select(driver.findElement(By.className("Month")));
		month.selectByVisibleText("MAY"); //select by visible text

		Select year = new Select(driver.findElement(By.className("Year")));
		year.selectByValue("1995"); //select by value
		
		Select Country = new Select(driver.findElement(By.id("country")));
		Country.selectByVisibleText("India"); //select by visible text
		
		WebElement ele = Country.getFirstSelectedOption();
		System.out.println("First selected option is: " + ele.getText());
		
		List<WebElement> allOptions = Country.getOptions();
		for(WebElement option : allOptions){
			System.out.println("Options are : " + allOptions);
		}
	}	
}
