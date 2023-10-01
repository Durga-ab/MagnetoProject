package com.Magneto.Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By sign_btn=By.xpath("//a[contains(text(),'Sign In')][1]");
	private By email_txtbox=By.xpath("//input[@id='email']");
	private By password_txtbox=By.xpath("//input[@id='pass']");
	private By login_btn=By.xpath("//button[@id='send2'][1]");

	public void clickOnSignInBtn()
	{
		driver.findElement(sign_btn).click();
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(email_txtbox).sendKeys(email);
	}
	
	public void enteronPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);;
	}
	
	public void clickOnLoginBtn()
	{
		driver.findElement(login_btn).click();;
	}


	

}
