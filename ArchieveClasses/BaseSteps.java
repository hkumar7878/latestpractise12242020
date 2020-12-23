package com.cucumber.parallel.google.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BaseSteps {
	
	private WebDriver driver;
	public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return dr.get();
	}
	
	public static void setDriver(WebDriver driver)
	{
		dr.set(driver);
	}
	 
	protected void startWebDriver(String browser)
	{
		if(browser.equals("firefox"))
		{
			System.out.println("Launching Firefox browser");
			FirefoxOptions firefox_options  = new FirefoxOptions();
			firefox_options.setCapability("marionette", true);
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Browser Exes/geckodriver.exe");
			driver= new FirefoxDriver(firefox_options);	
			
		}
		else 
		{
			System.out.println("Launching Chrome browser");	
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Browser Exes/chromedriver.exe");
			driver= new ChromeDriver();
		}
		setDriver(driver);
		getDriver().manage().window().maximize();
	}
	
	protected void navigate(String url)
	{
		getDriver().navigate().to(url);
	}
	
	protected void quitWebDriver()
	{
		getDriver().quit();
	}

}
