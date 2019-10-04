package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

import projectBase.ProjectSpecificMethod;

public class MergeLeadsPage extends ProjectSpecificMethod{
	
	static List<String> ls;
	
	
	public NewWindowFindLeadsPage switchToNewFindLeadsWindow(){
		Set<String> currentWindows = driver.getWindowHandles();
		ls = new ArrayList<String>(currentWindows);
		driver.switchTo().window(ls.get(1));
		return new NewWindowFindLeadsPage();
	}
	
	public MergeLeadsPage clickOnFromLead(){
		driver.findElementByXPath("//input[@id='partyIdFrom']//following::img[1]").click();
		return this;

	}


	public MergeLeadsPage clickOnToLead(){
		driver.findElementByXPath("//input[@id='partyIdTo']//following::img[1]").click();
		return this;

	}
	public ViewLeadsPage clickOnMerge(){
		driver.findElementByLinkText("Merge").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ViewLeadsPage();

	}

	


}
