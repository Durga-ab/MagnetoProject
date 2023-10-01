package com.Magneto.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Magneto.Pagelayer.HomePage1;
import com.Magneto.Pagelayer.LoginPage;
import com.Magneto.TestBase.TestBase;
import com.Magneto.Utility.Utility;


public class LoginTest extends TestBase 
{
	@Test
	public void verifythatclickonsigninbutton ()
	{
		 String expected_output = "Home Page";
		 LoginPage login_obj = new LoginPage(driver);
		 Utility utility_obj =new Utility(driver);
		 login_obj.clickOnSignInBtn();
		 login_obj.enterEmail("purvap121@gmail.com");
		 login_obj.enteronPassword("purv@100");
		 login_obj.clickOnLoginBtn();
		 Assert.assertEquals(utility_obj.getTitleOfPage(),expected_output);
		 
		 System.out.println("Enter inside the Home page");
		 
		
	

	}
}
