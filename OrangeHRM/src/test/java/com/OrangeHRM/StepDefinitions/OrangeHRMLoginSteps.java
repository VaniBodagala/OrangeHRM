package com.OrangeHRM.StepDefinitions;
import org.junit.Assert;
import com.OrangeHRM.util.BasePage;
import com.OrangeHRM.pages.DashboardPage;
import com.OrangeHRM.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//import com.OrangeHRM.Pages.DashboardPage;
//import com.OrangeHRM.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OrangeHRMLoginSteps extends BasePage{

	//WebDriver driver=null;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
//	@Before
//	public void launchUrl()
//	{
//		System.out.println("Before method Before initialization");
//		BasePage.initialization();
//		
//	}
//	
	@Given("user is on OrangeHRM Login page")
	public void user_is_on_OrangeHRM_Login_page() {
		System.out.println("Before initialization in loginsteps");
		BasePage.initialization();
		loginPage=new LoginPage();
		
		
		System.out.println("page title is: "+driver.getTitle());
	}

	
	@When("Login page is verified")
	public void login_page_is_verified() {
		Assert.assertTrue(loginPage.verifyLoginPanelIsDisplayed());
	}

	@Then("^user enters username and password and click on Login button$")
	public void user_enters_username_and_password_and_click_on_Login_button() {

		dashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Then("user is navigated to dashboard page")
	public void user_is_navigated_to_dashboard_page() {
		
		Assert.assertEquals("Dashboard", dashboardPage.verifyDashboardPage());
		System.out.println("Page Title is: "+driver.getTitle());
		
		//BasePage.tearDown();
		
	}
	
	
	@After
	public void teardown()
	{
		BasePage.tearDown();
	}
}



