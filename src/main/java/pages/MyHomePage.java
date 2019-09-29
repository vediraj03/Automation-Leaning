package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}
