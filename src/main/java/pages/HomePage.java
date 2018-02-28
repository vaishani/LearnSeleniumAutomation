package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers {
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	public HomePage verifyLoginName(String text){
		verifyTextContainsByXpath("//h2[text()[contains(.,'Demo')]]", text);
		return this;
	}	
	
	public MyHomePage clickCRMSFA(){
		clickByLink("CRM/SFA");
		return new MyHomePage(driver, test);
	}
	
	
	/*public LoginPage clickLogOut(){
		clickByClassName("decorativeSubmit");
		return new LoginPage();
	}*/
}
