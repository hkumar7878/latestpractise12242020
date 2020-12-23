package com.cucumber.grid.pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.parallel.baseSteps.steps.BaseSteps;
import com.cucumber.parallel.extent.ExtentTestManager;

import utils.generalUti;

public class calculatorPage extends BaseSteps{
	
	@FindBy(xpath="//h1[contains(text(),'KiwiSaver Retirement Calculator')]")
	public static WebElement hdPage;
	static boolean flag;
	public static final By lblOLORewardPage = By.xpath("//label[text()='Employment status']/../../..//following-sibling::div[contains(@class,'field-cell field-controls')]//div[contains(@class,'field-info ng-scope')]//i");
	//By by=By.xpath("//label[text()='"+s1+"']/../../..//following-sibling::div[contains(@class,'field-cell field-controls')]//div[contains(@class,'field-info ng-scope')]//span[contains(text(),'View help for this field')]";
	public static void verifypreCalcPage() {
		try {
			generalUti.waitUntilElementVisible(hdPage);
			Assert.assertTrue("User fails to route to calculator page", generalUti.isElementVisible(hdPage));
			ExtentTestManager.logPass("User successfully routes to calculator page");
			
		}catch(Exception e) {
			e.printStackTrace();
			ExtentTestManager.logFail("User fails to lands on calculator page");
		}
	}
	
	
	public static void verifyAllInformationIcons()
	{
		try 
		{
		//List<String> helpIcons = Arrays.asList("CurrentAge", "Employment status", "Current KiwiSaver balance", "Voluntary contributions","Risk profile","Savings goal at retirement");
		List<String> helpIcons = Arrays.asList("Current age");
		for(String s1: helpIcons) 
		{
			String s2=s1;
			//Thread.sleep(10000);
			getDriver().findElement(By.xpath("//label[text()='Employment status']/../../..//following-sibling::div[contains(@class,'field-cell field-controls')]//div[contains(@class,'field-info ng-scope')]//button")).click();
			WebDriverWait wait = new WebDriverWait(getDriver(),20);
			//wait.until(ExpectedConditions.presenceOfElementLocated(lblOLORewardPage));
		if(generalUti.isElementVisible(getDriver().findElement(By.xpath("//label[text()='"+s1+"']/../../..//following-sibling::div[contains(@class,'field-cell field-controls')]//div[contains(@class,'field-info ng-scope')]//span[contains(text(),'View help for this field')]")))) 
			flag=true;
		//label[text()='Current age']/../../..//following-sibling::div[contains(@class,'field-cell field-controls')]//div[contains(@class,'field-info ng-scope')]//span[contains(text(),'View help for this field')] 
		else
			flag=false;
		}
	
		}

		catch(Exception e)
		{
			e.printStackTrace();
			ExtentTestManager.logFail("");
		}
		}	
	
}
