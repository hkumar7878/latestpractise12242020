package com.cucumber.grid.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.grid.pages.locators.Locators_SearchNewCarPage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;

import utils.SeleniumDriver;

public class Action_NewCarSearchPage extends BaseSteps {
	
	Locators_SearchNewCarPage obj_locators_SearchNewCarPage=null;
	
	
	public Action_NewCarSearchPage()
	{
		this.obj_locators_SearchNewCarPage= new Locators_SearchNewCarPage();
		//PageFactory.initElements(SeleniumDriver.getDriver(), obj_locators_SearchNewCarPage);
		PageFactory.initElements(getDriver(), obj_locators_SearchNewCarPage);
	}
	
	public void selectBudget(String budgetVal)
	{
		obj_locators_SearchNewCarPage.dropDwn_budget.sendKeys(budgetVal);
	}
	
	public void selectVehicleType(String vehicleVal)
	{
		obj_locators_SearchNewCarPage.dropDwn_VehicleType.sendKeys(vehicleVal);
	}
	
	public void clickSearchBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		obj_locators_SearchNewCarPage.btn_Search.click();
	}
	

}
