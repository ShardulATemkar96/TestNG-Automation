package com.Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class TestCase {

	@Test
	void TestLogin(){
		Assert.assertTrue(true);
	}
}
