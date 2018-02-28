package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class CLeadTC_001 extends LeafTapsWrappers {
@BeforeClass
	public void createLead() {
		testCaseName = "CLeadTC_001";
		testDescription = "Create Lead";
		category = "Smoke";
		authors= "Kausalya";
		browserName = "chrome";
		dataSheetName ="CreateTD";
	}
@Test (dataProvider="fetchData")
public void doCreateLead(String username, String password, String Fname, String Lname, String Cname) {
		new LoginPage(driver, test)
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
	    .clickCRMSFA()
	    .clickCLlogin()
	    .enterCompanyName(Cname)
	    .enterFirstName(Fname)
	    .enterLastName(Lname)
	    .clickCreateLead()
	    .VerifyLeadPage("View Lead");
	
}

}
