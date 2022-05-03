package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.Homepage;

public class HomePageTest extends  Homepage { 
	@Test
	public void verifyemailid() throws InterruptedException
	{
		h.emailid();
		h.password();
		h.login();
		
		Thread.sleep(3000);
		h.enterFriend();
		h.clikonfirstresult();
		Thread.sleep(3000);
		h.message();
		Thread.sleep(3000);
		h.writemessage();
		Thread.sleep(3000);
		h.sendMsg();
		
		Thread.sleep(5000);
		
	}
	
	
	/*@Test
	public void verifypassword()
	{
		h.password();
	
	}
	
	@Test
	public void verifylogin()
	{
		h.login();
	
	}*/


}
