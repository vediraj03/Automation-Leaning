package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethod;

public class DeleteLeadTestCase extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData()  {
		excelFileName="DeleteLead";
		sheetName ="DeleteLead";
	}
	
	
	@Test(priority=3,dataProvider="fechData")
	public void tC003_DeleteLeadTestCase(String uName, String password,String phoneNo) throws InterruptedException{
		new LoginPage().enterUserName(uName).eneterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnFindLeads().clickOnPhoneLink()
		.enterPhoneNumber(phoneNo)
		.clickOnFindLeadsButton()
		.clickFLeadRecord()
		.clickOnDelete()
		.clickOnFindLeads()
		.enterLeadId()
		.clickOnFindLeadsButton()
		.verifyOnDeletedLeadId();
		
		
	}
	

}
