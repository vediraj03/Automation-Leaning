package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectBase.ProjectSpecificMethod;

public class MergeLeadTestCase extends ProjectSpecificMethod{
	

	@BeforeTest
	public void setData() {
		excelFileName="MergeLead";
		sheetName="Sheet1";
		
	}
	
	@Test(dataProvider="fechData")
	
	public void tc005_MergeLeadTestCase(String uName,String password,String name) throws InterruptedException, IOException{
		
		new LoginPage().enterUserName(uName).eneterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnMergeLeads()
		.clickOnFromLead().switchToNewFindLeadsWindow().enterFirstNameW(name)
		.clickOnFindLeadsButton().clickOnFromFirstValue().switchToMergeLeadWindow()
		.clickOnToLead().switchToNewFindLeadsWindow().enterFirstNameW(name).clickOnFindLeadsButton()
		.clickOnToSceondValue().switchToMergeLeadWindow().clickOnMerge()
		.clickOnFindLeadsMergeP().enterLeadId().clickOnFindLeadsButton().verifyMergeLead();
		
	}

}
