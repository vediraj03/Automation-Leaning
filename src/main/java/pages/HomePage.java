package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
	
	public MyHomePage CRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
