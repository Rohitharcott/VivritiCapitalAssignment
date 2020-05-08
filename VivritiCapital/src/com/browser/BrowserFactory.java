package com.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	
	public static WebDriver StartApplication(WebDriver driver, String browserName, String appURL) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ROHITH\\\\Downloads\\\\Music\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(appURL);
	return driver;

	}
	
}
