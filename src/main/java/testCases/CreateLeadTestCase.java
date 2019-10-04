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
	
	@Test(priority=1,dataProvider="fechData")
	public void tC001_CreateLead(String uName, String password,String CompanyName,String firstName,String lastName,String phoneNo, String email) {
		
		new LoginPage()
		.enterUserName(uName)
		.eneterPassword(password)
		.clickLogin()
		.clickOnCRMLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(firstName)
		.enetrLastName(lastName)
		.enetrPhoneNumber(phoneNo)
		.enetrEmailId(email)
		.clickCreateLead()
		.verifyCreateLeadFname(firstName);

		
	}
	
	

}
