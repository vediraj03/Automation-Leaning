package pages;

import org.openqa.selenium.WebElement;

import projectBase.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	
	static String firstNameDuptext ;
	
	public ViewLeadsPage clickOnCreateLead(){
	
	WebElement firstNameDup = driver.findElementByXPath("//input[@id='createLeadForm_firstName']");
	
	 firstNameDuptext = firstNameDup.getAttribute("value");
	 System.out.println(firstNameDuptext);
	String title = driver.getTitle();
	if(title.contains("Duplicate Lead")){
		System.out.println("Title is verified :"+title);
	}
			
	driver.findElementByXPath("//input[@name='submitButton']").click();
	
	return new ViewLeadsPage();
}
	
}