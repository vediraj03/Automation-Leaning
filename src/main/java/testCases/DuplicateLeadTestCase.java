package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethod;

public class DuplicateLeadTestCase extends ProjectSpecificMethod {
	
	
	@BeforeTest
	public void setData() {
		excelFileName="DuplicateLead";
		sheetName="Sheet1";
		
	}
	
	@Test(dataProvider="fechData")
	public void tc004_DuplicateLeadTestCase(String uName,String password,String email ) throws InterruptedException{
		
		new LoginPage().enterUserName(uName).eneterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnFindLeads()
		.clickOnEmailLink().enterEmailId(email).clickOnFindLeadsButton().clickFLeadRecord()
		.clickDuplicate().clickOnCreateLead().verifyDuplicateLead();
		
	}

}
