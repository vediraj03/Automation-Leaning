package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
	public LoginPage eneterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage();
		
	}

}
