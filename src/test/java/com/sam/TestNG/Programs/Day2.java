package com.sam.TestNG.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	void Register() {
		System.out.println("Register Page");
		Assert.assertEquals(1,1);
		
	}
	
	@Test(dependsOnMethods = {"Register"})
	void Product() {
		System.out.println("Product Page");

		Assert.assertEquals(2,3);
	}
		
	@Test
	void Payment() {
		System.out.println("Payment Page");
		Assert.assertTrue(false);
		
	}
	
	
	@Test
	void Login() {
		System.out.println("Login Page");
		Assert.assertNotEquals(4,4);
	}
	
	
	@Test
	void Cart() {
		System.out.println("Add to Cart Page");
	}
	

}
