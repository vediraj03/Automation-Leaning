package pages;

import org.openqa.selenium.WebElement;

import projectBase.ProjectSpecificMethod;

public class OpenTapsCRMPage extends ProjectSpecificMethod{
	
	public OpenTapsCRMPage updateCompanyName(String uCompanyName) {
		WebElement eleEditCompany = driver.findElementById("updateLeadForm_companyName");
		eleEditCompany.clear();
		eleEditCompany.sendKeys(uCompanyName);
		return this;
		
	}
	
	public ViewLeadsPage clickUpadte() {
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLeadsPage();
		
	}

}
