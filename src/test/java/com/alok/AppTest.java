package com.alok;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
//	Test case for the login interface that requires an user name and password;
	@Test
	public void testlogin1() {
		App myapp = new App();
		Assert.assertEquals(0, myapp.Login("alok","alok123"));
	}
	
//	Another test case that requires the another user name or password but the correct one.
	@Test
	public void testlogin2() {
		App myapp = new App();
		Assert.assertEquals(0, myapp.Login("alok","alok@123"));
	}
	

}
