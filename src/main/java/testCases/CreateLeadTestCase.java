package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethod;

public class CreateLeadTestCase extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		excelFileName="TestLeafCreateLead";
		sheetName="Sheet1";
		
	}
	
	@Test(dataProvider="feachData")
	public void tC001_CreateLead(String uName, String password,String CompanyName,String firstName,String lastName) {
		
		new LoginPage()
		.enterUserName(uName)
		.eneterPassword(password)
		.clickLogin()
		.CRM()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(firstName)
		.enetrLastName(lastName)
		.clickCreateLead()
		.verifyCreateLeadFname(firstName);

		
	}
	
	

}
