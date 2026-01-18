package com.testsite.testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testsite.pages.LoginPage;

public class LoginTestCase {
	
	WebDriver driver;
	LoginPage lp;
	@BeforeClass
	void setUp() {
	
		driver= new ChromeDriver();
		driver.get("https://www.javabykiran.in/other/CC/login");
		lp = new LoginPage(driver);
	}
	
	@Test
	void testLogin() {
		lp.email("sam@gmail.com");
		lp.password("sam123");
		lp.remember();
		lp.login();
		Assert.assertEquals(lp.invalidEmailMessage(), "Please enter a valid email address");
		}

		@DataProvider(name = "td")
		public String[][] testData() {
			
		     
			String data[][] = 
				{{"iranna@gmail.com","Iranna@123"},
					{"25768","25764"},
					{"iranna@com.gmail","Iranna@123"}};
			
					return testData();
					}
}
