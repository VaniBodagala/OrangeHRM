package com.OrangeHRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.util.BasePage;

public class UserPage extends BasePage{
	
	By btn_addUser=By.id("btnAdd");
	By userList=By.xpath("//table[@id='resultTable']//td/a");
	//table[@id='resultTable']//td/a[contains(text(),'fiona.grace')]/parent::td/preceding-sibling::td/input
	By btn_deleteUser=By.id("btnDelete");
	By btn_deleteOk=By.id("dialogDeleteBtn");
	public AddUserPage clickOnAdd()
	{		
		System.out.println("inside click on add method");
		driver.findElement(btn_addUser).click();
		return new AddUserPage();
	}
	
	public boolean verifyAddedUser(String userName)
	{
		boolean flag=false;
		List<WebElement> usersList=driver.findElements(userList);
		for(WebElement user:usersList)
		{
			//System.out.println("The list of users is : "+ user.getText());
			if(user.getText().equalsIgnoreCase(userName)) {
				flag=true;
				System.out.println("user "+userName+" is created successfully");
			}
				
		}
		return flag;
	}
	
	public void deleteUser(String userName) throws InterruptedException
	{
		List<WebElement> usersList=driver.findElements(userList);
		
		for(WebElement user:usersList)
		{
			//System.out.println("The list of users is : "+ user.getText());
			if(user.getText().equalsIgnoreCase(userName)) {
				//System.out.println("user "+userName+" is created successfully");
				By chk_user=By.xpath("//table[@id='resultTable']//td/a[contains(text(),'"+userName+"')]/parent::td/preceding-sibling::td/input");
				//driver.findElement(chk_user).sendKeys(Keys.ENTER);
				driver.findElement(chk_user).click();
				
				//user.findElement(By.xpath("//parent::td/preceding-sibling::td/input")).click();
				//Thread.sleep(40000);
			}
				
		}
		//By chk_user=By.xpath("//table[@id='resultTable']//td/a[contains(text(),'vanibodagala5')]/parent::td/preceding-sibling::td/input");
		//driver.findElement(chk_user).click();
		
		Thread.sleep(5000);
		driver.findElement(btn_deleteUser).click();
		Thread.sleep(5000);
		driver.findElement(btn_deleteOk).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
	}

}
