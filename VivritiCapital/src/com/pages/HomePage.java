package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	WebDriver driver;
	
	By Postalcode = By.xpath("//input[@class='postal-code']");
	By Go = By.xpath("//button[contains(@class,'button button--branded blue go')]");
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
}
	public void deleteData()
	{
		driver.findElement(Postalcode).clear();
}

	public void typeCity()
	{
	
		driver.findElement(Postalcode).sendKeys("Chennai");
}
	
	public void clickGo()
	{
	
		driver.findElement(Go).click();
	}
	
}
