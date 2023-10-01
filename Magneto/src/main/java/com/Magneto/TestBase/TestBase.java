package com.Magneto.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 String browser="Chrome";
		 if (browser.equalsIgnoreCase("Chrome"))
		 {
		   driver = new ChromeDriver();
		 }
		 else if (browser.equalsIgnoreCase("FireFox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else if (browser.equalsIgnoreCase("Edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Please provide valid browser name");
		 }
			 
			driver.get("https://magento.softwaretestingboard.com/") ;
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			}
	
	@AfterMethod
	public void TearDown()
	{
		//driver.quit();
	}

}



