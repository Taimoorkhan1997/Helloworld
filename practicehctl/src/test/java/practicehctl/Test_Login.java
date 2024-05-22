package practicehctl;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HctlPageObject.BasePage;
import HctlPageObject.LoginPage;

public class Test_Login extends BasePage{

		

	
	@Test
        public void loginTest() {

            LoginPage loginPage = new LoginPage(driver);
            driver.manage().window().maximize();
//            Thread.sleep(5000);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            loginPage.setUsername("test.company1@yopmail.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            loginPage.setPassword("Test123#");
            loginPage.clickLogin();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


//            Thread.sleep(5000);

        }
		
		
		
	

		
		
		
		
        // Add assertion for successful login
    }


	
	

