package com.OrangeHRM.StepDefinitions;

import org.junit.Assert;

import com.OrangeHRM.pages.AddUserPage;
import com.OrangeHRM.pages.AdminPage;
import com.OrangeHRM.pages.DashboardPage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.pages.UserPage;
import com.OrangeHRM.util.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OrangeHRM_UserManagement_Steps extends BasePage{

	
    LoginPage loginPage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    UserPage userPage;
    AddUserPage addUserPage;
   
//    @Before
//    public void launchUrl()
//    {
//    	System.out.println("Before Method before initialization in user steps");
//    	BasePage.initialization();
//    }
    
	@Given("user logged in as admin")
	public void user_logged_in_as_admin() {
		System.out.println("Before initialization in user management steps");
		BasePage.initialization();
		loginPage=new LoginPage();
		dashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals("Dashboard", dashboardPage.verifyDashboardPage());
	}

	@When("user click on admin and hover usermanagement and click on users")
	public void hover_admin_and_usermanagement_and_click_on_users() {
		adminPage=dashboardPage.clickOnAdmin();
		userPage=adminPage.clickOnUsers();
		System.out.println("hover method");
		
	}

	@Then("click on Add user")
	public void click_on_Add_user() {
	    addUserPage=userPage.clickOnAdd();
	}
	
	@Then("enter userRole, employeeName, username and status and click on Save button")
	public void enter_new_user_details() throws InterruptedException
	{
		addUserPage.enter_new_user_details(userProp.getProperty("userRole"), userProp.getProperty("employeeName"), userProp.getProperty("userName"),userProp.getProperty("status"),userProp.getProperty("password"));
	}
	
	@Then("User should be added in the users list")
	public void user_should_be_added_in_the_users_list() {
		Assert.assertTrue(userPage.verifyAddedUser(userProp.getProperty("userName")));
	    
	}

	
	@Given("admin logs in and go to admin page")
	public void admin_logs_in_and_go_to_admin_page() throws InterruptedException {
	   System.out.println("############ Delete User Scenario ############");
	   BasePage.initialization();
		loginPage=new LoginPage();
		dashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals("Dashboard", dashboardPage.verifyDashboardPage());
		adminPage=dashboardPage.clickOnAdmin();
		
	}

	@When("admin selects user to be deleted from the list of users and click on delete button")
	public void admin_selects_user_to_be_deleted_from_the_list_of_users_and_click_on_delete_button() throws InterruptedException {
		userPage=adminPage.clickOnUsers();
	    userPage.deleteUser(userProp.getProperty("userName"));
	}

	@Then("selected user should be deleted from the users list")
	public void selected_user_should_be_deleted_from_the_users_list() {
		Assert.assertTrue(userPage.verifyUserDeleted(userProp.getProperty("userName")));
	    
	}

	
	
	
	
	
	
	
	@After
	public void teardown()
	{
		BasePage.tearDown();
	}

	

    
}
