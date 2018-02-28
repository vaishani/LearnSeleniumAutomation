package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers {
	public MyHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	public CreateLeadPage clickCLlogin(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}

}
