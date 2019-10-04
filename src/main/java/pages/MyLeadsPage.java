package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		return new FindLeadsPage();
	}
	public MergeLeadsPage clickOnMergeLeads() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadsPage();
	}
	
	

}
