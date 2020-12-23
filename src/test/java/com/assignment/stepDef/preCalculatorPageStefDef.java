package com.assignment.stepDef;
import com.cucumber.grid.pages.preCalculatorPage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;

import cucumber.api.java.en.When;

public class preCalculatorPageStefDef extends BaseSteps{
	
	preCalculatorPage preCalcPg=null;
	

@When("^I check  \"([^\"]*)\" page is opened$")
public void i_check_page_is_opened_Retirement_calculator(String arg1) throws Throwable {
	preCalculatorPage.verifypreCalcPage();
   
}

}
