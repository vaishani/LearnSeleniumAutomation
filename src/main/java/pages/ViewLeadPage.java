package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	public ViewLeadPage VerifyLeadPage(String text){
		verifyTextContainsByXpath("//div[text()[contains(.,'View Lead')]]", text);
		return this;
	}		
	
/*	public LoginPage clickLogOut(){
		clickByLink("Logout");
		return new LoginPage();
	

}*/
}
