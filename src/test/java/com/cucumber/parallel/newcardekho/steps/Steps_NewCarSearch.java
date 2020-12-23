package com.cucumber.parallel.newcardekho.steps;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
//import com.cucumber.grid.pages.actions.Action_CarDekhoHomePage;
import com.cucumber.grid.pages.actions.Action_NewCarSearchPage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;
import com.cucumber.parallel.extent.ExtentManager;
import com.cucumber.parallel.extent.ExtentTestManager;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_NewCarSearch extends BaseSteps{
	
	protected Scenario scenario;
	static String scenarioName;
	static int i=0;
	Action_NewCarSearchPage obj_action_NewCarSearchPage= new Action_NewCarSearchPage();
	
	@Before
	public void before(Scenario scenario) throws Exception
	{
		i=i+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		System.out.println("SCENARIO NAME FOR TEST IS " +scenarioName );
		ExtentTestManager.startTest("Scenario No : "+i+" " + scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO, "Scenario started is :-" + scenario.getName());
		//getDriver().navigate().to("http://google.com");
		setUpFramework();
		
		
	}
	
	@After
	public void after(Scenario scenario) throws Exception
	{
		if(scenario.isFailed())
		{
			ExtentTestManager.logFail("Scenario failed");
			ExtentTestManager.addScreenShotOnFailure();
		}
		
		else
		{
			ExtentTestManager.logPass("Scenario passed");
			
		}
		ExtentManager.getReporter().flush();
		quitWebDriver();
	}
	
	
	
	@Given("^launch browser \"([^\"]*)\"$")
	public void launch_browser(String browserName) throws Throwable {
		 openBrowser(browserName);
		    ExtentTestManager.logInfo("Browser opened is -->" + browserName);
	}
	
	@When("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String arg1) throws Throwable {
		getDriver().navigate().to(appURL);
	}
	
	@When("^User search \"([^\"]*)\"$")
	public void user_search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    getDriver().findElement(By.name("q")).sendKeys(arg1);
	}

}
