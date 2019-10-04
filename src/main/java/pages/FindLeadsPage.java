package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import projectBase.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{
	
	static String valueFirstrow;
	public FindLeadsPage enterFirstName(String firstName) {
				
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;
		
	}
	public FindLeadsPage enterLead() {
		driver.findElementByXPath("(//input[contains(@id,'ext-gen')])[30]").sendKeys(NewWindowFindLeadsPage.eleFromdata);
		
		return this;
		
	}
	
	public FindLeadsPage enterPhoneNumber(String phoneNo){
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNo);
		return this;
	}
	
	public FindLeadsPage verifyMergeLead() throws IOException{
	WebElement resultsVal = driver.findElementByXPath("//div[contains(@class,'paging')]");
	String resultsText = resultsVal.getText();
	System.out.println(resultsText);
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File obj = new File("./snap/Meargeimage.png");
	FileUtils.copyFile(src, obj);
	
	if(resultsText.equalsIgnoreCase("No records to display")){
		System.out.println(NewWindowFindLeadsPage.eleFromdata+" is Sucessfully Marged with : " +NewWindowFindLeadsPage.eleTodata);
	}
	else{
		System.out.println(NewWindowFindLeadsPage.eleFromdata+"is not Marged with : " +NewWindowFindLeadsPage.eleTodata);
	}
	
	return this;
	}
	public FindLeadsPage clickOnEmailLink(){
	driver.findElementByXPath("//span[text()='Email']").click();
	return this;
	
	}
	public FindLeadsPage enterEmailId(String email){
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(email);
		return this;
	}
	
	public FindLeadsPage clickOnFindLeadsButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		return this;
	}
	
	public ViewLeadsPage clickFirstLeadRecord() {
		driver.findElement(By.xpath("(//a[text()='Vediraj'])[1]")).click();
		
		return new ViewLeadsPage();
		
	}
	public ViewLeadsPage clickFLeadRecord() throws InterruptedException {
	Thread.sleep(2000);
	WebElement eleFirstrow = driver.findElementByXPath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a");
	
	 valueFirstrow = eleFirstrow.getText();
	
	System.out.println(valueFirstrow);
	eleFirstrow.click();
	return new ViewLeadsPage();
	}
	
	public FindLeadsPage enterLeadId(){
		driver.findElementByXPath("//input[@name='id']").sendKeys(valueFirstrow);
		return this;
		
	}
	public FindLeadsPage verifyOnDeletedLeadId(){
	WebElement elefindLead = driver.findElementByXPath("//div[text()='No records to display']");
	String findLeadText = elefindLead.getText();
	
	if(findLeadText.equalsIgnoreCase("No records to display")){
		System.out.println("Lead record is sucessfully deleted :"+findLeadText);
	}
	else{
		System.out.println("Lead record is not deleted :");
	}
	return this;
	}
	
	public FindLeadsPage clickOnPhoneLink(){
		WebElement PhoneLink = driver.findElementByXPath("//span[text()='Phone']");
		PhoneLink.click();
		return this;
	}
	
	
	


}
