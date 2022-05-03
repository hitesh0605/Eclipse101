package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Homepage;

public class PageLayerHomepage extends Homepage {
	public PageLayerHomepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	@FindBy (xpath="(//input[@aria-label='Search Facebook'])[1]")
	private WebElement searchbox;
	
	@FindBy (xpath="(//ul[@role='listbox']//li[1]//span)[1]")
	private WebElement firstresult;
	
	@FindBy (xpath="//span[text()='Message']")
	private WebElement Message;
	
	@FindBy (xpath="//div[@role='textbox']")
	private WebElement messagewr;
	
	@FindBy (xpath=" //div[@aria-label='Press Enter to send']")
	private WebElement sendmsg;
	
	public void emailid ()
	{
		emailid.sendKeys("9637010605");
	}
	
	public void password()
	{
		password.sendKeys("Hitesh10@");
	}
	
	public void login()
	{
		login.click();
	}
	public void enterFriend() {
	searchbox.sendKeys("Dhananjay Khanjir");
	}
	public void clikonfirstresult()
	{
		 firstresult.click();
	}
    public void message()
    {
    	 Message.click();
    }
    public void writemessage() {
    	 Message.sendKeys("hi dhananjay");	
    }
  
    public void sendMsg() {
    	 sendmsg.click();//
    }
}
