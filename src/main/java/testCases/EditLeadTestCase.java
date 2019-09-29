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
	
	@Test(dataProvider="feachData")
	public void tc002_EditLead(String uName,String password,String firstName,String uCompanyName) {
		
		new LoginPage()
		.enterUserName(uName)
		.eneterPassword(password)
		.clickLogin()
		.CRM()
		.clickLeads()
		.clickOnFindLeads()
		.enterFirstName(firstName)
		.clickOnFindLeads()
		.clickFirstLeadRecord()
		.clickEdit()
		.updateCompanyName(uCompanyName)
		.clickUpadte()
		.verifyUpatedCompanyName(uCompanyName);
		
				
	}
	
	

}
