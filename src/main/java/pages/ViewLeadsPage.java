package pages;

import org.openqa.selenium.By;
import projectBase.ProjectSpecificMethod;

public class ViewLeadsPage extends ProjectSpecificMethod {
	
	public void verifyCreateLeadFname(String vFirstName) {
		String fName = driver.findElementByXPath("(//span[text()='First name']/following::span)[1]").getText();
				
		if(fName.equals(vFirstName)){
			System.out.println("First name "+vFirstName+" is correct : "+fName);
		}

		else{
			System.out.println("First name "+vFirstName+" is incorrect : "+fName);
		}
	

	}
	
	public OpenTapsCRMPage clickEdit() {
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new OpenTapsCRMPage();
	}
	
	public ViewLeadsPage verifyUpatedCompanyName(String uCompanyName) {
		
		String eleUpdatedCompany = driver.findElementByXPath("//span[text()='Company Name']/following::span").getText();
		 String []UpdatedCompany = eleUpdatedCompany.split(" ");
		 System.out.println(UpdatedCompany[0]);
		 
		 if(UpdatedCompany[0].equalsIgnoreCase(uCompanyName)){
			 System.out.println("Updated Company Name is:" +UpdatedCompany[0]);
		 }
		 else {
			 System.out.println("unable to split company name with lead id");
		 }
		
		if(eleUpdatedCompany.contains(uCompanyName)){
			System.out.println("Updated Company Name is:" +eleUpdatedCompany);
		}
			
		else {
			System.out.println("updated Name is not repleated");
		}
		
		return this;
		
	}
	

}
