package pages;

import org.openqa.selenium.WebElement;

import projectBase.ProjectSpecificMethod;

public class NewWindowFindLeadsPage extends ProjectSpecificMethod {
	static String eleFromdata;
	static String eleTodata;
	public NewWindowFindLeadsPage enterFirstNameW(String name){
		WebElement firstName = driver.findElementByXPath("//input[@name='firstName']");
		firstName.sendKeys(name);
		return this;
	}
	
	public NewWindowFindLeadsPage clickOnFindLeadsButton(){
		WebElement findLeads = driver.findElementByXPath("(//button[contains(@type,'button')])[1]");
		findLeads.click();
		return this;
	}
	
	public NewWindowFindLeadsPage clickOnFromFirstValue() throws InterruptedException{
		Thread.sleep(2000);
	WebElement eleFrom = driver.findElementByXPath("(//table[contains(@class,'row-table')]//a)[1]");
	eleFromdata = eleFrom.getText();
	System.out.println(eleFromdata);
	eleFrom.click();
	
	return this;
	
	}
	
	public MergeLeadsPage switchToMergeLeadWindow(){
		driver.switchTo().window(MergeLeadsPage.ls.get(0));
		return new MergeLeadsPage();
	}
	
	public NewWindowFindLeadsPage clickOnToSceondValue() throws InterruptedException{
		Thread.sleep(2000);
		WebElement eleTo = driver.findElementByXPath("(//div[contains(@class,'partyId')]//a)[3]");
		eleTodata = eleTo.getText();
		System.out.println(eleTodata);
		eleTo.click();
		return this;
		
		}


}
