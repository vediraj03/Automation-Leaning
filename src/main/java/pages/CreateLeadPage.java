package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	
	public CreateLeadPage enterCompanyName(String CompanyName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(CompanyName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage enetrLastName(String lastName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lastName);
		return this;
		
	}
	
	public CreateLeadPage enetrPhoneNumber(String phoneNo) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phoneNo);
		return this;
		
	}
	public CreateLeadPage enetrEmailId(String email) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
		return this;
		
	}
	
	public ViewLeadsPage clickCreateLead() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewLeadsPage();
	}


}
