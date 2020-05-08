package com.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.browser.BrowserFactory;
import com.pages.HomePage;
import com.pages.PopUp;


public class SelectCity {
	
	WebDriver driver;

	@Test
		public void verifySelectCity()
		{

			BrowserFactory.StartApplication(driver, "Chrome", "https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#_");
			
			
			HomePage home=new HomePage(driver);
			PopUp pop=new PopUp(driver);
			
			
			home.deleteData();
			home.typeCity();
			home.clickGo();
			pop.clickTap();
			pop.clickReplace();
			pop.clickLeakPipe();
			pop.clickComments();
			pop.specifyDate();
			pop.specifyTime();
			pop.findEmail();
			
		
		}


	
	}


