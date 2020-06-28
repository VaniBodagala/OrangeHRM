package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import com.OrangeHRM.util.BasePage;

public class LoginPage extends BasePage{
	
	DashboardPage dashboardPage;
	By txt_username=By.id("txtUsername");
	By txt_password=By.id("txtPassword");
	By btn_login=By.id("btnLogin");
	
	By heading_loginPanel=By.id("logInPanelHeading");
	
	
	public DashboardPage login(String username,String password)
	{
		driver.findElement(txt_username).clear();;
	    driver.findElement(txt_username).sendKeys(username);
	    driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.navigate().back();
		return new DashboardPage();
		
	}
	
	public boolean verifyLoginPanelIsDisplayed()
	{
		return driver.findElement(heading_loginPanel).isDisplayed();
	}
	
	
	
	
	

}
