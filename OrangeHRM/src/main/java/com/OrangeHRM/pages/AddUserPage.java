package com.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

//import com.OrangeHRM.util.BasePage;
import com.OrangeHRM.util.BasePage;
public class AddUserPage extends BasePage {
	
	By select_role=By.id("systemUser_userType");
	By txt_empName=By.id("systemUser_employeeName_empName");
	By txt_username=By.id("systemUser_userName");
	By select_status=By.id("systemUser_status");
	By txt_password=By.id("systemUser_password");
	By txt_cfm_password=By.id("systemUser_confirmPassword");
	By btn_save=By.id("btnSave");
	
	public void enter_new_user_details(String userRole,String empName,String username,String status,String password) throws InterruptedException
	{
		Select selectRole=new Select(driver.findElement(select_role));
		selectRole.selectByVisibleText(userRole);
		
		driver.findElement(txt_empName).sendKeys(empName);
		driver.findElement(txt_username).sendKeys(username);
		
		Select selectStatus=new Select(driver.findElement(select_status));
		selectStatus.selectByVisibleText(status);
		
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(txt_cfm_password).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(btn_save).click();
	}

}
