package com.Magneto.Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage1 {
	
	private WebDriver driver;
	public HomePage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search_txtbox=By.xpath("//input[@id='search']");
	
	private By product_img=By.xpath("//img[@class='product-image-photo'][1]");
	//private By addtocart_btn=By.xpath("//*[contains(@id,'send2')][1]");
	
	public void enteronSerchTxtbox(String search)
	{
		driver.findElement(search_txtbox).sendKeys(search);
		
	}
	
	public void enteronSerchTxtbox ()
	{
		driver.findElement(search_txtbox).click();
	}
	
	public void clickOnFirstImg()
	{
		driver.findElement(product_img).click();
	}

}
