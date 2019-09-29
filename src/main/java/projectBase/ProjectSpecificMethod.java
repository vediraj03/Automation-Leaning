package projectBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ExcelRead;

public class ProjectSpecificMethod {
	
	
	
	public static String excelFileName;
	public static String sheetName;
	public static ChromeDriver driver;
	
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@AfterMethod
	public void closeApp() {
		
		driver.close();
	}
	
	@DataProvider(name="feachData")
	public Object[][] getData() throws IOException{
		
	Object[][] readData = ExcelRead.readExcelData(excelFileName, sheetName);
		
		return readData;
	

}
}