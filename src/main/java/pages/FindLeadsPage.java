package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{
	
	public FindLeadsPage enterFirstName(String firstName) {
				
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;
		
	}
	
	public FindLeadsPage clickOnFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		return this;
	}
	
	public ViewLeadsPage clickFirstLeadRecord() {
		driver.findElement(By.xpath("(//a[text()='Vediraj'])[1]")).click();
		
		return new ViewLeadsPage();
		
	}
	

}
