package softwareTestingMaterial;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class STMTestNGClass {
	
	//This is an intentional comment
	//This is a line from Eclipse
	//sample test
	//4th commit
	//5th commit
	//new line from branch
	
	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.ie.driver",

					"C:\\Users\\BHPANI\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
	   driver = new InternetExplorerDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  System.out.println("kill the browser");
	   driver.quit();
	  }

}
