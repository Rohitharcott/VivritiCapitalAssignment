package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PopUp {
	
	WebDriver driver;
	
	By Next1 = By.xpath("//button[@class='styles__nextButtonV2___1byer']");
	By Tap = By.xpath("//label[contains(@class,'styles__itemV2___1Vo1Z styles__itemBase___rDyIf')]//child::input[@id='cabd0db96acfabfbfdae39150c106b84a64e26f0']");
	By Next2 = By.xpath("//div[@class='styles__buttonBoxV2___3N27m']");
	By Replace = By.xpath("//div[contains(@class,'styles__itemContainerV2___3T5rr styles__itemContainerBase___2bhyD')]//child::label[@data-test='step_2_1']");
	By Next3 = By.xpath("//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']");
	By LeakInAPipe = By.xpath("//div[contains(text(),'Leak in a pipe')]");
	By Next4 = By.xpath("//button[contains(@class,'v2__primaryButton')]");
	By Comments = By.xpath("//textarea[contains(@class,'text-area__textArea___2N_HC input-text styles__textareaV2___2SDY1')]");
	By Skip = By.xpath("//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']");
	By Next5 = By.xpath("//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']");
	By SpecificDate = By.xpath("//div[contains(@class,'styles__circleIsActive___3oDLO styles__circleBase___2TZGg')]");
	By Next6 = By.xpath("//button[contains(@class,'v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded')]");
	By Date = By.xpath("//button[contains(@aria-label, 'May 9')]");
	By Next7 = By.xpath("//button[contains(@class,'v2__primaryButton')]");
	By DropDown = By.id("2fb1107f62b7900a8af4942e0a0532a856dd41ed");
	By Time = By.xpath("//option[@value='f681020ef4e20a07aadb5129f720b76790ec32e5']");
	By Next8 = By.xpath("//button[contains(@class,'v2__primaryButton___2quFJ')]");
	By Email = By.xpath("//input[@placeholder='Email address']");

	public PopUp(WebDriver driver)
	{
		this.driver=driver;
		
	}


	public void clickTap() {
		
		driver.findElement(Next1).click();
		driver.findElement(Tap).click();
	}


	public void clickReplace() {
		driver.findElement(Next2).click();
		driver.findElement(Replace).click();
	}



	public void clickLeakPipe() {
		driver.findElement(Next3).click();
		driver.findElement(LeakInAPipe).click();
		
	}
	
	public void clickComments() {
		
		driver.findElement(Next4).click();
		
		WebElement CommentText = driver.findElement(Comments);
		String TextInsideCommentText = CommentText.getAttribute("placeholder id");
		
		if(TextInsideCommentText.isEmpty())
		{
			driver.findElement(Skip).click();
			}
		else 
		{
			
			driver.findElement(Comments).sendKeys("Service Needed");
			driver.findElement(Next5).click();
		}
		
		}


	public void specifyDate() {
		
		driver.findElement(SpecificDate).click();
		driver.findElement(Next6).click();
		driver.findElement(Date).click();
	}

	
	public void specifyTime() {
		
		driver.findElement(Next7).click();
		driver.findElement(DropDown).click();
		driver.findElement(Time).click();
		driver.findElement(Next8).click();
	}

	public void findEmail( ) {
		
		String expectedTitle = "Email Address";
		
		WebElement actualTitle = driver.findElement(Email);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
	}

}




