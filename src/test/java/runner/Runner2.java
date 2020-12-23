package runner;

import org.testng.annotations.Test;

import com.cucumber.parallel.baseSteps.steps.BaseSteps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src/test/resources/KiwiSaveRetirementCalculator",
		glue="com.assignment.stepDef"	
		)
public class Runner2 extends BaseSteps{
	
	/*
	 * @Before public void openBrowser() { System.out.println
	 * ("INSIDE BEFORE HOOK"); //getDriver().navigate().to("http://google.com"); }
	 * 
	 * @After public void tearDown() { System.out.println ("INSIDE AFTER HOOK");
	 * getDriver().quit(); }
	 */
	
	
	
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}
}
