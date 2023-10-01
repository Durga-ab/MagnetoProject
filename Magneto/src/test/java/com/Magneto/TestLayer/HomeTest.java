package com.Magneto.TestLayer;

import org.testng.annotations.Test;

import com.Magneto.Pagelayer.HomePage1;
import com.Magneto.Pagelayer.LoginPage;
import com.Magneto.TestBase.TestBase;
import com.Magneto.Utility.Utility;

public class HomeTest extends TestBase {
	
	@Test
	public void verifythataddtocartproduct()
	{
		 LoginPage login_obj = new LoginPage(driver);
		 HomePage1 homepage_obj = new HomePage1(driver);
		 Utility utility_obj =new Utility(driver);
		 login_obj.clickOnSignInBtn();
		 login_obj.enterEmail("purvap121@gmail.com");
		 login_obj.enteronPassword("purv@100");
		 homepage_obj.enteronSerchTxtbox("adidas Hoodie");
		 homepage_obj.enteronSerchTxtbox();
		 homepage_obj.clickOnFirstImg();
	}

}
