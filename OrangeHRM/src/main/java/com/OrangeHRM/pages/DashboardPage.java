package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import com.OrangeHRM.util.BasePage;

public class DashboardPage extends BasePage {

	UserPage userPage;
	By heading_dashboard=By.xpath("//h1[contains(text(),'Dashboard')]");
	By menu_admin=By.xpath("//b[contains(text(),'Admin')]");
	
	
		
	public AdminPage clickOnAdmin()
	{
		driver.findElement(menu_admin).click();
		return new AdminPage();
	}
	
		
	
	public String verifyDashboardPage()
	{
		System.out.println("inside verify dashboard page method");
		return driver.findElement(heading_dashboard).getText();
	}
	
}
