package com.qa.testBase;






import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.PageLayerHomepage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Homepage {
public static  WebDriver driver;

public PageLayerHomepage h;	
	
	

	@BeforeMethod
	
	public void start() {
		String s="chrome";
		if(s.equalsIgnoreCase("chrome")) 
		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(s.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("provide correct browser name");
		}
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		h = new PageLayerHomepage();
			
	}
	
       @AfterMethod
       public void tearDown()
       {
    	  // driver.quit();
       }
	

		}//
	
