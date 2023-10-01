package com.Magneto.Utility;

import org.openqa.selenium.WebDriver;

public class Utility {
	
	static WebDriver driver;
	public Utility(WebDriver driver)
	{
		this.driver = driver;
	}

	//--------------------------------
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		return title;
	}

}
