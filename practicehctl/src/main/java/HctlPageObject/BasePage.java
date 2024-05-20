package HctlPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	
    protected WebDriver driver;



	@BeforeClass
	public void Setup() {
	WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	
//     System.setProperty("webdriver.chrome.driver", "C:/Users/Laptop master/chromedriver-win64/chromedriver.exe");

	driver = new ChromeDriver();
     driver.get("https://uat.healthcaretalentlink.com/login");
	
	}

	
    

}
