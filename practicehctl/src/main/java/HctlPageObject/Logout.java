package HctlPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BasePage {


//	public WebDriver driver;
	private By ClickProfile = By.xpath("//*[@id=\"profileTours\"]/span/p");
  
    public Logout(WebDriver driver) {
	       this.driver = driver;
	    }

	 
	 
	 
    public void Profileclick() {
    	driver.findElement(ClickProfile).click();
    }

    
}
