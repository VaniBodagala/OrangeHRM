package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.util.BasePage;

public class AdminPage extends BasePage {
	
	
	By menu_admin_usermanagement=By.id("menu_admin_UserManagement");
	By menu_admin_users=By.id("menu_admin_viewSystemUsers");
	//By menu_admin=By.xpath("//b[contains(text(),'Admin')]");
	
	public UserPage clickOnUsers()
	{
		//System.out.println("url before clicking on user"+driver.getCurrentUrl());
		Actions action=new Actions(driver);
		System.out.println("inside click on users");
		action.moveToElement(driver.findElement(menu_admin_usermanagement)).build().perform();
		driver.findElement(menu_admin_users).click();
		//System.out.println("url after clicking on user"+driver.getCurrentUrl());
		return new UserPage();
		
	}

}
