package com.testsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name ="username") WebElement txtEmail;//WEbelement txtEmail is assigned the method         
												  //this is constructor of page factory
	@FindBy(name ="password") WebElement txtPassword;		//this is a constructor
	@FindBy(id = "login-remember") WebElement checkRememberMe; // constructor of remember me checkbox
	@FindBy(xpath = "//button[@name ='submit']") WebElement btnLogin; // constructor of login button
	@FindBy(xpath ="//small[@text = 'Pleaseenter a valid email address']") WebElement msgInvalidEmail; // constructor of invalid email message

	
//	int a;
//	LoginPage(int a){
//		this.a = a; // when object is created value is passed to constructor 
//					//and assigned to instance variable
//	}
	
	public LoginPage(WebDriver driver){ 
		PageFactory.initElements(driver,this);// this keyword refers to current class 
											  //object and initialized every object all at once 

	}
	// this is a concept of method overloading from java 
	
	public void email(String ename) {// method to enter email whenever ename is called and
									 // then value is passed to ename parameter
		txtEmail.sendKeys(ename);
	}
	public boolean email() {// method to to check email field is displayed
		return txtEmail.isDisplayed();
	}
	
	public void password(String pwd) {// method to enter password whenever pwd is called and
									 // then value is passed to pwd parameter
		txtPassword.sendKeys(pwd);
	}
	public boolean password() {// method to to check password field is displayed
		return txtPassword.isDisplayed();
	}
	
	public void remember() {
		checkRememberMe.click();
	}
	
	public void login() {
		btnLogin.click();
	}
	public String invalidEmailMessage() {
		return msgInvalidEmail.getText();
	}
}
