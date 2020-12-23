package com.assignment.stepDef;
import com.cucumber.grid.pages.calculatorPage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculatorPageStefDef extends BaseSteps {
	calculatorPage calPg=null;
	
	@When("^I check \"([^\"]*)\" page is opened$")
	public void i_check_page_is_opened(String arg1) throws Throwable {
		calculatorPage.verifypreCalcPage();
	    
	}

	@Then("^I see information icon for all fields for KiwiSaver Retirement Calculator$")
	public void i_see_information_icon_for_all_fields_for_KiwiSaver_Retirement_Calculator() throws Throwable {
		calculatorPage.verifyAllInformationIcons();
	   
	}

}
