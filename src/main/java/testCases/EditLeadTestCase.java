package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethod;

public class EditLeadTestCase extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		excelFileName="EditLead";
		sheetName ="EditLead";
	}
	
	@Test(priority=2,dataProvider="fechData")
	public void tc002_EditLead(String uName,String password,String firstName,String uCompanyName) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.eneterPassword(password)
		.clickLogin()
		.clickOnCRMLink()
		.clickLeads()
		.clickOnFindLeads()
		.enterFirstName(firstName)
		.clickOnFindLeadsButton()
		.clickFirstLeadRecord()
		.clickEdit()
		.updateCompanyName(uCompanyName)
		.clickUpadte()
		.verifyUpatedCompanyName(uCompanyName);
		
				
	}
	
	

}
